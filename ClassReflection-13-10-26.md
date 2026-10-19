# CSC360 Class Notes – 13 October 2026

## Topics Covered
- Mouse dragging and coordinate handling
- Keyboard interaction
- Validation and clamping
- Project challenges and the approaches used to address them

## 1. Mouse Interaction
The project includes mouse actions for working with the active shape:
- Clicking the shape selects it as the current interaction target.
- Dragging changes its position.
- Clicking an empty area clears the selection.

Clearing a selection is not the same as deleting an object or resetting its properties. Mouse interaction is another example of event-driven programming: mouse presses, movements, and releases trigger different responses.

## 2. Why Grab-Offset Dragging Is Needed
A shape can jump if the application places its centre under the cursor when the user clicks near its edge. Grab-offset dragging avoids this by remembering the difference between the object's position and the pointer position at the start of the drag.

Conceptually:
- `offsetX = objectX - mouseX`
- `offsetY = objectY - mouseY`
- `newX = currentMouseX + offsetX`
- `newY = currentMouseY + offsetY`

The object then follows the pointer while keeping the same relative grab point.

### Coordinate systems
Mouse events can report coordinates in different systems, such as scene coordinates and a pane's local coordinates. Their origins may differ, so the program must use the correct coordinate system or convert between them. Incorrect coordinate handling can make a shape jump or move in an unexpected direction.

## 3. Keyboard Shortcuts
The presentation lists the following actions:

| Key | Action |
|---|---|
| Arrow keys | Move the object in small steps, described as 5 px |
| `+` | Scale up by 0.1 |
| `-` | Scale down by 0.1 |
| `C` | Centre the object |
| `R` | Reset to defaults |

The keyboard controller also needs to consider where the keyboard focus is. If the user is typing into a numeric field, a key should not accidentally trigger a shape shortcut.

This links to the event-handling topic: the same key event can mean different things depending on which UI component has focus.

## 4. Validation vs. Clamping
**Validation** checks whether an input is acceptable. **Clamping** forces a numerical value into a permitted range.

### Nonnumeric text
If the user types `abc` where a width is expected, the text cannot be parsed as a number. The application should reject it or retain the previous valid value. Clamping cannot convert `abc` into a number; parsing must happen first.

### Width limits
The presentation gives a width range of 10–400 px:
- A width of 100 remains 100.
- A width of -500 is corrected to 10.
- A width of 999 is corrected to 400.

### Position limits
The presentation gives an example where an X position of 99999 is corrected to an upper limit of 738 px. Boundary handling should consider the shape's dimensions, not just its centre, so that the full object stays visible.

### Scale limits
The presentation states that scale snaps to a minimum of 0.10. A zero scale collapses the object along the affected axis, while a very small scale may make it difficult to see or interact with.

`ValidationUtil` centralises reusable validation and value-cleaning logic so the same rules can be applied consistently.

## 5. Project Challenges and How the Design Addresses Them
### Challenge 1: Dragging conflicted with position sliders
Both methods affect where the shape appears. If the calculations disagree, the object may jump or one movement method may overwrite another.

The design distinguishes base position from translation:
- Effective X = base X + translation X
- Effective Y = base Y + translation Y

This is the conceptual relationship described in the presentation; exact behaviour depends on the source implementation.

### Challenge 2: Changing a square's width and height could make it a rectangle
A rectangle can have different width and height, but a square cannot. The square class must preserve the equal-side rule when either dimension changes.

### Challenge 3: Border patterns needed consistent appearance
Dashed or dotted strokes can look inconsistent if the dash pattern does not account for stroke thickness. The presentation identifies this as a design challenge; exact dash calculations should be checked in the source code if asked.

### Challenge 4: Invalid values could cause incorrect behaviour
Letters, negative dimensions, extremely large positions, and zero scale are examples of input that need handling. The approach is to parse text, validate numeric values, and clamp values that fall outside allowed ranges before applying them.

## 6. Keeping the Shape Inside the Preview
When the user moves or transforms the shape, the application attempts to keep it within the visible preview. A boundary check must account for the object's size; checking only its centre does not guarantee that all of the shape remains visible.

## 7. Connection to Earlier Lectures
The mouse and keyboard features apply event handling to a real graphics application. The geometry rules build on geometric primitives and transformations, while validation provides a controlled path from user input to the model. Together, these ideas help prevent unexpected movement and invalid shape states.
