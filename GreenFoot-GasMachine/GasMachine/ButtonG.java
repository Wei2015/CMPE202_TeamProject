import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonG extends Button
{
    public ButtonG(GasStation gasStation){
        super(gasStation);
    }  
    public void perform(){
        
        gasStation.getState().pressG();
      
    }
}
