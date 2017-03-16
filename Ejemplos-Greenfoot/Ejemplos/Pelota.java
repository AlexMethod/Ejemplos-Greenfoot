import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    private int incx;
    private int incy;
    
    public Pelota(){
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
            incy=-incy;
        }
        if(nuevox<0){
            incx=-incx;
        }
        if(nuevoy<0){
            incy=-incy;
        }
        this.setLocation(nuevox,nuevoy);
        
    }    
}
