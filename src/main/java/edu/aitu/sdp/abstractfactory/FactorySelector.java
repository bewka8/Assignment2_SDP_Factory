package edu.aitu.sdp.abstractfactory;

public final class FactorySelector {

    private FactorySelector() {
    }

    public static SecuritySystemFactory select(String family) {
        return switch (family.toLowerCase()) {
            case "residential" -> new ResidentialFactory();
            case "office" -> new OfficeFactory();
            case "industrial" -> new IndustrialFactory();
            case "hospital" -> new HospitalFactory();
            default -> throw new IllegalArgumentException(
                    "Unknown family: " + family
            );
        };
    }
}
