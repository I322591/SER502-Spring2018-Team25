# SER502-Spring2018-Team25: Programming Language ROCH

# System on which your compiler and runtime are built

Windows

# Tools used

- Lexical Analysis and Parsing is done using Antlr 4.7
- Intermediate code generation is done using Antlr and JAVA
- Runtime Environment is in Java 1.8

# Link to the YouTube video

https://youtu.be/xjS6flcuo9s

# To build the project
We are using maven to build our project.
Navigate to the directory which contains the pom.xml

Execute the command 
             **mvn clean**
Then execute command 
             **mvn package**

# Execution of the JAR File
The jar file   **SER502_Team25.jar** is present in the data directory
Navigate to the data directory, which contains the sample programs

Run command 
           **java -jar SER502_Team25.jar <name_of_the_sample_program>**
           
# Additional functionalities

- Display statement to print the output on screen
- Universal variable declaration i.e. the variable can be declared
  anywhere is the program.
- The nested conditional and iterative operation.
- Relational operators were implemented.
- Variable declaration without definition and consecutive variable
declaration and definition for ease of use.
