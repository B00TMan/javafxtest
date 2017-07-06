# javafxtest
Determining viability of JavaFX

### Setup:
- Checkout a new branch from master
- Open the maven project from your favorite Java IDE.
- Install SceneBuilder: Newer versions of Java 8 do not come with JavaFX SceneBuilder.  You will need to download it from http://gluonhq.com/products/scene-builder/.

### Running The App
This is a Spring Bootstrap Starter project. In order to run the application, execute the **_spring-boot:run_** target.

### The Code
- As stated, this is a Spring Boot Starter project.  Therefore, even though it's a desktop application, you can leverage all features available from the different Spring frameworks.
- One caveat is that Spring Boot and JavaFX provide different execution entry points.  When JavaFX creates a new application instance, it does so outside of the Spring container, therefore losing all dependency injections.  In reality, two application instances are created.  One from Spring Boot and the other from JavaFX.  To resolve this, this project utilizes a library that manages to merge JavaFX with Spring.  Not only does it allow the JavaFX application to be run in the Spring container, but many of its cusotm annotations extend both JavaFX and Spring annotations (e.g. `@FXMLView`), making them serve as both in one annoatation.  Here's the web page with more detail on the library:  https://www.felixroske.de/page/programmierung/index.html.
