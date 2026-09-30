package edu.aitu.sdp.factorymethod;

public class Camera implements SecurityDevice {
    @Override
    public String model() {
        return "Generic Security Camera";
    }

    @Override
    public String activate() {
        return model() + " activated";
    }
}
