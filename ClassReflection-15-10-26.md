# CSC360 Class Notes – 15 October 2026

## Topics Covered
- Reviewing the project's design decisions
- Limitations and possible future improvements
- Connecting project knowledge to the complete group viva
- Maven build, test, and run workflow

## 1. What the Team Learned from the Design
### Separating work areas
The presentation notes that dividing work into different packages or domains can reduce merge conflicts. For example, UI classes and geometry classes can be developed in separate areas. This is a collaboration choice rather than a rule required by Java or Git.

This connects to earlier classes on Git and branches. A Git branch manages a line of development; a Java package organises related classes. They serve different purposes, but both help keep a project organised.

### Separating position and translation
Base position and translation offset have different roles. Keeping them separate helps avoid conflicts between the position controls and mouse dragging.

### Centralising validation
Shared validation methods help ensure that different controls follow consistent rules when they update the same property. The goal is not to remove every check, but to avoid inconsistent copies of the same validation logic.

## 2. Project Limitations
The presentation identifies four limitations:

1. **One object at a time:** the application is not a full vector editor with multiple independently editable objects, grouping, and layers.
2. **Fixed polygon:** the polygon option is a fixed five-point star, not a general-purpose polygon editor.
3. **Automated tests focus on validation:** the test suite does not comprehensively cover every graphical rendering, styling, or mouse/keyboard behaviour.
4. **Minimum window size:** the presentation specifies a window of at least 900 × 600 for the interface to work as intended. These are window dimensions, not shape dimensions.

Recognising limitations is part of understanding the implementation. A feature shown as future work should not be described as already available.

## 3. Possible Future Improvements
- **Undo/redo history:** undo reverses a recent change; redo reapplies a change that was undone. This requires storing enough previous state or operation history.
- **Saved style presets:** allow users to save and reuse combinations of fill, stroke, opacity, and effects.
- **Light/dark theme:** change the interface theme without changing the geometry.
- **Save/load styles:** store an object's settings in a file and restore them later.

**Serialization** means converting an object's state into a representation that can be saved and reconstructed. A save/load feature would need a defined file format and validation when settings are loaded.

## 4. Building and Running the Project with Maven
Earlier classes covered Java installation, compilation, project structure, and Maven. The project applies those concepts using JavaFX.

```powershell
cd "C:\path\to\GeometricObjectStyler"
java -version
javac -version
mvn -version
dir pom.xml
mvn clean compile
mvn test
mvn javafx:run
```

- `cd` changes the terminal's current folder. Maven commands should run from the project directory containing `pom.xml`.
- `java -version` checks the Java runtime available to the terminal.
- `javac -version` checks the Java compiler.
- `mvn -version` checks Maven and shows which Java installation Maven uses.
- `dir pom.xml` checks that the Maven project file exists in the current directory.
- `mvn clean compile` removes previous build output and compiles the main source code.
- `mvn test` runs the configured automated tests.
- `mvn javafx:run` asks the configured JavaFX Maven plugin to launch the application. The plugin must be configured in `pom.xml`.

`BUILD SUCCESS` means the requested Maven step succeeded. It does not automatically mean the JavaFX window has opened; compiling and launching are different tasks.

### Role of `pom.xml`
`pom.xml` describes the Maven project, dependencies, and build plugins. Maven uses this information to compile, test, and run the application.

## 5. Explaining the Complete Project in the Viva
A clear explanation follows the flow of the application:

1. The user changes a control in the JavaFX interface.
2. The control reports the new value through an event or callback.
3. `StylerController` coordinates the requested change.
4. The geometry model or styling component applies it.
5. Validation checks that the value follows the project's rules.
6. The preview and property view reflect the updated state.

The most important concepts to understand are:
- The five supported shapes and their individual geometry rules.
- Position, translation, dimensions, scale, rotation, and reflection.
- Inheritance, encapsulation, polymorphism, abstraction, and the Factory pattern.
- How a slider callback reaches the model.
- Mouse dragging, coordinate conversion, keyboard shortcuts, and preview boundaries.
- Validation vs. clamping.
- Current limitations vs. proposed future improvements.

## 6. Using Source Code During Revision
The presentation contains shortened code examples and descriptions of the design. If a question asks for the exact method, formula, default value, or validation range, the relevant Java source file is the final authority. The presentation alone does not establish every implementation detail.

The project can be understood by connecting concepts from earlier lectures: Java classes and packages organise the code; JavaFX provides the GUI; event handling connects controls to actions; geometry classes implement shape behaviour; and Maven manages the build workflow.
