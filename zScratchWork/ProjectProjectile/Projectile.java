import java.awt.Rectangle;
import java.lang.Math;


// All of the calcilations and display will take place here
// Even the trail feature (which will draw as the point hits certain spots)

public class Projectile extends Rectangle{
    
    // Atributes of the projectile 
    /*
     * Projectile: 
     * This will be a rectangle. Something that we can draw
     * It will be first created when we fire our launcher
     * After it launches, the projectile will render
     * We will do live calcuations of the projectile and paint as we go
     * However we will also store each x and y value of the projectile in an array list
     * This way we have data to analyze and also use for like a trail.
     * 
     * The Projectile will constructor will need to have an intial speed and direction
     * As well as the size of the projectile
     * 
     * With our first iteration of this project, this is enough information to play with.
     * We will use basic physics to calucalte the rest. 
     * 
     */




    // These are the x and y coordinates, in future iterations, we will make it equal to the mouse let go point of the sling shot mech.
    // Pos
    int myX = 0;
    int myY = PanelProj.PROJ_HEIGHT - 2 * PanelProj.PROJ_DIAMETER;;
    // Starting Speeds
    public int myIntSpeed;
    public double myDegrees;
    public double myTheta;
    // Broken down to componenets
    public int myVx;
    public int myVy;
    // Acceleratios 
    public double myAx;
    public double myAy;

//!!!!!    //To account for the many options in making a projectile (be it in vector or component form) we will have multiple constructors

    Projectile( int s, double degrees)
    {
        x = myX;
        y = myY;
        myIntSpeed = s;
        myDegrees = degrees;
        myTheta = Math.toRadians(degrees);
        myAx = 0;
        myAy = (9.8) / 1000 * PanelProj.TIME; // This must be postive as down is positve
        myVx = (int) (myIntSpeed * Math.cos(myTheta));
        myVy = - (int) (myIntSpeed * Math.sin(myTheta));

    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setX(double myX)
    {
        x = (int)myX;
    }
    public void setY(double myY)
    {
        y = (int)myY;
    }

    public int getVx()
    {
        return myVx;
    }
    public int getVy()
    {
        return myVy;
    }
    public void setVx(double x)
    {
        myVx = (int) x;
    }
    public void setVy(double y)
    {
        myVy = (int)y;
    }

    public double getAx()
    {
        return myAx;
    }
    public double getAy()
    {
        return myAy;
    }
    public void setAx(double x)
    {
        myAx = x;
    }
    public void setAy(double y)
    {
        myAy = y;
    }

    


    


}
