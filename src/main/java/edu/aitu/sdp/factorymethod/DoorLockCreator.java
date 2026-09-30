package edu.aitu.sdp.factorymethod;

public class DoorLockCreator extends SecurityDeviceCreator {
    @Override
    protected SecurityDevice createDevice() {
        return new DoorLock();
    }
}
