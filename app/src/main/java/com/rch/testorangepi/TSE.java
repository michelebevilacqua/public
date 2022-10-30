package com.rch.testorangepi;

import com.secureflashcard.wormapi.WormError;
import com.secureflashcard.wormapi.WormException;
import com.secureflashcard.wormapi.WormInformation;
import com.secureflashcard.wormapi.WormStore;




public class TSE {

    public static TSE instance;

    public static TSE getInstance()
    {
        if (instance==null)
            instance= new TSE();
        return instance;
    }

    public TSEInfo getTseInfo(WormStore wormStore) {
        TSEInfo tseInfo = null;
        try {
            if (wormStore == null)
                return null;
            WormInformation wormInformation = wormStore.info();

            tseInfo = new TSEInfo();
            tseInfo.setCapacity(wormInformation.capacity());
            tseInfo.setCustomizationIdentifier(wormInformation.customizationIdentifier());
            tseInfo.setDevelopmentFirmware(wormInformation.isDevelopmentFirmware());
            tseInfo.setSize(wormInformation.size());
            tseInfo.setHasValidTime(wormInformation.hasValidTime());
            tseInfo.setHasPassedSelfTest(wormInformation.hasPassedSelfTest());
            tseInfo.setCtssInterfaceActive(wormInformation.isCtssInterfaceActive());
            tseInfo.setExportEnabledIfCspTestFails(wormInformation.isExportEnabledIfCspTestFails());
            tseInfo.setDataImportInProgress(wormInformation.isDataImportInProgress());
            tseInfo.setHasChangedPuk(wormInformation.hasChangedPuk());
            tseInfo.setHasChangedAdminPin(wormInformation.hasChangedAdminPin());
            tseInfo.setHasChangedTimeAdminPin(wormInformation.hasChangedTimeAdminPin());
            tseInfo.setTimeUntilNextSelfTest(wormInformation.timeUntilNextSelfTest());
            tseInfo.setStartedTransactions(wormInformation.startedTransactions());
            tseInfo.setMaxStartedTransactions(wormInformation.maxStartedTransactions());
            tseInfo.setCreatedSignatures(wormInformation.createdSignatures());
            tseInfo.setMaxSignatures(wormInformation.maxSignatures());
            tseInfo.setRemainingSignatures(wormInformation.remainingSignatures());
            tseInfo.setMaxTimeSynchronizationDelay(wormInformation.maxTimeSynchronizationDelay());
            tseInfo.setMaxUpdateDelay(wormInformation.maxUpdateDelay());
            tseInfo.setTsePublicKey(wormInformation.tsePublicKey());
            tseInfo.setTseSerialNumber(wormInformation.tseSerialNumber());
            tseInfo.setTseDescription(wormInformation.tseDescription());
            tseInfo.setRegisteredClients(wormInformation.registeredClients());
            tseInfo.setMaxRegisteredClients(wormInformation.maxRegisteredClients());
            tseInfo.setCertificateExpirationDate(wormInformation.certificateExpirationDate());
            tseInfo.setTarExportSizeInSectors(wormInformation.tarExportSizeInSectors());
            tseInfo.setTarExportSize(wormInformation.tarExportSize());
            tseInfo.setHardwareVersion(wormInformation.hardwareVersion());
            tseInfo.setSoftwareVersion(wormInformation.softwareVersion());
            tseInfo.setFormFactor(wormInformation.formFactor());

            switch (wormInformation.initializationState()) {
                case WORM_INIT_INITIALIZED:
                    tseInfo.setInitializationState_Is_INITIALIZED();
                    break;

                case WORM_INIT_DECOMMISSIONED:
                    tseInfo.setInitializationState_Is_DECOMMISSIONED();
                    break;

                case WORM_INIT_UNINITIALIZED:
                    tseInfo.setInitializationState_Is_UNINITIALIZED();
                    break;
            }


            return tseInfo;

        } catch (WormException e) {
            if (e.error() == WormError.WORM_ERROR_IO) {
                return null;
            }
        }
        return null;

    }


}
