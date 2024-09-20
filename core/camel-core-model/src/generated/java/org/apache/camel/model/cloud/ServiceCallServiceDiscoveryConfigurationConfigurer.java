/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.cloud;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.model.cloud.ServiceCallServiceDiscoveryConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class ServiceCallServiceDiscoveryConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("Id", java.lang.String.class);
        map.put("Properties", java.util.List.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.model.cloud.ServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "properties": target.setProperties(property(camelContext, java.util.List.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "id": return java.lang.String.class;
        case "properties": return java.util.List.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.model.cloud.ServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "id": return target.getId();
        case "properties": return target.getProperties();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "properties": return org.apache.camel.model.PropertyDefinition.class;
        default: return null;
        }
    }
}

