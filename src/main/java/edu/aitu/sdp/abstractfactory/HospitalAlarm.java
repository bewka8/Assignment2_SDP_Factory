package edu.aitu.sdp.abstractfactory;

public class HospitalAlarm implements Alarm {
    public String family() { return "Hospital"; }
    public String arm() { return "Hospital alarm armed for restricted area"; }
    public String trigger() { return "Hospital alarm triggered and security team notified"; }
    public String disarm() { return "Hospital alarm disarmed by authorized staff"; }
}
