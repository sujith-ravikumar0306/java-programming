----------------------------------------------------------------------------------
Object Oriented Programming
----------------------------------------------------------------------------------
OOP is the use of classes and its instances(entities) which are more over associated with the real world problem.

*Class: A template to create an object with its own properties(data members and member functions)
        ->will never take space in memory.

*Object: Entity derived from class to represent a real world optimised variable.
        ->Stored in heap.
        ->default value of non-primitive members are null, and primitive are (default variable types)

*Access modifiers: Restricts the properties and functionality of a class.
        ->Public: can be accessed within any part of the project.
        ->Protected: Not accessible only for outside world.
        ->Defalut: Not accessible in outside world and subclasses of different packages.
        ->Private: only accessible within the class.

*Getters and Setters: Accessors and Mutators respectively that provides higher level of abstraction by protecting
                        data that can be accessed in controlled manner.

*"this" keyword: refers to current object.
        ->used to differentiate between the properties of an object and local variables within a class-function.

*Constructors: special methods that are use to initialize objects. It has same name of its class but without any retturn type.
        ->We can create any number of constructors for a class with any type/numbers of arguments.
        ->The code for creating an object is minimized.
        ->Not possible to create an object without specifying its values.
