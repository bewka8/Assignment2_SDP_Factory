package edu.aitu.sdp.abstractfactory;

public class OfficeFactory implements SecuritySystemFactory {
    @Override
    public Camera createCamera() { return new OfficeCamera(); }

    @Override
    public DoorLock createDoorLock() { return new OfficeDoorLock(); }

    @Override
    public Alarm createAlarm() { return new OfficeAlarm(); }

    @Override
    public String familyName() { return "Office"; }
}
