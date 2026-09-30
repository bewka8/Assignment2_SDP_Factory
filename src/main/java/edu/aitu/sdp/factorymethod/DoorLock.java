package edu.aitu.sdp.factorymethod;

public class DoorLock implements SecurityDevice {
    @Override
    public String model() {
        return "Generic Door Lock";
    }

    @Override
    public String activate() {
        return model() + " locked";
    }
}
