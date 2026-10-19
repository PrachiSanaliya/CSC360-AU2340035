# CSC360 Class Notes – 6 October 2026

## Topics Covered
- Understanding the project's code organisation
- Connecting Java classes and OOP concepts to the shape editor
- Understanding the controller and model
- Shape creation through `ObjectFactory`

## 1. Why the Project Is Divided into Components
In earlier lectures, we studied Java classes, methods, packages, GUI components, and event handling. The Geometric Object Styler uses these ideas in a larger program.

Putting every feature into one class would make the code harder to understand and change. The project separates the interface, geometry, styling, interaction, and validation so each part has a clearer responsibility.

## 2. The Main Parts of the Architecture
### UI / presentation
This is the part the user sees.

- **`ControlPanel`:** provides controls for choosing shapes and changing properties.
- **`PreviewPane`:** displays the current shape.
- **`PropertyView`:** displays current values and status messages.
- **`SliderField`:** provides a reusable control combining a label, slider, and numeric input.
- **`UiFactory`:** groups reusable UI-building logic.

This connects to earlier GUI lectures: a graphical application is built from components arranged in a window, and those components respond to user actions.

### Controller
**`StylerController`** connects UI actions to the appropriate part of the program. It receives changes from controls, asks the model or styling components to apply them, and updates the displayed information.

The controller coordinates the work; it should not need to contain every detail of how each shape is drawn.

### Model
The model represents the active geometric object and its properties, including position, dimensions, rotation, scale, and translation.

### Styling and interaction
- The **styling layer** handles fill, stroke, opacity, and visual effects.
- The **interaction layer** handles mouse and keyboard behaviour such as dragging, moving, centring, and resetting.

### Utilities
`Defaults` stores shared default values or limits, while `ValidationUtil` centralises reusable validation and value-cleaning logic.

## 3. Java Packages
A Java **package** groups related classes and helps organise source files. The presentation lists seven packages:

1. `app` — application entry point and controller.
2. `model` — `GeometricObject`, `ObjectStyle`, and enums such as `ShapeType`, `FillType`, and `StrokeStyle`.
3. `object` — concrete shape classes and `ObjectFactory`.
4. `ui` — controls, preview, property view, and UI factory.
5. `styling` — fill, stroke, and effect managers plus `StyleApplier`.
6. `interaction` — mouse and keyboard controllers and the `ShortcutActions` interface.
7. `util` — defaults and validation helpers.

A **class** defines data and behaviour; a **package** organises related classes. An **enum** defines a fixed set of named values, for example a list of supported shape types.

## 4. Object-Oriented Programming in the Project
### Inheritance
Inheritance allows a class to reuse accessible data and behaviour from another class. `GeometricObject` is described as the common abstract base for shapes. `SquareObject` extends `RectangleObject`, reusing related behaviour while maintaining the rule that its sides are equal.

### Encapsulation
Encapsulation controls how an object's internal state is changed. For example, a setter can validate a rotation value, store the result, and apply it to the JavaFX node. This is safer than changing different parts of the object's state independently.

### Polymorphism
Polymorphism allows a common operation to behave differently for different object types. The controller can request a geometry update through a common type, while the actual shape class performs its own shape-specific work.

### Abstraction
An abstract base class defines shared concepts and behaviour without representing one concrete shape that the program directly creates. The concrete shape classes supply their own geometry rules.

## 5. Why the Shapes Need Separate Classes
The project supports Circle, Rectangle, Square, Ellipse, and a fixed five-point star.

- `CircleObject` handles circle geometry.
- `RectangleObject` handles rectangle dimensions.
- `SquareObject` keeps width and height equal.
- `EllipseObject` handles horizontal and vertical radii.
- `PolygonObject` handles the star's vertices and point calculations.

They share properties such as position and rotation, but their geometry is not identical. Separate classes let the program reuse common behaviour without losing each shape's rules.

## 6. The Factory Pattern
`ObjectFactory` centralises the creation of a shape object. When the user selects a shape, the factory can create the corresponding concrete class, such as `CircleObject` or `EllipseObject`.

This keeps shape-construction logic in one place instead of scattering it throughout the controller. It also makes the code easier to extend and maintain.

## 7. Git and Team Collaboration
Earlier classes introduced Git and branches as ways to track changes and work in parallel. The project presentation also describes dividing the work into domains such as UI, object transformations, styling, and interaction.

A Git branch is a line of development; a Java package is a way to organise classes. They solve different problems. Keeping work areas separate can reduce conflicts during integration, although shared files may still need coordination.

## 8. Main Understanding
The project's structure is an application of concepts already studied: classes and methods organise behaviour, packages organise source code, OOP supports reusable shape classes, and the controller connects UI events to the model. Separating responsibilities makes the application easier to explain, test, and maintain.
