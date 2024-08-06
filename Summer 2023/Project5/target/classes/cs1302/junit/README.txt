1. Compile this example using the following command:

  javac -d classes src/edu/uga/cs1302/shapes/*.java test/edu/uga/cs1302/shapes/RectangleTester.java

2. Execute the unit test of the Rectangle class using the following
   (remember to include the necessary jar files for JUnit and hamcrest
   on the CLASSPATH!):

  java org.junit.runner.JUnitCore edu.uga.cs1302.shapes.RectangleTester

3. You should exepriment by modifying the expected values of some
   of the tests to force them to fail.
