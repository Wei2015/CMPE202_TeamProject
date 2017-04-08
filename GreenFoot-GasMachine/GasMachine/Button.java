import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
     protected GasStation gasStation;
     
     public Button(GasStation gasStation)
     {
        this.gasStation = gasStation; 
     }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            this.perform();
            gasStation.updateScreen();
  
        }
    }   
    
    
    public void perform(){
    }
}
