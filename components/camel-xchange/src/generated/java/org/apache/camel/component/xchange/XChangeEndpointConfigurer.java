/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xchange;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class XChangeEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XChangeEndpoint target = (XChangeEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "currency": target.getConfiguration().setCurrency(property(camelContext, org.knowm.xchange.currency.Currency.class, value)); return true;
        case "currencypair":
        case "currencyPair": target.getConfiguration().setCurrencyPair(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "method": target.getConfiguration().setMethod(property(camelContext, org.apache.camel.component.xchange.XChangeConfiguration.XChangeMethod.class, value)); return true;
        case "service": target.getConfiguration().setService(property(camelContext, org.apache.camel.component.xchange.XChangeConfiguration.XChangeService.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "currency": return org.knowm.xchange.currency.Currency.class;
        case "currencypair":
        case "currencyPair": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "method": return org.apache.camel.component.xchange.XChangeConfiguration.XChangeMethod.class;
        case "service": return org.apache.camel.component.xchange.XChangeConfiguration.XChangeService.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XChangeEndpoint target = (XChangeEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "currency": return target.getConfiguration().getCurrency();
        case "currencypair":
        case "currencyPair": return target.getConfiguration().getCurrencyPair();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "method": return target.getConfiguration().getMethod();
        case "service": return target.getConfiguration().getService();
        default: return null;
        }
    }
}

