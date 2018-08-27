package org.oscm.app.domain;

public enum ProvisioningStatus {

    /**
     * Indicates that the provisioning has not yet been completed and the
     * technical system (e.g. a virtual machine) is not yet created and running.
     */
    WAITING_FOR_SYSTEM_CREATION,

    /**
     * Indicates that the provisioning has been completed. So the system and the
     * service should be running.
     */
    COMPLETED;
}