# Class Reflection (10 September 2026)

## Topics Covered

- Streaming and its difference from files
- Streaming usage in graphics
- Video as a graphics
- Population mean and sample mean
- Expected value and variance
- XML for drawing
- SVG and full resolution graphics
- Commercial software used in SVG
- Networking in graphics
- Databases in graphics
- AWT and Advanced AWT

## Streaming

- Streaming has been defined as a case whereby a source is able to keep on generating data without a known endpoint.
- A loop can symbolize an ongoing process whereby the source keeps on generating data, but the viewer is not sure about when the generation of data will end.
- Unlike a normal file where data has a clear structure and endpoint, the stream does not have such characteristics.

### Streaming vs Files

- A **file** is a stored data which has a known start and endpoint.
- **Streaming** handles the process whereby data is delivered either continuously or progressively.
- The user is able to access the data even when it is still in the process of delivery.

## Streaming in Graphics

- Streaming is applicable in cases where continuous transfer or display of graphical information is required.
- Some instances include video and any other graphical information that is produced in real time.
- Streaming enables processing and display of the graphics in a continuous way as opposed to needing all the data at once.

### Video as a Sequence of Graphics

- A video may be seen as a sequence of **graphics frames**.
- In this case each frame is an image and the display of the frames in quick succession gives the illusion of movement.

```text
Frame 1 → Frame 2 → Frame 3 → Frame 4 → ...
```

## Population Mean and Sample Mean

### Population Mean

- The **population mean** is denoted as **μ (mu)**.
- This is the mean of all the values in the population.

\[
\mu = \frac{\sum x_i}{N}
\]

where `N` is the population size.

### Sample Mean

- The **sample mean** is denoted by **x̄ (x-bar)**.
- It is the mean computed by taking values from a sample of the population.

\[
\bar{x} = \frac{\sum x_i}{n}
\]

where `n` is the sample size.

### Expected Value

The expected value was expressed as:

\[
E(X) = \sum x_i P(X=x_i)
\]

where the values of `X` are assigned to their probabilities.

## Variance

Variance was explained as the expected square deviation of a variable from its mean.

\[
V(X) = E(X^2) - [E(X)]^2
\]

also be represented as:

\[
V(X) = E[(X-\mu)^2]
\]

where `μ` represents the population mean.

- Variance is used to measure how spread out the values of the variable are from its mean.
- Squaring the deviation avoids the cancellation of positive and negative deviations.

## XML for Drawing

- The use of **XML** was talked about as a means of defining graphical drawings.
- XML can provide information regarding graphical objects in a structured manner.
- Hence, a drawing may be defined in a structured way using XML tags and attributes rather than just being represented as pixels.

## SVG

- **SVG (Scalable Vector Graphics)** was also talked about as a format used for representing graphics based on vector information.
- SVG graphics may be scaled in size without losing their graphical qualities.
- SVG becomes important when graphics are required to retain their clarity at various scales and resolutions.

### Commercial Software for SVG

- Commercial software used for SVG graphics was talked about.
- This software enables the creation and modification of vector graphics.

## Networking in Graphics

- Networking is important in cases where graphics need to be exchanged between various computers or other devices.
- Networking is required for applications involving sharing, transmission, streaming, and remote access of graphics.
- Networking becomes relevant in cases where graphics are not stored locally on a computer.

## Databases in Graphics

- Databases usage in graphics was highlighted.
- Information relevant to graphical objects and applications could be stored in a database.
- Information needed by graphics applications could be retrieved from the database without having to store all the information in the application itself.

## AWT and Advanced AWT

- AWT is short for Abstract Window Toolkit.
- The concept of AWT was discussed in terms of Java graphical applications.
- AWT comprises classes and components that are utilized for constructing graphical user interfaces.
- Advanced AWT concepts were also covered under the topic of Java graphics and GUI.
