/**
 * Write a description of class InitialState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InitialState extends State 
{
   GasStation gasStation;
   final private String ScreenMsg = "Welcome to Gas Station!";

    /**
     * Constructor for objects of class InitialState
     */
    public InitialState(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    public void setMessage()
    {
        gasStation.getScreen().setText(ScreenMsg);
    }
    
    public void insertCreditCard()
    {
        gasStation.setState(gasStation.cardScannedState);
        gasStation.updateScreen();
        
    }
    
    public void dispense()
    {
    }
    
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
        
    }
    public void pressG(){
        
    }
    public void pressH(){
        
    }   
     
               public void pressNumberKey(){}
     public void pressEnter(){}
     public void pressClear(){}
}
