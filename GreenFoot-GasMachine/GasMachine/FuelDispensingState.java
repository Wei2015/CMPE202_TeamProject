/**
 * Write a description of class FuelDispensingState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelDispensingState extends State 
{
     GasStation gasStation;
     final private String ScreenMsg1 = "Please select fuel type before removing\n nozzle!\n";
     final private String ScreenMsg2 = "                                                 ";
     final private String ScreenMsg3 = "Help";
    /**
     * Constructor for objects of class CardScannedState
     */
    public FuelDispensingState(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
     public void setMessage()
     {
        gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3);
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
    public void pressE(){
        gasStation.setState(gasStation.helpState);
        gasStation.getState().setPrevState(gasStation.fuelDispensingState);
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
