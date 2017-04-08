/**
 * Write a description of class CardVerifiedState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardVerifiedState implements State 
{
    // instance variables - replace the example below with your own
    GasStation gasStation;
    final private String ScreenMsg = "Do you want car wash?\n\n Yes \n\n No";
    /**
     * Constructor for objects of class CardScannedState
     */
    public CardVerifiedState (GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
     public void setMessage()
     {
        gasStation.getScreen().setText(ScreenMsg);
     }
     public void insertCreditCard(){}
     public void dispense(){}
     
     public void print(double cost) {}
     
        public void  pressA(){
          gasStation.carWash(true);
        }
    
     public void  pressB(){
          gasStation.carWash(false);
        }
        
     public void  pressC(){
                }
     public void  pressD(){
        }
}
