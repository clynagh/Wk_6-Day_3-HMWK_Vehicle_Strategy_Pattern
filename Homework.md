Homework - Strategy Pattern

Objectives

Practice using composition
Practice using the Strategy Pattern
Task

We're going to model a driver who is able to drive different vehicles, for example a dodgem car, or a quad-bike. They want to be able to calculate how long it would take to travel a particular distance using that particular vehicle, based on the average speed of the vehicle.

Create an interface Driveable which has a method driveDistance() which takes an int parameter 'distance' and returns an int.

When implemented, it should return the time required to drive that distance.

Create two classes,
Dodgem Car - The dodgem car has a average speed and a number of seats.
Quad-bike - The Quad-bike also has an average speed and an engine capacity in cc.

*** both of which implement the Driveable interface. 

<!-- Extension - Feel free to add any other properties you may feel appropriate. -->

Create a class for a Driver, who has a name and a vehicle instance variable which is an instance of a Driveable. They should also have a driveDistance method, which has an int parameter and calls the driveDistance method on the Driveable vehicle.

You should be able to create a Driver by passing it a Driveable. You should also be able to update the Driveable vehicle if required, using a setter method.

Extensions

Create a Vehicle superclass, which contains the common properties and methods.
Add more vehicles.
Remember

Use TDD, using separate test files for each class.
Casting is not required for this.