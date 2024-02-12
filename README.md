# Automated-Timetable-Generator-using-Genetic-Algorithm
A Java based application, that will heuristically produce a schedule in accordance with the initial input criteria. Using a cycle of Review, Edit, and Regenerate till a final result is satisfied.


The project report contains detailed information about an Automated Timetable Generator using Genetic Algorithm. It covers the introduction, literature review, product description, requirement analysis, system overview, implementation details, and source code for the Java classes used in the project.

The Java classes defined in the project include:

**Class.java**: Manages the details of each class in the timetable.
**Group.java**: Represents groups of students attending the classes.
**Individual.java**: Represents a single timetable solution in the genetic algorithm.
**Module.java**: Contains information about the modules or subjects taught.
**Professor.java**: Stores details of professors or teachers.
**Room.java**: Manages the rooms where classes are held.
**Timeslot.java**: Represents the timeslots available for classes.
**GeneticAlgorithm.java**: The core class that implements the genetic algorithm for generating the timetable.
**Population.java**: Manages a population of timetable solutions in the genetic algorithm.
**Timetable.java**: Represents the timetable and contains methods to add rooms, professors, modules, groups, and to calculate the number of clashes (i.e., a measure of the timetable's fitness).
**TimetableGA.java**: The main class that integrates the genetic algorithm with the user interface for generating timetables.

Each class is designed with specific attributes and methods to perform its role in generating an optimal timetable using the genetic algorithm. The TimetableGA class, in particular, seems to handle the application's user interface and interaction with the genetic algorithm components for timetable generation.
