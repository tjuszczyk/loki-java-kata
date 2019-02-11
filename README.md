# loki-java-kata

## KATA 1 - Hello Java

**Goal:** Introduction to Java language.

- basic syntax
- introduction to JDK command tools (javac, java, jar)
- introduction to *gradle* build tool
- introduction to TDD process
- introduction to JUnit 5

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

* **Bonus:** propose a test for main method.

### 1.2 - (CODE) program arguments

TDD(!) Think how to make your code testable.

* Write ‘Hello <NAME>!’ program. Name is read as input argument.

* **Bonus:** checkout lib doing commands processing (ex -person=Tomasz)
* **Bonus:** http://codingdojo.org/kata/Args/ 

### 1.3 - (GRADLE) Gradle build lifecycle, (java, application, shadow) plugins

* Gradle version and list all tasks
* Configure wrapper task to use latest gradle 5.


###Summary

- Theory
  - JDK, JVM, JRE
  - javac, java, jar, jar manifest
  - GC
  - compiler vs interpreter

- Language fundamentals:
  - Arrays initialisation
  - difference between *Array* and *List*
  - *for* loop
  - *main* method, program parameters
  - *Writer* class, *System.out*
  - Program composition - *class* introduction
  - String concatenation. String manipulation.
  
- Gradle
  - checking version and available tasks
  - wrapper task

- Testing techniques
  - JUnit5 test structure
  - TDD lifecycle
  - //given //when //then test structure
  - introduction to JUnit 5 assertions
  - refactoring code to support testability (pass Writer instead of hardcoded Syste.out)

## KATA 2 - Hello Refactoring

**Goal:** Introduction to code refactoring.

- refactoring - change method signature step by step
- more about Lists
- Vararg
- null and why to avoid it
- testing exceptions in JUnit 5, parameterised tests

### 2.1 - (Refactoring)

* refactor existing Greeting.class greet method signature - List instaed of Array
* gradle: add new project dependency - *guava* library
* good coding practises: avoid nulls, fail fast -> use guava Preconditions and @NonNull. Add tests for exceptions.
* test code refactoring -> test exceptions with fluent API (JUnit5 or AssertJ)
* Improve code using StringBuilder
* Further code optimisation with streams
* test code refactoring -> parameterised test

### Summary

- Theory
  - introduction to heap and objects (very basic), object reference, orphaned objects on heap
  - introduction (very basic) to inheritance tree
  - Object class as a root of Java class hierarchy

- Language fundamentals:
  - StringBuilder, StringBuffer, String concatenation
  - null
  - throwing exceptions. NullPointerException
  - Stream API, collecting
  
- Design principles
  - null avoidance. Favor empty collections to null
  - Fluent interface - introduction
  
- Gradle
  - setting up project dependencies
  
- Libraries
  - Guava (introduction), Preconditions checking, @NonNull
  - AssertJ - fluent assertions, testing exceptions  

- Testing techniques
  - testing exceptions with fluent interface
  - Data Driven Testing with JUnit 5 Parameterised Tests
  
## KATA 3 - Hello properties. Hello memory.

### 3.1 - (CODE) Environment variables, system properties

* Write ‘Hello <NAME>!’ program. Name is read as environment var. Input arg takes precedence.
* Write ‘Hello <NAME>!’ program. Name is read as system property. Input arg takes precedence, env. var is overriden.

### 3.2 - (GRADLE) Gradle build lifecycle, (java, application, shadow) plugins

* Write your own simple tasks in modules. Using doFirst or doLast sections - show gradle initialisation vs execution phases
* Configure ‘application’ plugin to run your main class
* Configure ‘shadow’ plugin to run your fat-jar application

### 3.3 (CODE) Property files

* Create property file application.properties in resource folder, with single property name. Read property file only if no other sources of name provided and use value to format greetings. Note: property file should be part of your program distribution (jar) 
* Read property file as external resource (path given as a program parameter - refactor code not to expect nam as a parameter)

## Backlog

- Regexp
- Threads
- Immutable object

