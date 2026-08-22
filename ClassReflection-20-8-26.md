# Class Reflection (20 August 2026)

## Topics Covered

-   Writing class reflections in the required format
-   Git repository and reflection file structure
-   Markdown files
-   Import and package in Java
-   `java` and `javac`
-   Graphics in Java
-   `JFrame` and custom components
-   `paint()` and `@Override`
-   Process of creating drawings using Java
-   Different types of classes in Java
-   `drawRect()` and coordinate-based drawing
-   Drawing a triangle using equations of lines
-   Conditions for forming a triangle

## Writing Class Reflections

The class began with understanding how the course reflections should be
written and organized.

-   The Git repository used for the course is `CSC360-AU2340035`.
-   A separate folder named `reflections` is used to store the
    reflection files.
-   Reflection files are written in Markdown format.
-   The file naming format is `sessionXX-DDMMYY.md`.
-   The title of the Markdown file follows the format
    `# Class Reflection(DD month YYYY)`.
-   A list of the topics covered in the class is written first.
-   Subtopics are then created based on that list.
-   Images can also be referred to inside a Markdown file.
-   The reflection should be specific about the points that were
    learned.
-   Generalized statements should be avoided.
-   Heavy paragraphs should not be used.
-   Line breaks should be added wherever required to make the reflection
    clear and readable.

## Import and Package in Java

The difference between an import and a package was discussed.

An `import` statement is used to make a class from another package
available for use in a Java program.

For example:

``` java
import java.awt.Graphics;
```

A package is used to organize related Java classes. `org.example` was
discussed as an example of a package name.

The package and import have different purposes in a Java program. A
package provides the organization of classes, while an import allows a
class from a package to be used in another class.

## Java and Javac

The use of `java` and `javac` through the command line was discussed.

-   `javac` is used to compile a Java source file.
-   `java` is used to run the compiled Java program.
-   These commands can be used through the CLI, which stands for Command
    Line Interface.

The basic process is:

``` text
Java source file
       ↓
     javac
       ↓
Compiled .class file
       ↓
      java
       ↓
Program execution
```

## Graphics in Java

The use of graphics in the previous activity of drawing a square using
Java was discussed.

The `Graphics` class provides the functionality required for drawing
graphical objects.

It can be imported using:

``` java
import java.awt.Graphics;
```

The `Graphics` object is used by the drawing component to perform
drawing operations.

In the previous square-drawing activity, the graphics object was used to
specify the position and dimensions of the square and to display the
square inside the graphical window.

The drawing process involves a graphical window, a component inside the
window, and the graphics object used to perform the drawing.

## JFrame and Custom Component

`JFrame` was discussed as the main graphical window used in a Java Swing
application.

A custom component can be placed inside the `JFrame`. This component
provides the area where the drawing is performed.

The basic process can be represented as:

``` text
JFrame
   ↓
Custom Component
   ↓
paint()
   ↓
Graphics
   ↓
Drawing
```

The `JFrame` provides the window, while the custom component provides
the area on which the graphical object can be drawn.

## paint() and @Override

The `paint()` method was discussed as part of the process of creating a
drawing using Java.

The `paint()` method receives a `Graphics` object, which can then be
used for drawing.

For example:

``` java
@Override
public void paint(Graphics g) {
    // drawing code
}
```

The `@Override` annotation is used when a method inherited from a parent
class is redefined in a subclass.

In the drawing program, the painting method is used to define what
should be drawn on the custom component.

## Process of Creating a Drawing Using Java

The process of creating a drawing using Java was discussed step by step.

``` text
Create JFrame
      ↓
Create Custom Component
      ↓
Override paint()
      ↓
Receive Graphics object
      ↓
Specify coordinates and dimensions
      ↓
Use drawing method
      ↓
Display the graphical object
```

This shows how the graphical window, custom component, `paint()` method
and `Graphics` object work together to create and display a drawing.

## Drawing a Rectangle Using drawRect()

The method:

``` java
g.drawRect(200, 150, 100, 100);
```

was discussed in detail.

The general structure of the method is:

``` text
drawRect(x, y, width, height)
```

Therefore:

-   `200` represents the x-coordinate of the starting point.
-   `150` represents the y-coordinate of the starting point.
-   `100` represents the width.
-   `100` represents the height.

The coordinate `(200, 150)` represents the top-left point of the
rectangle.

The remaining two values specify the width and height of the rectangle.

Since both the width and height are `100`, the resulting shape is a
square.

The Java graphics coordinate system starts from the top-left of the
drawing area:

``` text
(0,0) ----------------------→ X
  |
  |
  |
  ↓
  Y
```

Therefore, the position of a graphical object is specified using
coordinates, while its dimensions are specified using width and height.

## Different Types of Classes in Java

Different types of classes in Java were discussed.

These included:

-   Class
-   Subclass
-   Anonymous class
-   Nested class
-   Static class

These different types provide different ways of organizing classes and
defining relationships between classes in a Java program.

## Drawing a Triangle Using Line Equations

The class also discussed how a triangle can be drawn when the three
equations of its lines are given instead of directly providing the three
points.

The three equations represent the three lines that form the triangle.

The process involves finding the intersection points of the lines.

The general process is:

``` text
Three equations of lines
          ↓
Find intersection points
          ↓
Substitution
          ↓
Solve equations
          ↓
Obtain the three points
          ↓
Draw the triangle
```

The three intersection points represent the three vertices of the
triangle.

Therefore, when only the equations of the three lines are provided, the
points have to be calculated first before the triangle can be drawn.

## Condition for Forming a Triangle

The relationship between the lengths of the three sides of a triangle
was also discussed.

For three side lengths `a`, `b`, and `c`, the condition can be written
as:

``` text
|a - b| < c < a + b
```

This means that the length of one side must be greater than the
difference between the other two sides and smaller than their sum.

The same condition can be applied by considering each side in relation
to the other two sides.

Thus, the three lengths can form a triangle only when the triangle
inequality is satisfied.
