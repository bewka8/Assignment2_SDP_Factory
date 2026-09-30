package edu.aitu.sdp.abstractfactory;

public interface SecuritySystemFactory {
    Camera createCamera();
    DoorLock createDoorLock();
    Alarm createAlarm();
    String familyName();
}
