import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonD extends Button
{
    public ButtonD(GasStation gasStation){
        super(gasStation);
    }
    public void perform(){
        gasStation.getMenu().cmd("D");
        //gasStation.getState().pressD();
      
    }
}
