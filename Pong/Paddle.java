import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Paddle extends Actor
{
    public void act() 
    {
        if(this.getY()<100)
        {
            if(Greenfoot.isKeyDown("left")){
                this.setLocation(this.getX()-20,this.getY());
            }
            if(Greenfoot.isKeyDown("right")){
                this.setLocation(this.getX()+20,this.getY());
            }
        }
        else if (this.getY()>300){
            if(Greenfoot.isKeyDown("a")){
                this.setLocation(this.getX()-20,this.getY());
            }
            if(Greenfoot.isKeyDown("s")){
                this.setLocation(this.getX()+20,this.getY());
            }
        } 
    }    
}

