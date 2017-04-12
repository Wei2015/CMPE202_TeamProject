import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonB extends Button
{
    public ButtonB(GasStation gasStation){
        super(gasStation);
    }
    
    
       
    public void perform(){
            gasStation.getState().pressB();
    }
}
