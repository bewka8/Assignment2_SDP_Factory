package edu.aitu.sdp.abstractfactory;

public class ResidentialCamera implements Camera {
    public String family() { return "Residential"; }
    public String activate() { return "Residential camera activated in privacy mode"; }
    public String record() { return "Residential camera records the entrance"; }
}
