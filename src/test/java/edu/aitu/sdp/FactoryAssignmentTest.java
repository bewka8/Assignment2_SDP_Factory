package edu.aitu.sdp;

import edu.aitu.sdp.abstractfactory.*;
import edu.aitu.sdp.business.SecuritySystem;
import edu.aitu.sdp.factorymethod.*;
import edu.aitu.sdp.legacy.LegacySecurityClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryAssignmentTest {

    @Test
    void residentialFactoryCreatesResidentialCamera() {
        assertEquals("Residential", new ResidentialFactory().createCamera().family());
    }

    @Test
    void residentialFactoryCreatesResidentialLock() {
        assertEquals("Residential", new ResidentialFactory().createDoorLock().family());
    }

    @Test
    void residentialFactoryCreatesResidentialAlarm() {
        assertEquals("Residential", new ResidentialFactory().createAlarm().family());
    }

    @Test
    void officeFactoryCreatesOfficeFamily() {
        SecuritySystemFactory factory = new OfficeFactory();
        assertEquals("Office", factory.createCamera().family());
        assertEquals("Office", factory.createDoorLock().family());
        assertEquals("Office", factory.createAlarm().family());
    }

    @Test
    void industrialFactoryCreatesIndustrialFamily() {
        SecuritySystemFactory factory = new IndustrialFactory();
        assertEquals("Industrial", factory.createCamera().family());
        assertEquals("Industrial", factory.createDoorLock().family());
        assertEquals("Industrial", factory.createAlarm().family());
    }

    @Test
    void hospitalFactoryCreatesFourthFamily() {
        SecuritySystemFactory factory = new HospitalFactory();
        assertEquals("Hospital", factory.familyName());
        assertEquals("Hospital", factory.createCamera().family());
        assertEquals("Hospital", factory.createDoorLock().family());
    }

    @Test
    void factoryMethodCreatesCamera() {
        SecurityDeviceCreator creator = new CameraCreator();
        assertTrue(creator.prepareAndActivateDevice().contains("Camera"));
    }

    @Test
    void factoryMethodCreatesDoorLock() {
        SecurityDeviceCreator creator = new DoorLockCreator();
        assertTrue(creator.prepareAndActivateDevice().contains("Door Lock"));
    }

    @Test
    void factoryMethodCreatesAlarm() {
        SecurityDeviceCreator creator = new AlarmCreator();
        assertTrue(creator.prepareAndActivateDevice().contains("Alarm"));
    }

    @Test
    void runtimeSelectionChoosesOffice() {
        assertInstanceOf(OfficeFactory.class, FactorySelector.select("office"));
    }

    @Test
    void runtimeSelectionChoosesHospital() {
        assertInstanceOf(HospitalFactory.class, FactorySelector.select("hospital"));
    }

    @Test
    void runtimeSelectionRejectsUnknownFamily() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorySelector.select("unknown"));
    }

    @Test
    void businessSecureBuildingUsesAllProducts() {
        SecuritySystem system = new SecuritySystem(new OfficeFactory());
        String result = system.secureBuilding();

        assertTrue(result.contains("camera"));
        assertTrue(result.contains("locked"));
        assertTrue(result.contains("alarm"));
    }

    @Test
    void businessIntrusionResponseUsesAllProducts() {
        SecuritySystem system = new SecuritySystem(new IndustrialFactory());
        String result = system.respondToIntrusion();

        assertTrue(result.contains("records"));
        assertTrue(result.contains("triggered"));
        assertTrue(result.contains("locked"));
    }

    @Test
    void businessAuthorizedEntryUsesAllProducts() {
        SecuritySystem system = new SecuritySystem(new ResidentialFactory());
        String result = system.openForAuthorizedEntry();

        assertTrue(result.contains("disarmed"));
        assertTrue(result.contains("unlocked"));
        assertTrue(result.contains("activated"));
    }

    @Test
    void clientSystemContainsOnlyOneFamily() {
        SecuritySystem system = new SecuritySystem(new HospitalFactory());

        assertEquals(system.cameraFamily(), system.lockFamily());
        assertEquals(system.lockFamily(), system.alarmFamily());
    }

    @Test
    void negativeCompatibilityScenarioIsNotCreatedThroughOneFactory() {
        SecuritySystem system = new SecuritySystem(new OfficeFactory());

        assertNotEquals("Industrial", system.cameraFamily());
        assertNotEquals("Industrial", system.lockFamily());
        assertNotEquals("Industrial", system.alarmFamily());
    }

    @Test
    void legacyVersionDemonstratesDirectCreationProblem() {
        LegacySecurityClient client = new LegacySecurityClient();
        assertEquals("Created directly: OfficeCamera",
                client.configure("office", "camera"));
    }
}
