# SDP Assignment 2 — Factory Method & Abstract Factory

## Domain

Smart Building Security System.

The application creates compatible security devices for different building environments:

- Residential
- Office
- Industrial
- Hospital (added as the fourth family)

### Product types

1. Camera
2. DoorLock
3. Alarm

Each family contains all three product types, giving at least 9 original concrete products and 12 after the fourth family is added.

## Patterns

### Factory Method

Factory Method is demonstrated by `SecurityDeviceCreator` and its concrete creators:

- `CameraCreator`
- `DoorLockCreator`
- `AlarmCreator`

The creator owns the business operation `prepareAndActivateDevice()` and delegates the actual product creation to the overridable `createDevice()` method.

### Abstract Factory

`SecuritySystemFactory` creates a compatible family of:

- Camera
- DoorLock
- Alarm

Concrete factories:

- `ResidentialFactory`
- `OfficeFactory`
- `IndustrialFactory`
- `HospitalFactory`

The client depends only on interfaces.

## Runtime selection

`FactorySelector` selects the concrete factory from the external `family` configuration.

Example:

```text
family=office
```

or:

```bash
mvn exec:java -Dexec.mainClass="edu.aitu.sdp.Main" -Dexec.args="office"
```

The project intentionally keeps the selection code in one place instead of scattering `new ConcreteFactory()` throughout the business logic.

## Compatibility

A factory returns products from one family only. The `SecuritySystem` object is constructed from a single `SecuritySystemFactory`, so the three products are created together by the same family factory.

This makes accidental combinations such as Residential Camera + Industrial Alarm difficult through the normal client API.

## Business operations

`SecuritySystem` implements three meaningful operations:

1. `secureBuilding()` — arms the alarm, locks the door and activates the camera.
2. `respondToIntrusion()` — coordinates the camera, alarm and lock during an intrusion.
3. `openForAuthorizedEntry()` — unlocks the door, keeps the camera active and resets the alarm state.

## Assignment structure

- Part A: `legacy/LegacySecurityClient.java`
- Part B: `factorymethod/`
- Part C/D: `abstractfactory/`
- Part E: `FactorySelector`
- Part F: `SecuritySystem`
- Part G: `HospitalFactory` and Hospital products
- Part H: UML description in `docs/UML.md`
- Part I: JUnit tests in `src/test/java`
- Part J: Git history instructions in `docs/GIT_HISTORY.md`

## Run

```bash
mvn clean test
```

Run the application:

```bash
mvn exec:java -Dexec.mainClass="edu.aitu.sdp.Main" -Dexec.args="office"
```

If the Maven Exec plugin is not available in your environment, run `edu.aitu.sdp.Main` directly from Eclipse.

## Java version

Java 17+.
