/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.box.BoxCommentsManagerEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class BoxCommentsManagerEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessTokenCache", com.box.sdk.IAccessTokenCache.class);
        map.put("ApiName", org.apache.camel.component.box.internal.BoxApiName.class);
        map.put("AuthenticationType", java.lang.String.class);
        map.put("ClientId", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("CommentId", java.lang.String.class);
        map.put("EncryptionAlgorithm", com.box.sdk.EncryptionAlgorithm.class);
        map.put("EnterpriseId", java.lang.String.class);
        map.put("FileId", java.lang.String.class);
        map.put("HttpParams", java.util.Map.class);
        map.put("MaxCacheEntries", int.class);
        map.put("Message", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PrivateKeyFile", java.lang.String.class);
        map.put("PrivateKeyPassword", java.lang.String.class);
        map.put("PublicKeyId", java.lang.String.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("UserId", java.lang.String.class);
        map.put("UserName", java.lang.String.class);
        map.put("UserPassword", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.box.BoxCommentsManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxCommentsManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "accessTokenCache": target.setAccessTokenCache(property(camelContext, com.box.sdk.IAccessTokenCache.class, value)); return true;
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.box.internal.BoxApiName.class, value)); return true;
        case "authenticationtype":
        case "authenticationType": target.setAuthenticationType(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "commentid":
        case "commentId": target.setCommentId(property(camelContext, java.lang.String.class, value)); return true;
        case "encryptionalgorithm":
        case "encryptionAlgorithm": target.setEncryptionAlgorithm(property(camelContext, com.box.sdk.EncryptionAlgorithm.class, value)); return true;
        case "enterpriseid":
        case "enterpriseId": target.setEnterpriseId(property(camelContext, java.lang.String.class, value)); return true;
        case "fileid":
        case "fileId": target.setFileId(property(camelContext, java.lang.String.class, value)); return true;
        case "httpparams":
        case "httpParams": target.setHttpParams(property(camelContext, java.util.Map.class, value)); return true;
        case "maxcacheentries":
        case "maxCacheEntries": target.setMaxCacheEntries(property(camelContext, int.class, value)); return true;
        case "message": target.setMessage(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeyfile":
        case "privateKeyFile": target.setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassword":
        case "privateKeyPassword": target.setPrivateKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "publickeyid":
        case "publicKeyId": target.setPublicKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "userid":
        case "userId": target.setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "userpassword":
        case "userPassword": target.setUserPassword(property(camelContext, java.lang.String.class, value)); return true;
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
        case "accesstokencache":
        case "accessTokenCache": return com.box.sdk.IAccessTokenCache.class;
        case "apiname":
        case "apiName": return org.apache.camel.component.box.internal.BoxApiName.class;
        case "authenticationtype":
        case "authenticationType": return java.lang.String.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "commentid":
        case "commentId": return java.lang.String.class;
        case "encryptionalgorithm":
        case "encryptionAlgorithm": return com.box.sdk.EncryptionAlgorithm.class;
        case "enterpriseid":
        case "enterpriseId": return java.lang.String.class;
        case "fileid":
        case "fileId": return java.lang.String.class;
        case "httpparams":
        case "httpParams": return java.util.Map.class;
        case "maxcacheentries":
        case "maxCacheEntries": return int.class;
        case "message": return java.lang.String.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "privatekeyfile":
        case "privateKeyFile": return java.lang.String.class;
        case "privatekeypassword":
        case "privateKeyPassword": return java.lang.String.class;
        case "publickeyid":
        case "publicKeyId": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "userid":
        case "userId": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "userpassword":
        case "userPassword": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.box.BoxCommentsManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxCommentsManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "accessTokenCache": return target.getAccessTokenCache();
        case "apiname":
        case "apiName": return target.getApiName();
        case "authenticationtype":
        case "authenticationType": return target.getAuthenticationType();
        case "clientid":
        case "clientId": return target.getClientId();
        case "clientsecret":
        case "clientSecret": return target.getClientSecret();
        case "commentid":
        case "commentId": return target.getCommentId();
        case "encryptionalgorithm":
        case "encryptionAlgorithm": return target.getEncryptionAlgorithm();
        case "enterpriseid":
        case "enterpriseId": return target.getEnterpriseId();
        case "fileid":
        case "fileId": return target.getFileId();
        case "httpparams":
        case "httpParams": return target.getHttpParams();
        case "maxcacheentries":
        case "maxCacheEntries": return target.getMaxCacheEntries();
        case "message": return target.getMessage();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "privatekeyfile":
        case "privateKeyFile": return target.getPrivateKeyFile();
        case "privatekeypassword":
        case "privateKeyPassword": return target.getPrivateKeyPassword();
        case "publickeyid":
        case "publicKeyId": return target.getPublicKeyId();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "userid":
        case "userId": return target.getUserId();
        case "username":
        case "userName": return target.getUserName();
        case "userpassword":
        case "userPassword": return target.getUserPassword();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpparams":
        case "httpParams": return java.lang.Object.class;
        default: return null;
        }
    }
}

