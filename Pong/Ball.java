import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int incx;
    private int incy;
    
    public Ball(){
        incx=10;
        incy=10;
    }
    @Override 
    public void act() 
    {
        //consulta las coordenadas actuales heredadas de actor
        int posx=this.getX();
        int posy=this.getY();
        //Calcula las nuevas coordenadas
        int nuevox=posx + incx;
        int nuevoy=posy + incy;
        
        World mundo = this.getWorld();
        if(nuevox>mundo.getWidth())  { //Rebota en el lado derecho
            incx=-incx;
        }
        if(nuevoy> mundo.getHeight()){ //Rebota en la parte de abajo
            mundo.removeObject(this);
        }
        if(nuevox<0){ //<<Rebota en el lado izquierdo
            incx=-incx;
        }
        if(nuevoy<0){ //Rebota en la parte de arriba 
            mundo.removeObject(this);
        }
        if(this.isTouching(Paddle.class)){
           incy=-incy;
        }
        this.setLocation(nuevox,nuevoy);
        
    }    
}
