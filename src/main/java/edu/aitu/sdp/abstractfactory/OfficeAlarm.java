package edu.aitu.sdp.abstractfactory;

public class OfficeAlarm implements Alarm {
    public String family() { return "Office"; }
    public String arm() { return "Office alarm armed after working hours"; }
    public String trigger() { return "Office alarm triggered and security notified"; }
    public String disarm() { return "Office alarm disarmed by security staff"; }
}
