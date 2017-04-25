import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonE extends Button
{
    public ButtonE(GasStation gasStation){
        super(gasStation);
    }   
    
    public void perform(){
        gasStation.getMenu().cmd("E");
        //gasStation.getState().pressE();
      
    }
}
