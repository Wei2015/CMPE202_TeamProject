import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonF extends Button
{
    public ButtonF(GasStation gasStation){
        super(gasStation);
    }
    public void perform(){
        gasStation.getMenu().cmd("F");
       // gasStation.getState().pressF();
      
    }
}
