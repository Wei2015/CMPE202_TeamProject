import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardInsertSlot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardInsertSlot extends Actor
{
    GasStation gasStation;
    public CardInsertSlot (GasStation gasStation)
    {
       this.gasStation = gasStation;
    }
    
    /**
     * Act - do whatever the CardInsertSlot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Actor creditCard = getOneIntersectingObject(CreditCard.class);
       World world = getWorld();
       if (creditCard != null) {
           gasStation.getState().insertCreditCard();
           world.removeObject(creditCard);
        }
        
       
    }    
}
