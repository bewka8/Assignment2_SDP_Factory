package edu.aitu.sdp.abstractfactory;

public class IndustrialCamera implements Camera {
    public String family() { return "Industrial"; }
    public String activate() { return "Industrial camera activated for restricted-zone monitoring"; }
    public String record() { return "Industrial camera records restricted equipment zones"; }
}
