package edu.aitu.sdp.abstractfactory;

public class ResidentialFactory implements SecuritySystemFactory {
    @Override
    public Camera createCamera() { return new ResidentialCamera(); }

    @Override
    public DoorLock createDoorLock() { return new ResidentialDoorLock(); }

    @Override
    public Alarm createAlarm() { return new ResidentialAlarm(); }

    @Override
    public String familyName() { return "Residential"; }
}
