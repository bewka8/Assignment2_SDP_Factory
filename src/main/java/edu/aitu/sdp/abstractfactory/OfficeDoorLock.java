package edu.aitu.sdp.abstractfactory;

public class OfficeDoorLock implements DoorLock {
    public String family() { return "Office"; }
    public String lock() { return "Office access door locked"; }
    public String unlock() { return "Office access door unlocked for authorized employee"; }
}
