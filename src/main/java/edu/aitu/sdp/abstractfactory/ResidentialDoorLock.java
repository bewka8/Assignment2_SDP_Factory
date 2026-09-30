package edu.aitu.sdp.abstractfactory;

public class ResidentialDoorLock implements DoorLock {
    public String family() { return "Residential"; }
    public String lock() { return "Residential door locked"; }
    public String unlock() { return "Residential door unlocked for authorized entry"; }
}
