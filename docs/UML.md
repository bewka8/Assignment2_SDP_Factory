# UML Structure

```text
                         +----------------------+
                         |       Client         |
                         +----------+-----------+
                                    |
                                    v
                         +----------------------+
                         | SecuritySystemFactory |
                         +----+--------+---------+
                              |        |
              +---------------+--------+----------------+
              |               |                         |
              v               v                         v
     +----------------+ +----------------+     +----------------+
     | Residential    | | OfficeFactory  | ... | HospitalFactory|
     | Factory        | |                |     |                |
     +-------+--------+ +-------+--------+     +-------+--------+
             |                  |                      |
             v                  v                      v
        Camera/Lock/Alarm  Camera/Lock/Alarm     Camera/Lock/Alarm


Factory Method part:

        +-------------------------+
        | SecurityDeviceCreator   |
        +-----------+-------------+
                    |
          +---------+---------+
          |         |         |
          v         v         v
      CameraCreator DoorLockCreator AlarmCreator
          |         |         |
          v         v         v
       Camera     DoorLock    Alarm
```

## Factory Method

`SecurityDeviceCreator` declares `createDevice()`. Concrete creators override it and decide which concrete product is instantiated.

## Abstract Factory

`SecuritySystemFactory` declares creation methods for a related family of products. Each concrete factory creates products belonging to one compatible family.
