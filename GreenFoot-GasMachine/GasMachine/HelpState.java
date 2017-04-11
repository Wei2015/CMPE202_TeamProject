/**
 * Write a description of class HelpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpState extends State
{
    GasStation gasStation;
    private State prevState;
    final private String ScreenMsg1 = "\n\n\n\n                                             ";
    final private String ScreenMsg2 = "      Back";
    final private String ScreenMsg3 = "\n               Our staff is coming...";
    final private String ScreenMsg4 = "\n\n                   Please wait...\n\n";
    final private String ScreenMsg5 = "                     []~(￣▽￣)~* ";
    /**
     * Constructor for objects of class CardScannedState
     */
    public HelpState(GasStation gasStation)
    {
        this.prevState = gasStation.cardVerifiedState;
        this.gasStation = gasStation;
    }

    
     public void setMessage(){
        gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + ScreenMsg4 + ScreenMsg5);
     };
     public void insertCreditCard(){};
     public void dispense(){}
     public void print(double cost) {}
     
        public void  pressA(){
          
        }
    
     public void  pressB(){
        
        }
        
    public void  pressC(){
                }
    public void  pressD(){
        }
        public void pressE(){
        
    }
    public void pressF(){
        gasStation.setState(this.prevState);
        gasStation.updateScreen();
    }
    public void pressG(){
        
    }
    public void pressH(){
        
    }    
 
               public void pressNumberKey(){}
     public void pressEnter(){}
     public void pressClear(){}
     
    public void setPrevState (State prevState) {
        this.prevState = prevState;
    }
}
