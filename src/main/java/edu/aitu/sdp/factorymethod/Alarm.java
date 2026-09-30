package edu.aitu.sdp.factorymethod;

public class Alarm implements SecurityDevice {
    @Override
    public String model() {
        return "Generic Alarm";
    }

    @Override
    public String activate() {
        return model() + " armed";
    }
}
