/**
 * Write a description of class CardVerifiedState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardVerifiedState extends State 
{
    // instance variables - replace the example below with your own
    GasStation gasStation;
    final private String ScreenMsg1 = "Do you want car wash?\n\n Yes";
    final private String ScreenMsg2 = "                                             ";
    final private String ScreenMsg3 = "Help\n\n No";
    /**
     * Constructor for objects of class CardScannedState
     */
    public CardVerifiedState (GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
     public void setMessage()
     {
        gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3);
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
    public void pressE(){
        gasStation.setState(gasStation.helpState);
        gasStation.getState().setPrevState(gasStation.cardVerifiedState);
        gasStation.updateScreen();
    }
    public void pressF(){
        
    }
    public void pressG(){
        
    }
    public void pressH(){
        
    }    
        
               public void pressNumberKey(){}
     public void pressEnter(){}
     public void pressClear(){}
}
