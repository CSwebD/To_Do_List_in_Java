# ToDoList

A simple modular Java application to manage a to-do list with a graphical user interface (GUI). This project demonstrates the use of the Java Platform Module System alongside Swing components for building desktop applications.

## Module System

* **Module Name:** `ToDoList`
* Declared in `module-info.java`:

  ```java
  module ToDoList {
      requires java.desktop;
  }
  ```

  * Depends on the `java.desktop` module for Swing GUI components.

## Features

* Create, view, and delete tasks.
* Visual representation of tasks in a list.
* Simple and intuitive GUI with a title bar, footer, and task panel.

## Project Structure

```
classes/
├── module-info.java        # Module declaration
├── ToDoList.java           # Main launcher class
├── AppFrame.java           # Main frame containing GUI components
├── TitleBar.java           # Custom title bar component
├── Footer.java             # Footer panel with status/info
├── List.java               # Panel displaying the list of tasks
└── Task.java               # Model class for a task
```

## Requirements

* Java Development Kit (JDK) 9 or higher
* No external libraries required (relies solely on standard Java modules)

## Build Instructions

1. **Compile** the source files:

   ```bash
   javac --module-source-path src -d out \
         $(find src -name "*.java")
   ```
2. **Run** the application:

   ```bash
   java --module-path out -m ToDoList/ToDoList
   ```

> **Tip:** You can use an IDE (e.g., IntelliJ IDEA or Eclipse) that supports Java modules to import the project and run directly.

## Usage

1. Launch the application.
2. Use the input field to enter a task description.
3. Click **Add** to append the new task to the list.
4. Select a task and click **Delete** to remove it.
5. View application status in the footer.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests:

1. Fork the project.
2. Create a feature branch: `git checkout -b feature/MyFeature`.
3. Commit your changes: `git commit -m "Add MyFeature"`.
4. Push to the branch: `git push origin feature/MyFeature`.
5. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](/LICENSE) file for details.
