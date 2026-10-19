# CSC360 Class Notes – 1 October 2026

## Topics Covered
- Understanding the purpose of the Geometric Object Styler
- Connecting the project to computer graphics and earlier Java GUI lectures
- Understanding the interface and the main shape properties
- Identifying the problem the project is designed to solve

## 1. Connecting the Project to Computer Graphics
In earlier CSC360 lectures, we discussed the difference between computer graphics and digital image processing, along with geometric primitives and Java GUI libraries such as Swing, AWT, Java 2D, and JavaFX.

The Geometric Object Styler applies those ideas in one application. Instead of only drawing a fixed shape, it lets a user select a geometric object and change its properties while seeing the result on screen. This makes it an example of **interactive computer graphics**.

Computer graphics focuses on creating and manipulating visual objects. Digital image processing more commonly works with digital images and their pixels. Our project mainly belongs to computer graphics because it creates and transforms shapes.

## 2. What Problem Does the Project Solve?
If a shape is styled directly in Java code, a developer may need to edit the code, compile it, run the application, inspect the result, and repeat the process whenever a property changes.

For example:

```java
circle.setRadius(50);
circle.setFill(Color.LIGHTBLUE);
circle.setRotate(35);
circle.setStroke(Color.BLACK);
circle.setOpacity(0.8);
```

These statements change the circle's radius, fill, rotation, outline, and opacity. The project puts similar adjustments behind UI controls, so the user can change values without manually editing source code each time.

The project still uses Java internally. It changes how the user interacts with the program, not the fact that code performs the work.

## 3. Understanding the JavaFX Interface
This project builds on our earlier work with graphical user interfaces and event-driven programming.

- **Stage:** the main application window.
- **Scene:** the content displayed inside the Stage.
- **Layouts:** arrange controls and other interface elements.
- **Controls:** sliders, number fields, buttons, and selectors allow the user to make changes.
- **Preview area:** displays the current shape.

The interface can be understood as a Stage containing a Scene, which contains layouts, controls, and the shape preview.

## 4. The Main Areas of the Application
The presentation shows three main areas:

- **Control Panel:** used to choose the shape and adjust its properties.
- **Preview Area:** displays the active geometric object.
- **Property View:** displays the object's current values and status information.

These areas need to remain in sync. For example, if the user changes rotation, the shape should rotate in the preview and the displayed property should reflect the new value.

This connects to the event-handling concept covered earlier: a user action generates an event, the program responds to it, and the interface updates.

## 5. Geometry and Appearance Properties
### Geometry and transformations
- **Position (X and Y):** where the object is located.
- **Width and height:** the object's dimensions.
- **Rotation:** turns the object around a pivot.
- **Scale:** changes the displayed size.
- **Translation:** adds a movement offset.
- **Flip/reflection:** mirrors the object horizontally or vertically.

These are not all the same operation. Moving an object changes its location, rotation changes its orientation, and scaling changes its size.

### Appearance
- **Fill:** the inside colour of the shape.
- **Stroke:** the outline or border.
- **Opacity:** how solid or transparent the object appears.
- **Gradient:** a gradual transition between colours.
- **Shadow/glow:** effects that change how the object appears.

For example, `setFill(Color.LIGHTBLUE)` changes the interior, while `setStroke(Color.BLACK)` changes the outline. `setOpacity(0.8)` means the object is 80% opaque.

## 6. Supported Shapes and Their Rules
The presentation lists five shape options:

- **Circle:** has the same radius in every direction.
- **Rectangle:** width and height can differ.
- **Square:** all sides must be equal, so width and height must match.
- **Ellipse:** horizontal and vertical dimensions can differ.
- **Polygon:** implemented as a fixed five-point star in this project.

These shapes are examples of geometric primitives, a topic covered earlier in the course. The project adds controls and transformations around them.

## 7. Why Validation Is Needed
UI controls make changes easier, but users can still enter values that do not make sense, such as negative dimensions or extremely large positions. The program therefore needs rules for acceptable values and for keeping the object visible inside the preview.

The validation and boundary-handling details were part of the project's design review and are covered further in the later class notes.

## 8. Main Understanding
The project combines ideas from earlier lectures: geometric primitives, Java GUI programming, event-driven interaction, and drawing/manipulating shapes. The new part is connecting these concepts into one interface where controls, the shape, and the displayed properties respond to each other.
