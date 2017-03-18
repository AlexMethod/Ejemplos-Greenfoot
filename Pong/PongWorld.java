import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class PongWorld  extends World
{

    public PongWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(700, 500, 1);
        addObject(new Paddle(), 350, 30);
        addObject(new Paddle(), 350, 470);
        addObject(new Ball(), 350, 250);
        showText("Player 1: ",50,30);
        showText("Player 2: ",50,460);
    }
}
