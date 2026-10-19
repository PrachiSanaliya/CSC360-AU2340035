# CSC360 Class Notes – 8 October 2026

## Topics Covered
- Following a UI event through the program
- Slider callbacks and lambda expressions
- Understanding geometry properties and transformations
- Shape-specific geometry and formulas

## 1. Connecting to Event-Driven Programming
In earlier lectures, we studied event-driven programming: the user performs an action, the application receives an event, and a handler responds. The Geometric Object Styler uses the same idea when a slider changes.

For example, imagine moving the Rotation slider from 0° to 45°. The value needs to travel from the UI control to the model, be applied to the visible shape, and then appear in the property display.

## 2. The Slider-to-Shape Flow
The flow described in the presentation is:

1. The user moves the slider.
2. `SliderField` reports the new value through a callback.
3. `StylerController` receives the value.
4. The controller calls the active object's rotation setter.
5. The model processes the value and applies it to the JavaFX node.
6. The application refreshes the preview-related property information and status message.

This sequence shows why the UI, controller, model, and preview need separate responsibilities but must still communicate.

## 3. Callback and Lambda Example
The presentation shows this shortened example:

```java
panel.getRotationField().onChange(value -> {
    object.setRotation(value);
    afterGeometryChange("Rotated to ...");
});
```

- `panel` refers to the control panel.
- `getRotationField()` obtains the rotation control.
- `onChange(...)` registers behaviour to run when the value changes.
- `value -> { ... }` is a **lambda expression**. It is a compact way to define behaviour that is passed to another method.
- `object.setRotation(value)` asks the active object to change its rotation.
- `afterGeometryChange(...)` performs follow-up work, such as checking the preview boundary and updating property/status information.

The lambda is the event response supplied to the control. The code shown in the presentation is an illustrative excerpt rather than a guarantee of the complete method implementation.

## 4. Understanding the Rotation Setter
The presentation gives this example:

```java
public void setRotation(double degrees) {
    this.rotation = ValidationUtil.sanitizeRotation(degrees);
    node.setRotate(this.rotation);
}
```

- `public` means the method can be called from other accessible parts of the program.
- `void` means the method returns no value.
- `double degrees` is the requested rotation value.
- `this.rotation` is the object's stored rotation field.
- `ValidationUtil.sanitizeRotation(degrees)` processes the requested value according to the project's validation rules.
- `node.setRotate(this.rotation)` applies the resulting rotation to the visible JavaFX node.

The stored model value and the visible node should agree. This is an example of encapsulation: the setter provides a controlled way to update the object's state.

## 5. Position, Dimensions, and Transformations
These properties can look similar on screen but have different meanings.

- **Position X/Y:** where the object is placed.
- **Width and height:** dimensions of the underlying geometry.
- **Rotation:** changes orientation around a pivot.
- **Scale:** multiplies the displayed size along an axis. A scale of 1.0 is the original size; 2.0 doubles it along that axis; 0.5 halves it.
- **Translation:** adds an offset to the position.
- **Flip/reflection:** mirrors the object horizontally or vertically.

The presentation distinguishes base position from translation:
- Effective X = base X + translation X
- Effective Y = base Y + translation Y

The exact screen coordinates depend on how the JavaFX node's layout and transforms are implemented.

## 6. Geometry of the Five Shapes
- **Circle:** described by a radius; diameter = 2 × radius.
- **Rectangle:** width and height may differ.
- **Square:** width and height must remain equal.
- **Ellipse:** horizontal radius is half the width and vertical radius is half the height.
- **Five-point star:** can be formed from a sequence of outer and inner vertices.

A common way to calculate a point around a centre is:

\(x=c_x+r\cos(\theta)\)

\(y=c_y+r\sin(\theta)\)

Here, \(c_x,c_y\) are the centre coordinates, \(r\) is the selected radius, and \(\theta\) is the angle. A star alternates between outer and inner radii. The exact angles and radii depend on the implementation.

Java's `Math.sin()` and `Math.cos()` use radians, not degrees. The conversion is:

\(\text{radians}=\text{degrees}\times\frac{\pi}{180}\)

## 7. Why `applyGeometry()` Matters
A common operation such as `applyGeometry()` allows the controller to request an update without needing a separate controller workflow for every shape. The concrete object's class determines how its geometry is applied. This is an example of polymorphism.

## 8. Main Understanding
The event-handling concepts from earlier lectures now work across several project components: the control reports a change, the controller routes it, the model applies it, and the UI refreshes. Understanding this flow is more useful than memorising a single code line because it explains how the complete feature works.
