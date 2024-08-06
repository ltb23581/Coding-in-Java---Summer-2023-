package edu.uga.cs1302.shapes;

import java.awt.Color;


public class Test 
{
    public static void main( String[] args )
    {
	Shape2D[] shapes = new Shape2D[6];

	shapes[0] = new Rectangle( Color.RED, 20, 30 );
	shapes[1] = new Circle( Color.PINK, 27 );
	shapes[2] = new Triangle( Color.GRAY, 13, 72 );
	shapes[3] = new Circle( Color.RED, 32 );
	shapes[4] = new Triangle( Color.ORANGE, 44, 32 );
	shapes[5] = new Rectangle( Color.GREEN, 53, 28 );

	for( int i = 0; i < shapes.length; i++ ) {
	    System.out.println( "shapes[" + i + "] " + shapes[i].getClass() );
	    System.out.println( "shapes[" + i + "] " + shapes[i].toString() );
	    System.out.println( "shapes[" + i + "]  area " + shapes[i].getArea() );
	}
    }
}
