package edu.aitu.sdp.abstractfactory;

public class IndustrialDoorLock implements DoorLock {
    public String family() { return "Industrial"; }
    public String lock() { return "Industrial access gate locked"; }
    public String unlock() { return "Industrial access gate unlocked after authorization"; }
}
