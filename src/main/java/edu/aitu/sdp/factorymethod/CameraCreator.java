package edu.aitu.sdp.factorymethod;

public class CameraCreator extends SecurityDeviceCreator {
    @Override
    protected SecurityDevice createDevice() {
        return new Camera();
    }
}
