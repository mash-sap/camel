/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

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
@SuppressWarnings("unchecked")
public class DebeziumMongodbComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration getOrCreateConfiguration(DebeziumMongodbComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumMongodbComponent target = (DebeziumMongodbComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "capturemode":
        case "captureMode": getOrCreateConfiguration(target).setCaptureMode(property(camelContext, java.lang.String.class, value)); return true;
        case "collectionexcludelist":
        case "collectionExcludeList": getOrCreateConfiguration(target).setCollectionExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "collectionincludelist":
        case "collectionIncludeList": getOrCreateConfiguration(target).setCollectionIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration.class, value)); return true;
        case "converters": getOrCreateConfiguration(target).setConverters(property(camelContext, java.lang.String.class, value)); return true;
        case "cursormaxawaittimems":
        case "cursorMaxAwaitTimeMs": getOrCreateConfiguration(target).setCursorMaxAwaitTimeMs(property(camelContext, int.class, value)); return true;
        case "custommetrictags":
        case "customMetricTags": getOrCreateConfiguration(target).setCustomMetricTags(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseexcludelist":
        case "databaseExcludeList": getOrCreateConfiguration(target).setDatabaseExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseincludelist":
        case "databaseIncludeList": getOrCreateConfiguration(target).setDatabaseIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "errorsmaxretries":
        case "errorsMaxRetries": getOrCreateConfiguration(target).setErrorsMaxRetries(property(camelContext, int.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": getOrCreateConfiguration(target).setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "fieldexcludelist":
        case "fieldExcludeList": getOrCreateConfiguration(target).setFieldExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "fieldrenames":
        case "fieldRenames": getOrCreateConfiguration(target).setFieldRenames(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": getOrCreateConfiguration(target).setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": getOrCreateConfiguration(target).setIncrementalSnapshotWatermarkingStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": getOrCreateConfiguration(target).setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": getOrCreateConfiguration(target).setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": getOrCreateConfiguration(target).setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": getOrCreateConfiguration(target).setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": getOrCreateConfiguration(target).setMaxQueueSizeInBytes(property(camelContext, long.class, value)); return true;
        case "mongodbauthsource":
        case "mongodbAuthsource": getOrCreateConfiguration(target).setMongodbAuthsource(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbconnecttimeoutms":
        case "mongodbConnectTimeoutMs": getOrCreateConfiguration(target).setMongodbConnectTimeoutMs(property(camelContext, int.class, value)); return true;
        case "mongodbconnectionmode":
        case "mongodbConnectionMode": getOrCreateConfiguration(target).setMongodbConnectionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbconnectionstring":
        case "mongodbConnectionString": getOrCreateConfiguration(target).setMongodbConnectionString(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbheartbeatfrequencyms":
        case "mongodbHeartbeatFrequencyMs": getOrCreateConfiguration(target).setMongodbHeartbeatFrequencyMs(property(camelContext, int.class, value)); return true;
        case "mongodbpassword":
        case "mongodbPassword": getOrCreateConfiguration(target).setMongodbPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbpollintervalms":
        case "mongodbPollIntervalMs": getOrCreateConfiguration(target).setMongodbPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "mongodbserverselectiontimeoutms":
        case "mongodbServerSelectionTimeoutMs": getOrCreateConfiguration(target).setMongodbServerSelectionTimeoutMs(property(camelContext, int.class, value)); return true;
        case "mongodbsockettimeoutms":
        case "mongodbSocketTimeoutMs": getOrCreateConfiguration(target).setMongodbSocketTimeoutMs(property(camelContext, int.class, value)); return true;
        case "mongodbsslenabled":
        case "mongodbSslEnabled": getOrCreateConfiguration(target).setMongodbSslEnabled(property(camelContext, boolean.class, value)); return true;
        case "mongodbsslinvalidhostnameallowed":
        case "mongodbSslInvalidHostnameAllowed": getOrCreateConfiguration(target).setMongodbSslInvalidHostnameAllowed(property(camelContext, boolean.class, value)); return true;
        case "mongodbuser":
        case "mongodbUser": getOrCreateConfiguration(target).setMongodbUser(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationenabledchannels":
        case "notificationEnabledChannels": getOrCreateConfiguration(target).setNotificationEnabledChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationsinktopicname":
        case "notificationSinkTopicName": getOrCreateConfiguration(target).setNotificationSinkTopicName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": getOrCreateConfiguration(target).setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": getOrCreateConfiguration(target).setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": getOrCreateConfiguration(target).setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": getOrCreateConfiguration(target).setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": getOrCreateConfiguration(target).setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": getOrCreateConfiguration(target).setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": getOrCreateConfiguration(target).setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": getOrCreateConfiguration(target).setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": getOrCreateConfiguration(target).setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "postprocessors":
        case "postProcessors": getOrCreateConfiguration(target).setPostProcessors(property(camelContext, java.lang.String.class, value)); return true;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": getOrCreateConfiguration(target).setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "queryfetchsize":
        case "queryFetchSize": getOrCreateConfiguration(target).setQueryFetchSize(property(camelContext, int.class, value)); return true;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": getOrCreateConfiguration(target).setRetriableRestartConnectorWaitMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": getOrCreateConfiguration(target).setSchemaHistoryInternalFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": getOrCreateConfiguration(target).setSchemaNameAdjustmentMode(property(camelContext, java.lang.String.class, value)); return true;
        case "signaldatacollection":
        case "signalDataCollection": getOrCreateConfiguration(target).setSignalDataCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "signalenabledchannels":
        case "signalEnabledChannels": getOrCreateConfiguration(target).setSignalEnabledChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "signalpollintervalms":
        case "signalPollIntervalMs": getOrCreateConfiguration(target).setSignalPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "skippedoperations":
        case "skippedOperations": getOrCreateConfiguration(target).setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotcollectionfilteroverrides":
        case "snapshotCollectionFilterOverrides": getOrCreateConfiguration(target).setSnapshotCollectionFilterOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": getOrCreateConfiguration(target).setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": getOrCreateConfiguration(target).setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": getOrCreateConfiguration(target).setSnapshotIncludeCollectionList(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": getOrCreateConfiguration(target).setSnapshotMaxThreads(property(camelContext, int.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": getOrCreateConfiguration(target).setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": getOrCreateConfiguration(target).setSourceinfoStructMaker(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": getOrCreateConfiguration(target).setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        case "topicnamingstrategy":
        case "topicNamingStrategy": getOrCreateConfiguration(target).setTopicNamingStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "topicprefix":
        case "topicPrefix": getOrCreateConfiguration(target).setTopicPrefix(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.util.Map.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "capturemode":
        case "captureMode": return java.lang.String.class;
        case "collectionexcludelist":
        case "collectionExcludeList": return java.lang.String.class;
        case "collectionincludelist":
        case "collectionIncludeList": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration.class;
        case "converters": return java.lang.String.class;
        case "cursormaxawaittimems":
        case "cursorMaxAwaitTimeMs": return int.class;
        case "custommetrictags":
        case "customMetricTags": return java.lang.String.class;
        case "databaseexcludelist":
        case "databaseExcludeList": return java.lang.String.class;
        case "databaseincludelist":
        case "databaseIncludeList": return java.lang.String.class;
        case "errorsmaxretries":
        case "errorsMaxRetries": return int.class;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return java.lang.String.class;
        case "fieldexcludelist":
        case "fieldExcludeList": return java.lang.String.class;
        case "fieldrenames":
        case "fieldRenames": return java.lang.String.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return int.class;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return java.lang.String.class;
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": return java.lang.String.class;
        case "internalkeyconverter":
        case "internalKeyConverter": return java.lang.String.class;
        case "internalvalueconverter":
        case "internalValueConverter": return java.lang.String.class;
        case "maxbatchsize":
        case "maxBatchSize": return int.class;
        case "maxqueuesize":
        case "maxQueueSize": return int.class;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return long.class;
        case "mongodbauthsource":
        case "mongodbAuthsource": return java.lang.String.class;
        case "mongodbconnecttimeoutms":
        case "mongodbConnectTimeoutMs": return int.class;
        case "mongodbconnectionmode":
        case "mongodbConnectionMode": return java.lang.String.class;
        case "mongodbconnectionstring":
        case "mongodbConnectionString": return java.lang.String.class;
        case "mongodbheartbeatfrequencyms":
        case "mongodbHeartbeatFrequencyMs": return int.class;
        case "mongodbpassword":
        case "mongodbPassword": return java.lang.String.class;
        case "mongodbpollintervalms":
        case "mongodbPollIntervalMs": return long.class;
        case "mongodbserverselectiontimeoutms":
        case "mongodbServerSelectionTimeoutMs": return int.class;
        case "mongodbsockettimeoutms":
        case "mongodbSocketTimeoutMs": return int.class;
        case "mongodbsslenabled":
        case "mongodbSslEnabled": return boolean.class;
        case "mongodbsslinvalidhostnameallowed":
        case "mongodbSslInvalidHostnameAllowed": return boolean.class;
        case "mongodbuser":
        case "mongodbUser": return java.lang.String.class;
        case "notificationenabledchannels":
        case "notificationEnabledChannels": return java.lang.String.class;
        case "notificationsinktopicname":
        case "notificationSinkTopicName": return java.lang.String.class;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return java.lang.String.class;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return long.class;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return long.class;
        case "offsetstorage":
        case "offsetStorage": return java.lang.String.class;
        case "offsetstoragefilename":
        case "offsetStorageFileName": return java.lang.String.class;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return int.class;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return int.class;
        case "offsetstoragetopic":
        case "offsetStorageTopic": return java.lang.String.class;
        case "pollintervalms":
        case "pollIntervalMs": return long.class;
        case "postprocessors":
        case "postProcessors": return java.lang.String.class;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return boolean.class;
        case "queryfetchsize":
        case "queryFetchSize": return int.class;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return long.class;
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": return java.lang.String.class;
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": return java.lang.String.class;
        case "signaldatacollection":
        case "signalDataCollection": return java.lang.String.class;
        case "signalenabledchannels":
        case "signalEnabledChannels": return java.lang.String.class;
        case "signalpollintervalms":
        case "signalPollIntervalMs": return long.class;
        case "skippedoperations":
        case "skippedOperations": return java.lang.String.class;
        case "snapshotcollectionfilteroverrides":
        case "snapshotCollectionFilterOverrides": return java.lang.String.class;
        case "snapshotdelayms":
        case "snapshotDelayMs": return long.class;
        case "snapshotfetchsize":
        case "snapshotFetchSize": return int.class;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return java.lang.String.class;
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": return int.class;
        case "snapshotmode":
        case "snapshotMode": return java.lang.String.class;
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": return java.lang.String.class;
        case "tombstonesondelete":
        case "tombstonesOnDelete": return boolean.class;
        case "topicnamingstrategy":
        case "topicNamingStrategy": return java.lang.String.class;
        case "topicprefix":
        case "topicPrefix": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumMongodbComponent target = (DebeziumMongodbComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return getOrCreateConfiguration(target).getAdditionalProperties();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "capturemode":
        case "captureMode": return getOrCreateConfiguration(target).getCaptureMode();
        case "collectionexcludelist":
        case "collectionExcludeList": return getOrCreateConfiguration(target).getCollectionExcludeList();
        case "collectionincludelist":
        case "collectionIncludeList": return getOrCreateConfiguration(target).getCollectionIncludeList();
        case "configuration": return target.getConfiguration();
        case "converters": return getOrCreateConfiguration(target).getConverters();
        case "cursormaxawaittimems":
        case "cursorMaxAwaitTimeMs": return getOrCreateConfiguration(target).getCursorMaxAwaitTimeMs();
        case "custommetrictags":
        case "customMetricTags": return getOrCreateConfiguration(target).getCustomMetricTags();
        case "databaseexcludelist":
        case "databaseExcludeList": return getOrCreateConfiguration(target).getDatabaseExcludeList();
        case "databaseincludelist":
        case "databaseIncludeList": return getOrCreateConfiguration(target).getDatabaseIncludeList();
        case "errorsmaxretries":
        case "errorsMaxRetries": return getOrCreateConfiguration(target).getErrorsMaxRetries();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return getOrCreateConfiguration(target).getEventProcessingFailureHandlingMode();
        case "fieldexcludelist":
        case "fieldExcludeList": return getOrCreateConfiguration(target).getFieldExcludeList();
        case "fieldrenames":
        case "fieldRenames": return getOrCreateConfiguration(target).getFieldRenames();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return getOrCreateConfiguration(target).getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return getOrCreateConfiguration(target).getHeartbeatTopicsPrefix();
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": return getOrCreateConfiguration(target).getIncrementalSnapshotWatermarkingStrategy();
        case "internalkeyconverter":
        case "internalKeyConverter": return getOrCreateConfiguration(target).getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return getOrCreateConfiguration(target).getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return getOrCreateConfiguration(target).getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return getOrCreateConfiguration(target).getMaxQueueSize();
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return getOrCreateConfiguration(target).getMaxQueueSizeInBytes();
        case "mongodbauthsource":
        case "mongodbAuthsource": return getOrCreateConfiguration(target).getMongodbAuthsource();
        case "mongodbconnecttimeoutms":
        case "mongodbConnectTimeoutMs": return getOrCreateConfiguration(target).getMongodbConnectTimeoutMs();
        case "mongodbconnectionmode":
        case "mongodbConnectionMode": return getOrCreateConfiguration(target).getMongodbConnectionMode();
        case "mongodbconnectionstring":
        case "mongodbConnectionString": return getOrCreateConfiguration(target).getMongodbConnectionString();
        case "mongodbheartbeatfrequencyms":
        case "mongodbHeartbeatFrequencyMs": return getOrCreateConfiguration(target).getMongodbHeartbeatFrequencyMs();
        case "mongodbpassword":
        case "mongodbPassword": return getOrCreateConfiguration(target).getMongodbPassword();
        case "mongodbpollintervalms":
        case "mongodbPollIntervalMs": return getOrCreateConfiguration(target).getMongodbPollIntervalMs();
        case "mongodbserverselectiontimeoutms":
        case "mongodbServerSelectionTimeoutMs": return getOrCreateConfiguration(target).getMongodbServerSelectionTimeoutMs();
        case "mongodbsockettimeoutms":
        case "mongodbSocketTimeoutMs": return getOrCreateConfiguration(target).getMongodbSocketTimeoutMs();
        case "mongodbsslenabled":
        case "mongodbSslEnabled": return getOrCreateConfiguration(target).isMongodbSslEnabled();
        case "mongodbsslinvalidhostnameallowed":
        case "mongodbSslInvalidHostnameAllowed": return getOrCreateConfiguration(target).isMongodbSslInvalidHostnameAllowed();
        case "mongodbuser":
        case "mongodbUser": return getOrCreateConfiguration(target).getMongodbUser();
        case "notificationenabledchannels":
        case "notificationEnabledChannels": return getOrCreateConfiguration(target).getNotificationEnabledChannels();
        case "notificationsinktopicname":
        case "notificationSinkTopicName": return getOrCreateConfiguration(target).getNotificationSinkTopicName();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return getOrCreateConfiguration(target).getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return getOrCreateConfiguration(target).getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return getOrCreateConfiguration(target).getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return getOrCreateConfiguration(target).getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return getOrCreateConfiguration(target).getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return getOrCreateConfiguration(target).getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return getOrCreateConfiguration(target).getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return getOrCreateConfiguration(target).getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return getOrCreateConfiguration(target).getPollIntervalMs();
        case "postprocessors":
        case "postProcessors": return getOrCreateConfiguration(target).getPostProcessors();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return getOrCreateConfiguration(target).isProvideTransactionMetadata();
        case "queryfetchsize":
        case "queryFetchSize": return getOrCreateConfiguration(target).getQueryFetchSize();
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return getOrCreateConfiguration(target).getRetriableRestartConnectorWaitMs();
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": return getOrCreateConfiguration(target).getSchemaHistoryInternalFileFilename();
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": return getOrCreateConfiguration(target).getSchemaNameAdjustmentMode();
        case "signaldatacollection":
        case "signalDataCollection": return getOrCreateConfiguration(target).getSignalDataCollection();
        case "signalenabledchannels":
        case "signalEnabledChannels": return getOrCreateConfiguration(target).getSignalEnabledChannels();
        case "signalpollintervalms":
        case "signalPollIntervalMs": return getOrCreateConfiguration(target).getSignalPollIntervalMs();
        case "skippedoperations":
        case "skippedOperations": return getOrCreateConfiguration(target).getSkippedOperations();
        case "snapshotcollectionfilteroverrides":
        case "snapshotCollectionFilterOverrides": return getOrCreateConfiguration(target).getSnapshotCollectionFilterOverrides();
        case "snapshotdelayms":
        case "snapshotDelayMs": return getOrCreateConfiguration(target).getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return getOrCreateConfiguration(target).getSnapshotFetchSize();
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return getOrCreateConfiguration(target).getSnapshotIncludeCollectionList();
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": return getOrCreateConfiguration(target).getSnapshotMaxThreads();
        case "snapshotmode":
        case "snapshotMode": return getOrCreateConfiguration(target).getSnapshotMode();
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": return getOrCreateConfiguration(target).getSourceinfoStructMaker();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return getOrCreateConfiguration(target).isTombstonesOnDelete();
        case "topicnamingstrategy":
        case "topicNamingStrategy": return getOrCreateConfiguration(target).getTopicNamingStrategy();
        case "topicprefix":
        case "topicPrefix": return getOrCreateConfiguration(target).getTopicPrefix();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

