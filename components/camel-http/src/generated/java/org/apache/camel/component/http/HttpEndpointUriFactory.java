/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.http;

import javax.annotation.processing.Generated;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateEndpointUriFactoryMojo")
public class HttpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = "://httpUri";
    private static final String[] SCHEMES = new String[]{"http", "https"};

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(55);
        props.add("authDomain");
        props.add("authHost");
        props.add("authMethod");
        props.add("authMethodPriority");
        props.add("authPassword");
        props.add("authUsername");
        props.add("authenticationPreemptive");
        props.add("bridgeEndpoint");
        props.add("clearExpiredCookies");
        props.add("clientBuilder");
        props.add("clientConnectionManager");
        props.add("connectionClose");
        props.add("connectionsPerRoute");
        props.add("cookieHandler");
        props.add("cookieStore");
        props.add("copyHeaders");
        props.add("customHostHeader");
        props.add("deleteWithBody");
        props.add("disableStreamCache");
        props.add("followRedirects");
        props.add("getWithBody");
        props.add("headerFilterStrategy");
        props.add("httpClient");
        props.add("httpClientConfigurer");
        props.add("httpClientOptions");
        props.add("httpConnectionOptions");
        props.add("httpContext");
        props.add("httpMethod");
        props.add("httpUri");
        props.add("ignoreResponseBody");
        props.add("lazyStartProducer");
        props.add("maxTotalConnections");
        props.add("oauth2ClientId");
        props.add("oauth2ClientSecret");
        props.add("oauth2Scope");
        props.add("oauth2TokenEndpoint");
        props.add("okStatusCodeRange");
        props.add("preserveHostHeader");
        props.add("proxyAuthDomain");
        props.add("proxyAuthHost");
        props.add("proxyAuthMethod");
        props.add("proxyAuthNtHost");
        props.add("proxyAuthPassword");
        props.add("proxyAuthPort");
        props.add("proxyAuthScheme");
        props.add("proxyAuthUsername");
        props.add("proxyHost");
        props.add("proxyPort");
        props.add("skipRequestHeaders");
        props.add("skipResponseHeaders");
        props.add("sslContextParameters");
        props.add("throwExceptionOnFailure");
        props.add("useSystemProperties");
        props.add("userAgent");
        props.add("x509HostnameVerifier");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(6);
        secretProps.add("authPassword");
        secretProps.add("authUsername");
        secretProps.add("oauth2ClientId");
        secretProps.add("oauth2ClientSecret");
        secretProps.add("proxyAuthPassword");
        secretProps.add("proxyAuthUsername");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(2);
        prefixes.add("httpClient.");
        prefixes.add("httpConnection.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        for (String s : SCHEMES) {
            if (s.equals(scheme)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "httpUri", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return true;
    }
}

