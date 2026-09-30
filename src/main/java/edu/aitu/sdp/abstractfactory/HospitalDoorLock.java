package edu.aitu.sdp.abstractfactory;

public class HospitalDoorLock implements DoorLock {
    public String family() { return "Hospital"; }
    public String lock() { return "Hospital restricted door locked"; }
    public String unlock() { return "Hospital restricted door unlocked for authorized staff"; }
}
