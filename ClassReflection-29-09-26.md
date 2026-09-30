# Class Notes – 29 September 2026

## Geometry Development – Stages 4 and 5

- The final geometry development work was completed during this class.
- The remaining functionality focused on object transformations and managing multiple geometry objects.

## Rotation, Scale and Translation – Stage 4

- The `GeometricObject` class was extended to support transformations.
- Rotation functionality was added so an object could store and change its rotation angle.
- Rotation values were normalized so that angles could be handled within a 360-degree range.
- Scaling functionality was added with a default scale value.
- Methods were added for setting the scale and applying additional scaling.
- Translation functionality from the earlier stage was also tested together with rotation and scaling.

## Geometry Stage 4 Testing

- A `GeometryStage4Test.java` file was created.
- The test checked:
  - Object translation
  - Rotation
  - Additional rotation
  - Scaling
  - Additional scaling
  - Rotation normalization
  - Invalid scale values
- Circle and Square objects were also tested with the transformation functionality.
- The tests confirmed that the geometry transformation methods were working correctly.

## Geometry Manager – Stage 5

- The final stage was to create a manager for handling multiple geometry objects.
- A new `GeometryManager.java` class was created.
- The manager stores multiple `GeometricObject` instances.
- Functionality was added to:
  - Add geometry objects
  - Remove geometry objects
  - Get an object by index
  - Get the number of objects
  - Select an object
  - Get the currently selected object
  - Clear all objects
- The manager also keeps track of the selected object when objects are added or removed.

## Geometry Stage 5 Testing

- A separate `GeometryStage5Test.java` file was created.
- The test created Circle, Rectangle and Square objects and added them to the geometry manager.
- Different objects were selected and their transformation functionality was tested.
- Object removal and selection handling were tested.
- The manager was also cleared to verify that its final state was correct.
- The final test confirmed that the geometry manager contained zero objects and no selected object after clearing.

## Project Documentation and Screenshots

- A screenshot was created for the completed Stage 5 geometry work.
- The geometry screenshots were stored separately from the source code in:

```text
docs/geometry/screenshots/
```

- Keeping screenshots with the geometry documentation provides a visual record of the development stages.

## Git Commit and Branch

- The completed Stage 5 geometry changes were committed to Git.
- The final geometry implementation was pushed to the **`geometry` branch**.
- The five stages now provide a continuous development history:
  - Stage 1 – Geometry foundation
  - Stage 2 – Circle, Rectangle and Square
  - Stage 3 – Position and dimensions
  - Stage 4 – Rotation, scale and translation
  - Stage 5 – Geometry manager and object selection
- The completed geometry work remained separate from the older root geometry files and from the other group members' branches.
