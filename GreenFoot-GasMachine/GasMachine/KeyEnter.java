import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyEnter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyEnter extends Key
{
     public KeyEnter(GasStation gasStation) 
    {
        super(-2,gasStation);
    }
       public void perform(){
         gasStation.getState().pressEnter();
        }
}
