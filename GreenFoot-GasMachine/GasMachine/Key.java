import greenfoot.*;
import java.util.ArrayList;

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
   protected int keyValue;
   protected GasStation gasStation;
   protected final int CLEAR = -1;
   
   public Key (int num, GasStation gasStation) 
   {
     keyValue=num; 
     this.gasStation = gasStation;
    }
    
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(Greenfoot.mousePressed(this)) 
        {
            
        perform();
        }
    } 
    
    public void perform(){
        if (keyValue >= 0) {
               gasStation.addNumber(keyValue);
               gasStation.updateScreen();
        } 
    }
}

