/**
 * Write a description of class FuelDispensingState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelDispensingState implements State 
{
     GasStation gasStation;
     final private String ScreenMsg = "Please select fuel type before removing\n nozzle!\n";
    /**
     * Constructor for objects of class CardScannedState
     */
    public FuelDispensingState(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
     public void setMessage()
     {
        gasStation.getScreen().setText(ScreenMsg);
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
     public void pressEnter(){}
     public void pressClear(){}
}
