package edu.uga.cs1302.shapes;

import java.awt.Color;


// This is an abstract class and can't have any instances
public abstract class Shape2D {

    // This is a standard representation of color in Java.
    // We will use it later in JavaFX
    protected Color color;

    public Shape2D( Color color ) 
    { 
	this.color = color; 
    }

    public Color getColor()
    {
	return color;
    }

    public void setColor( Color color )
    {
	this.color = color;
    }
    
    // This method is abstract, since we cannot provide the body here;  
    // different shapes will need different computations of the area
    // but all of them will have an area!
    // All concrete subclasses must define getArea(), i.e. provide the body
    public abstract int getArea();
}
