package edu.aitu.sdp.abstractfactory;

public class HospitalCamera implements Camera {
    public String family() { return "Hospital"; }
    public String activate() { return "Hospital camera activated for corridor monitoring"; }
    public String record() { return "Hospital camera records corridor activity"; }
}
