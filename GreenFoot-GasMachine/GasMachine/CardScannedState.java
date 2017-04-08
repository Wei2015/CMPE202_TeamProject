/**
 * Write a description of class CardScannedState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardScannedState implements State 
{
   GasStation gasStation;
   final private String ScreenMsg = "Please input your Zipcode for card verification!\n";
    /**
     * Constructor for objects of class CardScannedState
     */
    public CardScannedState(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
     public void setMessage()
     {
         String message = ScreenMsg + gasStation.getNumber();
         gasStation.getScreen().setText(message);
     }
     public void insertCreditCard(){}
     public void dispense(){}
     
     public void print(double cost){}
     
     
        public void  pressA(){
          
        }
    
     public void  pressB(){
        
        }
        
             public void  pressC(){
                }
     public void  pressD(){
        }
        
               public void pressNumberKey(){}
     public void pressEnter(){
         gasStation.creditCardVerify();
        }
     public void pressClear(){
         gasStation.clearNumber();
        }
}
