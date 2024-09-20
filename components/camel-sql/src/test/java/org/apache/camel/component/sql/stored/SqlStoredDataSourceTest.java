/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.sql.stored;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spi.Registry;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SqlStoredDataSourceTest extends CamelTestSupport {

    private EmbeddedDatabase db;

    @Override
    protected void bindToRegistry(Registry registry) throws Exception {
        // START SNIPPET: e2
        // this is the database we create with some initial data for our unit test
        db = new EmbeddedDatabaseBuilder()
                .setName(getClass().getSimpleName())
                .setType(EmbeddedDatabaseType.DERBY)
                .addScript("sql/storedProcedureTest.sql").build();
        // END SNIPPET: e2

        registry.bind("jdbc/myDataSource", db);
    }

    @Override
    public void doPostTearDown() throws Exception {
        if (db != null) {
            db.shutdown();
        }
    }

    @Test
    public void shouldExecuteStoredProcedure() throws InterruptedException {
        MockEndpoint mock = getMockEndpoint("mock:query");
        mock.expectedMessageCount(1);

        template.requestBody("direct:query", "");

        MockEndpoint.assertIsSatisfied(context);

        Exchange exchange = mock.getExchanges().get(0);
        assertNotNull(exchange.getIn().getHeader(SqlStoredConstants.SQL_STORED_UPDATE_COUNT));
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // required for the sql component

                from("direct:query").to("sql-stored:NILADIC()?dataSource=#jdbc/myDataSource").to("mock:query");
            }
        };
    }
}
