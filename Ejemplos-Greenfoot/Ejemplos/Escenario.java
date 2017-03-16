import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


import java.util.ArrayList;
public class Escenario extends World
{
    Pelota pelota;
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,true);
    }
    @Override
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            MouseInfo raton = Greenfoot.getMouseInfo();
            int x = raton.getX(); 
            int y = raton.getY(); 
            addObject(new Pelota(), x,y);
        }
    }
    
}
