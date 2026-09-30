package edu.aitu.sdp.abstractfactory;

public class IndustrialFactory implements SecuritySystemFactory {
    @Override
    public Camera createCamera() { return new IndustrialCamera(); }

    @Override
    public DoorLock createDoorLock() { return new IndustrialDoorLock(); }

    @Override
    public Alarm createAlarm() { return new IndustrialAlarm(); }

    @Override
    public String familyName() { return "Industrial"; }
}
