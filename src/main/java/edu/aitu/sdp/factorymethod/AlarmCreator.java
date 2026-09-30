package edu.aitu.sdp.factorymethod;

public class AlarmCreator extends SecurityDeviceCreator {
    @Override
    protected SecurityDevice createDevice() {
        return new Alarm();
    }
}
