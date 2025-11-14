Project: online-shop-junit
Authors: Michael Kölling and David J. Barnes

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project implements a small part of an online sales system (such as Amazon.com).
The current project is concerned only with customer comments for sales items. It contains
code to create, store, show and manipulate customer comments.

The purpose of this project is to introduce regression testing using JUnit. It includes 
a test class that demonstrates some of the testing functionality. Testing is further 
discussed in the book.

NOTE: There are several serious errors to be found in these classes.

14. It creates the constructor, setUp, and tearDown.

17.

I broke one of my tests by changing “Alice” to “Bob”.
When I ran the tests, BlueJ showed that the test failed.
It displayed: 
the expected value (false) and the actual value (true),
because this was true and not false, it showed an error.
it displayed a "Show Source" to jump to the error.