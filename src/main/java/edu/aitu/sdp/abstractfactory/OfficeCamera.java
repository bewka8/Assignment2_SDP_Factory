package edu.aitu.sdp.abstractfactory;

public class OfficeCamera implements Camera {
    public String family() { return "Office"; }
    public String activate() { return "Office camera activated with employee-zone monitoring"; }
    public String record() { return "Office camera records the work area"; }
}
