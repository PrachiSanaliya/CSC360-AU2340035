# Class Reflection (15 September 2026)

## Topics Covered

- Working on the group project
- Sharing project duties between members
- Branching the project in Git
- Learning about the usage of branching in group projects
- Comparing collaborative software development with actual business
- Planning the JavaFX geometric object application
- Creating geometric object and its features

## Group Project

The assignment is:

> **Develop a JavaFX program with UI for styling a single geometric object.**

This lesson was mostly devoted to working on the project and not a new topic.

## Dividing Work in a Group

There are **four people** in our group, thus the project was divided into different duties.

### Member 1 – JavaFX UI and Controls

- JavaFX Stage and Scene
- Left control panel
- `ColorPicker`
- Sliders
- Buttons
- Object preview area

### Member 2 – Geometric Object and Transformations

My assigned part of the project will be:

- Creation of the geometric object
- X/Y Position
- Width and Height
- Rotation
- Scale
- Translation
- Selection of the object

I'm working on the geometric object and the parameters that govern its placement, dimensions, and transformations.



### Member 3 – Styling

- Fill color
- Border
- Border width
- Transparency
- Gradient fill
- Drop shadow effect

### Member 4 – Interaction and Integration

- Dragging the object using the mouse
- Keyboard interactions
- Apply and Reset functions
- Integration between the User Interface and the Object
- Error Handling
- Integration and Testing

## Git Branches

- We created distinct **Git Branches** to facilitate development of our respective components of the group project.
- A branch enables the member to develop their own section of code without making any changes to the main branch.
- Code can be integrated back to the common project later.

A simplified workflow is:

```text
Main branch
    |
    ├── Member 1 branch
    ├── Member 2 branch
    ├── Member 3 branch
    └── Member 4 branch
             |
       Individual work
             |
       Merge / Integration
             |
        Main project
```

## Reasons to Have Branches for Group Collaboration

- All participants can work on different parts of the program simultaneously.
- Different parts can be developed independently and then combined together.
- The modifications done by one member will not affect right away the work done by another participant.
- All parts can be tested before being incorporated into the main project.

As an example of such approach of coding, our professor mentioned **the real-life corporate software development process** when developers often work on different branches of the project which they later combine into one.

## My Contribution - Geometric Object

For my contribution, I can use JavaFX `Rectangle` to implement the geometric object.

The simplest geometric object can be done as follows:

```java
Rectangle rectangle = new Rectangle(100, 100);
```

The rectangle's position can then be controlled using its X and Y coordinates:

```java
rectangle.setX(200);
rectangle.setY(150);
```

Its size can be changed using:

```java
rectangle.setWidth(100);
rectangle.setHeight(100);
```

### Rotation

The object can be rotated using:

```java
rectangle.setRotate(30);
```

This changes the rotation angle of the rectangle.

### Scaling

The size of the object can also be changed using scaling:

```java
rectangle.setScaleX(1.5);
rectangle.setScaleY(1.5);
```

### Translation

Translation changes the position of the object without changing its basic dimensions.

For example:

```java
rectangle.setTranslateX(50);
rectangle.setTranslateY(30);
```

### Object Selection

It also makes sense to make the object selectable, because this way you can change the object properties via the user interface.

Some examples of controls to connect to a selected object could be the following:

- Position controls
- Size controls
- Rotation controls
- Scale controls
- Translation controls

## Initial Implementation Idea

Some initial implementation idea for my part of the task is to create the rectangle and add it to the scene in JavaFX.

E.g.

```java
Rectangle rectangle = new Rectangle(100, 100);

rectangle.setX(200);
rectangle.setY(150);

Group root = new Group(rectangle);
Scene scene = new Scene(root, 600, 400);
```

This provides a basic geometric object that can later be connected to the UI controls created by the other team members.

The main idea is to keep the geometric object's properties accessible so that the UI can modify them during integration.

## Connecting My Part with the Group Project

The different parts of the project will eventually work together:

```text
UI Controls
    ↓
User changes a property
    ↓
Event handling
    ↓
Geometric object property changes
    ↓
Object is updated in the preview area
```

For instance, altering the X/Y value ought to affect the location of the rectangle, whereas altering the rotation value would rotate the rectangle.

This implies that my module will deliver the **geometric object and its editable attributes**, and the other modules will give the controls, styling, interactivity, and integration.

## Project Status

- All responsibilities of the project have been assigned to all four members of the group.
- Different Git branches have been created for all the members of the team.
- The tasks allocated to me will include the geometric object, its location, size, rotation, scale, translation, and selection.
- A rectangle has been chosen as the first geometric object to build the structure around it.
- The structure built using JavaFX can later be integrated with the UI and styling functionalities.
