/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.scp;

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
public class ScpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/directoryName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(25);
        props.add("useUserKnownHostsFile");
        props.add("disconnect");
        props.add("disconnectOnBatchComplete");
        props.add("moveExistingFileStrategy");
        props.add("fileName");
        props.add("strictHostKeyChecking");
        props.add("timeout");
        props.add("flatten");
        props.add("password");
        props.add("jailStartingDirectory");
        props.add("privateKeyFile");
        props.add("host");
        props.add("connectTimeout");
        props.add("ciphers");
        props.add("chmod");
        props.add("privateKeyBytes");
        props.add("directoryName");
        props.add("allowNullBody");
        props.add("privateKeyFilePassphrase");
        props.add("soTimeout");
        props.add("lazyStartProducer");
        props.add("port");
        props.add("preferredAuthentications");
        props.add("knownHostsFile");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(7);
        secretProps.add("password");
        secretProps.add("privateKeyFile");
        secretProps.add("preferredAuthentications");
        secretProps.add("privateKeyFilePassphrase");
        secretProps.add("privateKeyBytes");
        secretProps.add("knownHostsFile");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "scp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "directoryName", null, false, copy);
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
    public boolean isLenientProperties() {
        return false;
    }
}

