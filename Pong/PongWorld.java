import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class PongWorld  extends World
{

    /**
     * Constructor for objects of class PongWorld.
     * 
     */
    public PongWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(700, 500, 1);
        
        addObject(new Paddle(), 350, 30);
        addObject(new Paddle(), 350, 470);
        addObject(new Ball(), 350, 250);
        
    }
}
