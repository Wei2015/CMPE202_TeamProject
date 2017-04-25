import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonC extends Button
{
    public ButtonC(GasStation gasStation){
        super(gasStation);
    }  
    
    public void perform(){
        gasStation.getMenu().cmd("C");
       // gasStation.getState().pressC();
      
    }
}
