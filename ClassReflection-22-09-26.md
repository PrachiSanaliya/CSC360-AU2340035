# Class Notes – 22 September 2026

## Geometry Development – Stage 1

- The geometry part of the JavaFX project was started as **Member 2** of the group.
- The first step was to separate the geometry implementation from the older existing files so that the new development could be tracked independently.
- A new `geometry/` folder was created for the geometry-related classes.

## Geometry Base Class

- A base class named `GeometricObject.java` was created.
- The class was designed to provide common properties and operations for different geometric shapes.
- The initial properties included:
  - `x` position
  - `y` position
  - `width`
  - `height`
- A `translate()` method was added to move an object by a given amount.
- An abstract `getType()` method was included so that each shape could identify its type.

## Geometry Stage 1 Testing

- A separate `GeometryStage1Test.java` file was created to test the geometry foundation.
- The test was used to verify that the base geometry class could be compiled and used correctly.
- The geometry files were compiled separately to make sure there were no Java syntax or class structure problems.

## Git Branch – `geometry`

- The geometry work was completed on the **`geometry` branch**.
- The work was kept separate from the other group members' branches.
- The first geometry changes were committed as a separate checkpoint.
- This created the first stage of the development history for the geometry component.
