package com.rch.testorangepi;

import android.util.Base64;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class TSEInfo {

    private final int WORM_INIT_UNINITIALIZED = 0;
    private final int WORM_INIT_INITIALIZED = 1;
    private final int WORM_INIT_DECOMMISSIONED = 2;
    private byte[] customizationIdentifier;
    private boolean isDevelopmentFirmware;
    private long capacity;
    private long size;
    private boolean hasValidTime;
    private boolean hasPassedSelfTest;
    private boolean isCtssInterfaceActive;
    private boolean isExportEnabledIfCspTestFails;
    private int initializationState;
    private boolean isDataImportInProgress;
    private boolean hasChangedPuk;
    private boolean hasChangedAdminPin;
    private boolean hasChangedTimeAdminPin;
    private long timeUntilNextSelfTest;
    private long startedTransactions;
    private long maxStartedTransactions;
    private long createdSignatures;
    private long maxSignatures;
    private long remainingSignatures;
    private long maxTimeSynchronizationDelay;
    private long maxUpdateDelay;
    private byte[] tsePublicKey;
    private byte[] tseSerialNumber;
    private String tseDescription;
    private long registeredClients;
    private long maxRegisteredClients;
    private long certificateExpirationDate;
    private long tarExportSizeInSectors;
    private long tarExportSize;
    private long hardwareVersion;
    private long softwareVersion;
    private String formFactor;

    public static final String TSE_INFO_CAPACITY = "Capacity";
    public static final String TSE_INFO_CERTIFICATE_EXPIRATION_DATE = "CertificateExpirationDate";
    public static final String TSE_INFO_CREATED_SIGNATURES = "CreatedSignatures";
    public static final String TSE_INFO_CTSS_INTERFACE_ACTIVE = "CtssInterfaceActive";
    public static final String TSE_INFO_CUSTOM_IDENTIFIER = "CustomizationIdentifier";
    public static final String TSE_INFO_DATA_IMPORT_IN_PROGRESS = "DataImportInProgress";
    public static final String TSE_INFO_DEVELOPMENT_FIRMWARE = "DevelopmentFirmware";
    public static final String TSE_INFO_EXPORT_ENABLED_IF_CSP_TEST_FAILS = "ExportEnabledIfCspTestFails";
    public static final String TSE_INFO_FORM_FACTOR = "FormFactor";
    public static final String TSE_INFO_HARDWARE_VERSION = "HardwareVersion";
    public static final String TSE_INFO_HAS_CHANGED_ADMIN_PIN = "HasChangedAdminPin";
    public static final String TSE_INFO_HAS_CHANGED_PUK = "HasChangedPuk";
    public static final String TSE_INFO_HAS_CHANGED_TIME_ADMIN_PIN = "HasChangedTimeAdminPin";
    public static final String TSE_INFO_HAS_PASSED_SELF_TEST = "HasPassedSelfTest";
    public static final String TSE_INFO_HAS_VALID_TIME = "HasValidTime";
    public static final String TSE_INFO_INITIALIZATION_STATE = "InitializationState";
    public static final String TSE_INFO_INITIALIZATION_STATE_IS_DECOMMISSIONED = "InitializationState_Is_DECOMMISSIONED";
    public static final String TSE_INFO_INITIALIZATION_STATE_IS_INITIALIZED = "InitializationState_Is_INITIALIZED";
    public static final String TSE_INFO_INITIALIZATION_STATE_IS_UNINITIALIZED = "InitializationState_Is_UNINITIALIZED";
    public static final String TSE_INFO_MAX_REGISTERED_CLIENTS = "MaxRegisteredClients";
    public static final String TSE_INFO_MAX_SIGNATURES = "MaxSignatures";
    public static final String TSE_INFO_MAX_STARTED_TRANSACTIONS = "MaxStartedTransactions";
    public static final String TSE_INFO_MAX_TIME_SYNCHRONIZATION_DELAY = "MaxTimeSynchronizationDelay";
    public static final String TSE_INFO_MAX_UPDATE_DELAY = "MaxUpdateDelay";
    public static final String TSE_INFO_REGISTERED_CLIENTS = "RegisteredClients";
    public static final String TSE_INFO_REMAINING_SIGNATURES = "RemainingSignatures";
    public static final String TSE_INFO_SIZE = "Size";
    public static final String TSE_INFO_SOFTWARE_VERSION = "SoftwareVersion";
    public static final String TSE_INFO_STARTED_TRANSACTIONS = "StartedTransactions";
    public static final String TSE_INFO_TAR_EXPORT_SIZE = "TarExportSize";
    public static final String TSE_INFO_TAR_EXPORT_SIZE_IN_SECTORS = "TarExportSizeInSectors";
    public static final String TSE_INFO_TIME_UNTIL_NEXT_SELF_TEST = "TimeUntilNextSelfTest";
    public static final String TSE_INFO_TSE_DESCRIPTION = "TseDescription";
    public static final String TSE_INFO_TSE_PUBLIC_KEY = "TsePublicKey";
    public static final String TSE_INFO_TSE_SERIAL_NUMBER = "TseSerialNumber";

    public TSEInfo() {
        setInitializationState_Is_UNINITIALIZED();
    }

    public int getInitializationState() {
        return initializationState;
    }

    public void setInitializationState(int initializationState) {
        if (initializationState == WORM_INIT_DECOMMISSIONED || initializationState == WORM_INIT_INITIALIZED || initializationState == WORM_INIT_UNINITIALIZED) {
            this.initializationState = initializationState;
        }
    }

    public byte[] getCustomizationIdentifier() {
        return customizationIdentifier;
    }

    public void setCustomizationIdentifier(byte[] customizationIdentifier) {
        this.customizationIdentifier = customizationIdentifier;
    }

    public boolean getDevelopmentFirmware() {
        return isDevelopmentFirmware;
    }

    public void setDevelopmentFirmware(boolean developmentFirmware) {
        isDevelopmentFirmware = developmentFirmware;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean getHasValidTime() {
        return hasValidTime;
    }

    public void setHasValidTime(boolean hasValidTime) {
        this.hasValidTime = hasValidTime;
    }

    public boolean getHasPassedSelfTest() {
        return hasPassedSelfTest;
    }

    public void setHasPassedSelfTest(boolean hasPassedSelfTest) {
        this.hasPassedSelfTest = hasPassedSelfTest;
    }

    public boolean getCtssInterfaceActive() {
        return isCtssInterfaceActive;
    }

    public void setCtssInterfaceActive(boolean ctssInterfaceActive) {
        isCtssInterfaceActive = ctssInterfaceActive;
    }

    public boolean getExportEnabledIfCspTestFails() {
        return isExportEnabledIfCspTestFails;
    }

    public void setExportEnabledIfCspTestFails(boolean exportEnabledIfCspTestFails) {
        isExportEnabledIfCspTestFails = exportEnabledIfCspTestFails;
    }

    public boolean getInitializationState_Is_UNINITIALIZED() {
        return (getInitializationState() == WORM_INIT_UNINITIALIZED);
    }

    public void setInitializationState_Is_UNINITIALIZED() {
        this.setInitializationState(WORM_INIT_UNINITIALIZED);
    }

    public boolean getInitializationState_Is_INITIALIZED() {
        return (getInitializationState() == WORM_INIT_INITIALIZED);
    }

    public void setInitializationState_Is_INITIALIZED() {
        this.setInitializationState(WORM_INIT_INITIALIZED);
    }

    public boolean getInitializationState_Is_DECOMMISSIONED() {
        return (getInitializationState() == WORM_INIT_DECOMMISSIONED);
    }

    public void setInitializationState_Is_DECOMMISSIONED() {
        this.setInitializationState(WORM_INIT_DECOMMISSIONED);
    }

    public boolean getDataImportInProgress() {
        return isDataImportInProgress;
    }

    public void setDataImportInProgress(boolean dataImportInProgress) {
        isDataImportInProgress = dataImportInProgress;
    }

    public boolean getHasChangedPuk() {
        return hasChangedPuk;
    }

    public void setHasChangedPuk(boolean hasChangedPuk) {
        this.hasChangedPuk = hasChangedPuk;
    }

    public boolean getHasChangedAdminPin() {
        return hasChangedAdminPin;
    }

    public void setHasChangedAdminPin(boolean hasChangedAdminPin) {
        this.hasChangedAdminPin = hasChangedAdminPin;
    }

    public boolean getHasChangedTimeAdminPin() {
        return hasChangedTimeAdminPin;
    }

    public void setHasChangedTimeAdminPin(boolean hasChangedTimeAdminPin) {
        this.hasChangedTimeAdminPin = hasChangedTimeAdminPin;
    }

    public long getTimeUntilNextSelfTest() {
        return timeUntilNextSelfTest;
    }

    public void setTimeUntilNextSelfTest(long timeUntilNextSelfTest) {
        this.timeUntilNextSelfTest = timeUntilNextSelfTest;
    }

    public long getStartedTransactions() {
        return startedTransactions;
    }

    public void setStartedTransactions(long startedTransactions) {
        this.startedTransactions = startedTransactions;
    }

    public long getMaxStartedTransactions() {
        return maxStartedTransactions;
    }

    public void setMaxStartedTransactions(long maxStartedTransactions) {
        this.maxStartedTransactions = maxStartedTransactions;
    }

    public long getCreatedSignatures() {
        return createdSignatures;
    }

    public void setCreatedSignatures(long createdSignatures) {
        this.createdSignatures = createdSignatures;
    }

    public long getMaxSignatures() {
        return maxSignatures;
    }

    public void setMaxSignatures(long maxSignatures) {
        this.maxSignatures = maxSignatures;
    }

    public long getRemainingSignatures() {
        return remainingSignatures;
    }

    public void setRemainingSignatures(long remainingSignatures) {
        this.remainingSignatures = remainingSignatures;
    }

    public long getMaxTimeSynchronizationDelay() {
        return maxTimeSynchronizationDelay;
    }

    public void setMaxTimeSynchronizationDelay(long maxTimeSynchronizationDelay) {
        this.maxTimeSynchronizationDelay = maxTimeSynchronizationDelay;
    }

    public long getMaxUpdateDelay() {
        return maxUpdateDelay;
    }

    public void setMaxUpdateDelay(long maxUpdateDelay) {
        this.maxUpdateDelay = maxUpdateDelay;
    }

    public byte[] getTsePublicKey() {
        return tsePublicKey;
    }

    public void setTsePublicKey(byte[] tsePublicKey) {
        this.tsePublicKey = tsePublicKey;
    }

    public byte[] getTseSerialNumber() {
        return tseSerialNumber;
    }

    public void setTseSerialNumber(byte[] tseSerialNumber) {
        this.tseSerialNumber = tseSerialNumber;
    }

    public String getTseDescription() {
        return tseDescription;
    }

    public void setTseDescription(String tseDescription) {
        this.tseDescription = tseDescription;
    }

    public long getRegisteredClients() {
        return registeredClients;
    }

    public void setRegisteredClients(long registeredClients) {
        this.registeredClients = registeredClients;
    }

    public long getMaxRegisteredClients() {
        return maxRegisteredClients;
    }

    public void setMaxRegisteredClients(long maxRegisteredClients) {
        this.maxRegisteredClients = maxRegisteredClients;
    }

    public long getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    public void setCertificateExpirationDate(long certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
    }

    public long getTarExportSizeInSectors() {
        return tarExportSizeInSectors;
    }

    public void setTarExportSizeInSectors(long tarExportSizeInSectors) {
        this.tarExportSizeInSectors = tarExportSizeInSectors;
    }

    public long getTarExportSize() {
        return tarExportSize;
    }

    public void setTarExportSize(long tarExportSize) {
        this.tarExportSize = tarExportSize;
    }

    public long getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(long hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public long getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(long softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public static String convertDateToISO8601(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat.format(date);
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Capacity", String.valueOf(this.getCapacity()));
        map.put("CertificateExpirationDate", "(" + this.getCertificateExpirationDate() + ") " + convertDateToISO8601(new Date(1000 * this.getCertificateExpirationDate())));
        map.put("CreatedSignatures", String.valueOf(this.getCreatedSignatures()));
        map.put("CtssInterfaceActive", String.valueOf(this.getCtssInterfaceActive()));
        map.put("CustomizationIdentifier", Base64.encodeToString((this.getCustomizationIdentifier()), Base64.NO_WRAP));
        map.put("DataImportInProgress", String.valueOf(this.getDataImportInProgress()));
        map.put("DevelopmentFirmware", String.valueOf(this.getDevelopmentFirmware()));
        map.put("ExportEnabledIfCspTestFails", String.valueOf(this.getExportEnabledIfCspTestFails()));
        map.put("FormFactor", String.valueOf(this.getFormFactor()));
        map.put("HardwareVersion", String.valueOf(this.getHardwareVersion()));
        map.put("HasChangedAdminPin", String.valueOf(this.getHasChangedAdminPin()));
        map.put("HasChangedPuk", String.valueOf(this.getHasChangedPuk()));
        map.put("HasChangedTimeAdminPin", String.valueOf(this.getHasChangedTimeAdminPin()));
        map.put("HasPassedSelfTest", String.valueOf(this.getHasPassedSelfTest()));
        map.put("HasValidTime", String.valueOf(this.getHasValidTime()));
        map.put("InitializationState", String.valueOf(this.getInitializationState()));
        map.put("InitializationState_Is_DECOMMISSIONED", String.valueOf(this.getInitializationState_Is_DECOMMISSIONED()));
        map.put("InitializationState_Is_INITIALIZED", String.valueOf(this.getInitializationState_Is_INITIALIZED()));
        map.put("InitializationState_Is_UNINITIALIZED", String.valueOf(this.getInitializationState_Is_UNINITIALIZED()));
        map.put("MaxRegisteredClients", String.valueOf(this.getMaxRegisteredClients()));
        map.put("MaxSignatures", String.valueOf(this.getMaxSignatures()));
        map.put("MaxStartedTransactions", String.valueOf(this.getMaxStartedTransactions()));
        map.put("MaxTimeSynchronizationDelay", String.valueOf(this.getMaxTimeSynchronizationDelay()));
        map.put("MaxUpdateDelay", String.valueOf(this.getMaxUpdateDelay()));
        map.put("RegisteredClients", String.valueOf(this.getRegisteredClients()));
        map.put("RemainingSignatures", String.valueOf(this.getRemainingSignatures()));
        map.put("Size", String.valueOf(this.getSize()));
        map.put("SoftwareVersion", String.valueOf(this.getSoftwareVersion()));
        map.put("StartedTransactions", String.valueOf(this.getStartedTransactions()));
        map.put("TarExportSize", String.valueOf(this.getTarExportSize()));
        map.put("TarExportSizeInSectors", String.valueOf(this.getTarExportSizeInSectors()));
        map.put("TimeUntilNextSelfTest", String.valueOf(this.getTimeUntilNextSelfTest()));
        map.put("TseDescription", String.valueOf(this.getTseDescription()));
        map.put("TsePublicKey",Base64.encodeToString((this.getTsePublicKey()), Base64.NO_WRAP));
         map.put("TseSerialNumber",bytesToHex(this.getTseSerialNumber()));


        return map;
    }

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
