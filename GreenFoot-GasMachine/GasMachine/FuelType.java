import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelType extends Actor
{
    protected GasStation gasStation;
    protected double unitCost;
     
    public FuelType(double price, GasStation gasStation)
    {
        unitCost = price;
        this.gasStation = gasStation; 
    }
    
    public void act() 
    {
       if(Greenfoot.mousePressed(this)){
            if (gasStation.getState()==gasStation.getFuelDispensingState()){
                gasStation.setFuelType(this.unitCost);
            }
            
            
        }
    }    
}
