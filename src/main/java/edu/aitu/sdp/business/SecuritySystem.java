package edu.aitu.sdp.business;

import edu.aitu.sdp.abstractfactory.Alarm;
import edu.aitu.sdp.abstractfactory.Camera;
import edu.aitu.sdp.abstractfactory.DoorLock;
import edu.aitu.sdp.abstractfactory.SecuritySystemFactory;

public class SecuritySystem {

    private final Camera camera;
    private final DoorLock doorLock;
    private final Alarm alarm;

    public SecuritySystem(SecuritySystemFactory factory) {
        this.camera = factory.createCamera();
        this.doorLock = factory.createDoorLock();
        this.alarm = factory.createAlarm();
    }

    public String secureBuilding() {
        return camera.activate() + " | "
                + camera.record() + " | "
                + doorLock.lock() + " | "
                + alarm.arm();
    }

    public String respondToIntrusion() {
        return camera.record() + " | "
                + alarm.trigger() + " | "
                + doorLock.lock();
    }

    public String openForAuthorizedEntry() {
        return alarm.disarm() + " | "
                + doorLock.unlock() + " | "
                + camera.activate();
    }

    public String cameraFamily() {
        return camera.family();
    }

    public String lockFamily() {
        return doorLock.family();
    }

    public String alarmFamily() {
        return alarm.family();
    }
}
