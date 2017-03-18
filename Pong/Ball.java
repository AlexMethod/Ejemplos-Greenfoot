import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
public class Ball extends Actor
{
    private int incx;
    private int incy;
    private int pP1;
    private int pP2;
    public Ball(){
        incx=10;
        incy=10;
        pP1=0;
        pP2=0;
    }
    @Override 
    public void act() 
    {
        
        int posx=this.getX();
        int posy=this.getY();
        //Calcula las nuevas coordenadas
        int nuevox=posx + incx;
        int nuevoy=posy + incy;
        
        World mundo = this.getWorld();
        mundo.showText(pP1+"",100,30);
        mundo.showText(pP2+"",100,460);
        this.setLocation(nuevox,nuevoy);
        if(this.isTouching(Paddle.class)){
           incy=-incy;
        }
        if(nuevox>mundo.getWidth())  { //Rebota en el lado derecho
            incx=-incx;
        }
        if(nuevoy> mundo.getHeight()){ //Rebota en la parte de abajo
            pP1++;
            this.setLocation(350,250);
        }
        if(nuevox<0){ //<<Rebota en el lado izquierdo
            incx=-incx;
        }
        if(nuevoy<0){ //Rebota en la parte de arriba 
            pP2++;
            this.setLocation(350,250);
        }
        if(pP1==5){
            mundo.showText("Winner: Player 1",350,250);
            Greenfoot.stop();
        }
        if(pP2==5){
            mundo.showText("Winner: Player 2",350,250);
            Greenfoot.stop();
        }
        
        
        
    }    
}
