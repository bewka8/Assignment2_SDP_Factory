package edu.aitu.sdp.abstractfactory;

public class IndustrialAlarm implements Alarm {
    public String family() { return "Industrial"; }
    public String arm() { return "Industrial alarm armed for hazardous zone"; }
    public String trigger() { return "Industrial alarm triggered and emergency protocol started"; }
    public String disarm() { return "Industrial alarm disarmed by authorized operator"; }
}
