import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonA extends Button
{
    public ButtonA(GasStation gasStation){
        super(gasStation);
    }
    
    
    public void perform(){
        gasStation.getMenu().cmd("A");
       // gasStation.getState().pressA();
      
    }
}
