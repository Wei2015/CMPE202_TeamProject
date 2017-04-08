import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Nozzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nozzle extends Actor
{
    private GasStation gasStation;
    
    public Nozzle(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }
    
    public void act() 
    {
        int mouseX, mouseY;
        
        if(Greenfoot.mouseDragEnded(this) 
        && gasStation.getState()==gasStation.getFuelDispensingState()
        && gasStation.getFuelTypeCost()>0) {
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            this.setLocation(mouseX, mouseY);  
            //generate random number 1-20 units of fuel added.
            gasStation.calculateFuelCost(new Random().nextInt(19)+1);
            
            
        }
           
              
    }  
            
}
