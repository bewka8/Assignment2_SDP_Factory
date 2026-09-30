package edu.aitu.sdp.abstractfactory;

public class HospitalFactory implements SecuritySystemFactory {
    @Override
    public Camera createCamera() { return new HospitalCamera(); }

    @Override
    public DoorLock createDoorLock() { return new HospitalDoorLock(); }

    @Override
    public Alarm createAlarm() { return new HospitalAlarm(); }

    @Override
    public String familyName() { return "Hospital"; }
}
