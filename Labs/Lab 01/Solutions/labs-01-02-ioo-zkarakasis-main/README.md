# INTRODUCTION TO OBJECT-ORIENTATION

-----------------

## LAB 1: Classes

### Introduction
This lab is about building Java classes.

By the end of this lab the student should know how to:
Develop a Java class in two stages by:
+ declare variables as its attributes, and
+ implementing its methods.

**Important Note**: Name your classes (and files) using the names of the exercises that appear in bold.

### 1.1	Rectangle
Create a class Rectangle.
The class has two attributes, `height` and `width`.
The methods (behaviour) are mainly `set` and `get` methods for both attributes (the set methods should verify that height and width are each floating-point numbers in the range 0.1…20.0), together with:
+ a method for getting the perimeter of the rectangle,
+ a method for getting the area of the rectangle, and
+ a method that returns whether the rectangle is a square.

How do we ensure that a rectangle's width and height are **always** above 0 and less or equal to 20.0?

### 1.2	Student
An entity in a problem is a Bachelor's student.
The identified attributes are:
+ `name`
+ `registrationNumber`, e.g. "CSY12345"
+ `stageOfStudies`, i.e. year of studies. A new student starts at Stage 1 and progresses to Stage 2 and Stage 3 if all the required credits for the previous credits have been gathered.
+ `credits`: the number of credits the student has gathered for the **currect** stage; Zero for any new student; When the stage progresses, credits become zero again.

The methods (behaviour) for this class are mainly `set` and `get` methods, together with:
+ A method for proceeding to the next level of studies, if the student’s total credits in the current stage are 120.
+ A method for passing a module: When a module is passed, the credits of that module are added to the credits of the student. Note that he number of credits may be different from one module to another. Also, if the credits become 120, the student progresses to the next stage of studies.


> From the **LIBRARY Case Study** you may now do exercise(s) **1**.

------------------------------

## LAB 2a: Objects

### Introduction
This Lab is about constructing and using objects of the classes that were implemented in the previous lab session.

By the end of this lab the student should know how to:
Develop a program in order to:
+ construct objects of a class, and
+ use message passing to request the objects to do several things (i.e. calling their methods).

**Important Note**: Name your classes (and files) using the names of the exercises that appear in bold.

### 2a Program
Create this class as a wrapper of the main method and:
+ Construct at least one object of the Student and Rectangle classes.
+ Call all the get methods and print the returned values to see the initial state of the object.
+ Call each of the set methods in order to change the state of the object, each time getting and printing the updated attribute value (to make sure set method is correct).
+ Call any other available class method.


*Note*: What are the initial attribute values of the objects created? Next week we will learn how to define attribute values at the point of constructing an object.

------------------------------


## LAB 2b: Constructors

### Introduction
This lab is about implementing developer-defined constructors.

By the end of this lab the student should know how to:
+ implement multiple constructors for a class, and
+ call them for the creation of new objects.

### 2b.1	Rectangle
Implement a constructor that allows the initialization of both `Rectangle` attributes (i.e. the construction of a rectangle of any valid size).

### 2b.2	Student
Implement a constructor that allows the initialization of the `name` and `registrationNumber` of a student. What do you think should be default values for the `credits` and `levelOfStudies` attributes?

### 2b.3 Program
Modify the program implemented in the previous weeks to test all the newly created constructors of the above classes.


> From the **LIBRARY Case Study** you may now revisit exercise(s) **1** in order to implement your own constructors.
