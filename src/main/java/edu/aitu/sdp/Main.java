package edu.aitu.sdp;

import edu.aitu.sdp.abstractfactory.FactorySelector;
import edu.aitu.sdp.abstractfactory.SecuritySystemFactory;
import edu.aitu.sdp.business.SecuritySystem;

public class Main {
    public static void main(String[] args) {
    	String family = "hospital";

        SecuritySystemFactory factory = FactorySelector.select(family);
        SecuritySystem system = new SecuritySystem(factory);

        System.out.println("Selected family: " + factory.familyName());
        System.out.println();

        System.out.println(system.secureBuilding());
        System.out.println();
        System.out.println(system.respondToIntrusion());
        System.out.println();
        System.out.println(system.openForAuthorizedEntry());
    }
}
