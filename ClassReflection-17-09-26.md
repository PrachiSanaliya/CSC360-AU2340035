# Class Notes – 17 September 2026

## Running the JavaFX Project with Maven

- The JavaFX project was run through **Maven** to check whether the project was compiling and running correctly.
- Maven was used to verify that the project configuration and required dependencies were working properly.
- Compilation errors encountered during execution were used to identify problems in the project setup and source files.

## Java Class and File Naming

- Java has specific naming requirements for source files and public classes.
- When a class is declared as `public`, the **class name and filename must match**.
- For example:

```java
public class Main
```

must be saved as:

```text
Main.java
```

- Naming mismatches can cause compilation errors even when the code inside the class is otherwise correct.
- The files `main.java` and `controlPanel.java` were corrected to `Main.java` and `ControlPanel.java`.

## Package and Folder Structure

- The package declarations and corresponding folder structure were checked.
- Packages are used to organize Java classes within a project.
- Correct package organization becomes important when a project contains multiple classes and components.
- The package declaration and location of the Java file need to be consistent with the project's structure.

## Running and Verifying the JavaFX Application

- After correcting the compilation issues, the JavaFX application was run again.
- This verified the connection between:
  - Java source files
  - JavaFX
  - Maven configuration
  - Dependencies
  - Package structure
- Successful execution confirmed that the basic project setup was functioning correctly.

## JavaFX CSS and VS Code

- CSS was being used for styling the JavaFX interface.
- Some CSS properties were shown with red warnings in VS Code.
- These warnings were related to **JavaFX-specific CSS syntax** that may not be fully recognized by the editor's normal CSS validation.
- This helped distinguish between an actual project error and an editor validation warning.

## CSS Validation Configuration

- VS Code CSS validation was configured to reduce irrelevant warnings.
- This makes the editor easier to use when working with JavaFX-specific CSS.
- It also helps in identifying actual errors instead of treating every editor warning as a project compilation problem.

## `.gitignore`

- A `.gitignore` file was added to the project.
- It specifies files and folders that Git should not track.

Examples:

```text
target/
.vscode/
*.class
```

### `target/`

- Maven generates build-related files inside the `target/` directory.
- These generated files do not need to be manually added to the Git repository.

### `.class`

- `.class` files are compiled Java files.
- They can be generated again from the Java source files, so they generally do not need to be stored in Git.

### `.vscode/`

- This folder can contain local VS Code configuration.
- Such editor-specific files may not be required by every member of the team.

## Project Documentation and Screenshots

- A screenshot was created to document the completed **Stage 1 UI**.
- The screenshot was stored separately from the source code in:

```text
docs/screenshots/
```

- Keeping screenshots inside a documentation folder makes the repository more organized.
- It also provides a visual record of the project's development stages.

## Git Commit

- The completed Stage 1 changes were committed to Git.
- The commit included the relevant documentation screenshot and `.gitignore` changes.
- Commits act as checkpoints that record changes made during development.
- Meaningful commit messages make it easier to understand the development history of the project.

## Git Branch – `ui`

- The completed work was pushed to the **`ui` branch**.
- Working on a separate branch allows UI-related development to remain separate from the main project branch.
- Different members can work on different branches and later integrate their work.
- This approach helps avoid directly affecting the main branch while individual features are being developed.
