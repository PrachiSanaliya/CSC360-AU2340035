# Class Notes – 24 September 2026

## Geometry Development – Stages 2 and 3

- The geometry implementation was continued by adding specific geometric shapes.
- The goal was to create reusable Java classes for the shapes required by the project.

## Circle, Rectangle and Square

- Three new geometry classes were created:
  - `CircleObject.java`
  - `RectangleObject.java`
  - `SquareObject.java`
- `CircleObject` was implemented with a radius property.
- `RectangleObject` was implemented using width and height.
- `SquareObject` was implemented using a side length.
- Each shape extends the common `GeometricObject` class.
- Validation was added so that dimensions such as radius, width, height and side length must be greater than zero.

## Geometry Stage 2 Testing

- A separate `GeometryStage2Test.java` file was created.
- The test was used to create and check the different geometry objects.
- The tests confirmed that the Circle, Rectangle and Square objects could be created from the common geometry foundation.
- The changes were compiled to check that the new classes worked together correctly.

## Position and Dimensions – Stage 3

- The common `GeometricObject` class was extended to provide more control over object properties.
- Methods were added for setting the position of an object.
- Methods for changing width and height were added.
- A `setDimensions()` method was added to update both dimensions together.
- Validation was included to prevent invalid dimensions.

## Shape-Specific Dimension Handling

- The Circle object was updated so that changing its radius also updates its width and height.
- The Square object was updated so that changing its side length updates both width and height.
- This kept the shape-specific properties consistent with the common geometry properties.

## Geometry Stage 3 Testing

- A `GeometryStage3Test.java` file was created.
- The test checked position changes and dimension changes.
- Invalid dimensions were also tested to make sure they were rejected.
- The geometry classes were compiled again after the changes.

## Git Commit

- The Stage 2 and Stage 3 work was recorded through separate Git commits.
- Meaningful commit messages were used to show the progression of the geometry implementation.
- The completed changes were pushed to the **`geometry` branch**.
