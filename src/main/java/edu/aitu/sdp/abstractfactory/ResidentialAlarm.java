package edu.aitu.sdp.abstractfactory;

public class ResidentialAlarm implements Alarm {
    public String family() { return "Residential"; }
    public String arm() { return "Residential alarm armed"; }
    public String trigger() { return "Residential alarm triggered"; }
    public String disarm() { return "Residential alarm disarmed"; }
}
