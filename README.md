TekAsses

#Description : Order Calculation

Developed by : Siri

Version 1 : Bug Fixes

NullPointerException : Description : When we are performing any operation on a NULL object, then JVM throws the NullPointerException. 

Problem 1: In the given program, the execution starts from the Foo class main method. At Line c.add(new OrderLine(new Item("book", (float) 12.49), 1)); in the given program throws a NullPointerException because we are trying to add an OrderLine object to a List collection object. Here, we have created the List reference rather than instantiating.

Problem 2: 'this' keyword. It reference the current object. Here, while trying to assign a value for private variables at the time of instantiation of object without giving 'this' keyword gives a default value.
 
Version 2 : Refactored version of Order Calculation designed with much cleaner code along with Junit test cases.

Print statements - Used round function to get two digits after the decimal.
Total - total contained the total value of order along with tax. But in the given output, it contained the total amount of orders placed without tax.
Changed the method names as per my convinience.
