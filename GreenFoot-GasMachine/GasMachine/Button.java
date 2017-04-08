import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
     protected GasStation gasStation;
     
     public Button(GasStation gasStation)
     {
        this.gasStation = gasStation; 
     }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            if (gasStation.getState()==gasStation.getCardVerifiedState()){
                if (this.getClass()== ButtonA.class){
                    gasStation.carWash(true);
                } else if (this.getClass()==ButtonB.class) {
                    gasStation.carWash(false);
                }
                gasStation.updateScreen();
            }
            
            if (gasStation.getState()==gasStation.getRceiptOptionSate()){
                if (this.getClass()==ButtonC.class) {
                    gasStation.printReceipt();
                    gasStation.reStart();
                } else if (this.getClass()==ButtonD.class) {
                    gasStation.reStart();
                }
            }
            
            
        }
    }    
}
