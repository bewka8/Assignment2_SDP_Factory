package edu.aitu.sdp.legacy;

/**
 * Part A: intentionally problematic direct object creation.
 *
 * This class is kept to demonstrate the starting design before refactoring.
 */
public class LegacySecurityClient {

    public String configure(String family, String productType) {
        String product;

        if (family.equalsIgnoreCase("residential")) {
            if (productType.equalsIgnoreCase("camera")) {
                product = "ResidentialCamera";
            } else if (productType.equalsIgnoreCase("lock")) {
                product = "ResidentialDoorLock";
            } else {
                product = "ResidentialAlarm";
            }
        } else if (family.equalsIgnoreCase("office")) {
            if (productType.equalsIgnoreCase("camera")) {
                product = "OfficeCamera";
            } else if (productType.equalsIgnoreCase("lock")) {
                product = "OfficeDoorLock";
            } else {
                product = "OfficeAlarm";
            }
        } else {
            if (productType.equalsIgnoreCase("camera")) {
                product = "IndustrialCamera";
            } else if (productType.equalsIgnoreCase("lock")) {
                product = "IndustrialDoorLock";
            } else {
                product = "IndustrialAlarm";
            }
        }

        return "Created directly: " + product;
    }
}
