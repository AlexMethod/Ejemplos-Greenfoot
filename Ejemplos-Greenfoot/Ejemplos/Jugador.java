import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Jugador extends Actor
{
    private boolean disparando;
    public Jugador(){
        disparando=false;
    }
    @Override
    public void act() {
        if(Greenfoot.isKeyDown("right")){
            //if press move to the right
            this.setLocation(this.getX()+10,this.getY());
        }
        if(Greenfoot.isKeyDown("left")){
            //if press move to the right
            this.setLocation(this.getX()-10,this.getY());
        }
        if(Greenfoot.isKeyDown("up")){
            //if press move to the right
            this.setLocation(this.getX(),this.getY()-10);
        }
        if(Greenfoot.isKeyDown("down")){
            //if press move to the right
            this.setLocation(this.getX(),this.getY()+10);
        }
        if(Greenfoot.isKeyDown("space") && !disparando){
            World mundo=this.getWorld();
            mundo.addObject(new Disparo(),this.getX(),this.getY()-40);
            disparando=true;
        }
        
        World mundo = this.getWorld();
        List lista = mundo.getObjects(Disparo.class);
        if(lista.isEmpty()){
            disparando = false;
        }
        
    }    
}
