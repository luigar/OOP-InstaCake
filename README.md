# OOP-InstaCake IntelliJ

Assignment 1: Delicious Polymorphism					Due: Feb 7, 2020 11:30 pm

1.
Create a parent/ancestor class Cake.
It should have instance variables of name and rate with getters/setters.
It should have a default no-arg constructor and a constructor that sets name and rate.
There should also be methods for calculating the price and an overridden toString method.

 2.
Based on the Cake class, create 2 child/descendent classes called OrderCake and ReadyMadeCake with constructors, getters/setters and the additional instance variables and overridden methods.


| 	        	| OrderCake     | ReadymadeCake    |
| --------------------- |:-------------:| ----------------:|
| Additional Attribute  | weight(kg)    | quantity         |
| Price Calculation     | rate * weight | rate * quantity  |


3.
By using these classes, write a console program that will
1)	Declare an array of 20 Cake objects
2)	Input data for Cake objects and store in the array
3)	Display the total price for all types of cakes
4)	Display the total price and quantity sold for ReadyMadeCakes
5)	Display the information for the cake that has been sold for the highest price
