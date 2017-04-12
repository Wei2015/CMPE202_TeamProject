import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonH extends Button
{
    public ButtonH(GasStation gasStation){
        super(gasStation);
    }
    public void perform(){
        
        gasStation.getState().pressH();
      
    }
}
