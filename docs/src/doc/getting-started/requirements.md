
!!!warning Before starting a project
    Before starting a project make sure you read the [Exporting](../user-guide/exporting.md) documentation! Depending on your chosen platform (like native images with GraalVM or Android) there are important details to consider (like third party dependencies and host systems to compile your game on).  
    Failure to do so or understanding what is needed can lead to big problems once you're at the stage of exporting and shipping your project.  
    Also make sure to regularily test your exports on each platform. It's best to even test the exports on each platform before even writing anything else than the first test class

## Java

To use this module at least JDK 11 is needed, note you will need the JDK not just the JRE, and the environment variable `JAVA_HOME` to be present before being able to run the custom godot editor.

### Mac

You can install Java via [homebrew](https://brew.sh/). Once you installed it, you can run `brew install openjdk@21` to install the LTS version of Java from openjdk. If you want to pick a different version, you can run `brew search jdk`.

!!! warning
    On macOS apps started from the GUI cannot see environment variables from bash or zsh, only command line apps can. Set environment variable using launchctl.
    ```shell
    launchctl setenv JAVA_HOME pathtoyourjava
    ```

### Linux

You can install Java via your distributions package manager.

### Windows

You can install Java via [Chocolatey](https://community.chocolatey.org/). For example, to install [AdoptOpenJDK](https://adoptopenjdk.net/) you can run `choco install adoptopenjdk21`.

## IDE

There is currently no plan to support the built-in Godot editor, using [IntelliJ IDEA](https://jetbrains.com/idea) is strongly recommended (the community edition is free). Editors such as VSCode can be used, however, we only provide first class support for IntelliJ IDEA. You can install it via [JetBrains Toolbox](https://www.jetbrains.com/toolbox-app/) app.

### Intellij IDEA Plugin

We also recommend installing our [IntelliJ IDEA plugin](https://plugins.jetbrains.com/plugin/16505-godot-jvm) as it provides you with a lot of useful checks and helpers to detect errors during development.

## Godot Editor

You need our custom engine build from the latest [GitHub releases](https://github.com/utopia-rise/godot-kotlin-jvm/releases) to be able to use this project. If you need other modules you can also [build it yourself](../contribution/setup.md).

## Exporting

You need our custom export templates for your exported games to work with the JVM. Have a look at the [Exporting](../user-guide/exporting.md) documentation.
