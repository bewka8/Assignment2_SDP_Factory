package edu.aitu.sdp.factorymethod;

public abstract class SecurityDeviceCreator {

    protected abstract SecurityDevice createDevice();

    /**
     * Meaningful business logic: prepare and activate a device.
     * The concrete class decides which device is created.
     */
    public String prepareAndActivateDevice() {
        SecurityDevice device = createDevice();
        return "Prepared " + device.model() + " -> " + device.activate();
    }
}
