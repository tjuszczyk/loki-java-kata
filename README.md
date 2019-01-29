# loki-java-kata

## KATA 1

### 0.1 - (JDK)
* Find your java location. Check java version.
* See what executable commands are accessible in JDK

* *Bonus:* Install Java 11. Run your buildtool and IDE with Java 11

### 1.1 -  (CODE, JDK) Hello 'Loki', javac/java/jar tools
* Write ‘Hello Loki!’ program. Run from the IDE
* Compile it and run using javac/java programs
* Create a jar manually with/without manifest
* Run program manually from jar using java program
* Add second class: Greetings - printing greetings, invoked from main.
* Repeat 2-4.
* Write proper unit test for Greetings class

* *Bonus:* propose a test for main method.

### 1.2 - (CODE) Environment variables, system properties, program arguments

TDD(!) Think how to make your code testable.

* Write ‘Hello <NAME>!’ program. Name is read as input argument.
* Write ‘Hello <NAME>!’ program. Name is read as environment var. Input arg takes precedence.
* Write ‘Hello <NAME>!’ program. Name is read as system property. Input arg takes precedence, env. var is overriden.

* *Bonus:* checkout lib doing commands processing (ex -person=Tomasz)
* *Bonus:* http://codingdojo.org/kata/Args/ 

### 1.3 - (GRADLE) Gradle build lifecycle, (java, application, shadow) plugins

* Gradle version and list all tasks
* Configure wrapper task to use latest gradle 5.
* Write your own simple tasks in modules. Using doFirst or doLast sections - show gradle initialisation vs execution phases
* Configure ‘application’ plugin to run your main class
* Configure ‘shadow’ plugin to run your fat-jar application

### 1.4 (CODE) Property files

* Create property file application.properties in resource folder, with single property name. Read property file only if no other sources of name provided and use value to format greetings. Note: property file should be part of your program distribution (jar) 
* Read property file as external resource (path given as a program parameter - refactor code not to expect nam as a parameter)
