/**
 * Write a description of class HelpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpState implements State
{
    GasStation gasStation;

    /**
     * Constructor for objects of class CardScannedState
     */
    public HelpState(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
     public void setMessage(){};
     public void insertCreditCard(){};
     public void dispense(){}
     public void print(double cost) {}
}
