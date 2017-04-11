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
     final private String ScreenMsg2 = printHelper.whiteSpace(49) + "Help";
     final private String ScreenMsg3 = printHelper.newLine(3) + printHelper.whiteSpace(10) + "You selected fuel type: ";
     final private String ScreenMsg4 = "\n" + printHelper.whiteSpace(28) + "unit cost: $";
     final private String ScreenMsg5 = printHelper.newLine(2) + printHelper.whiteSpace(49)  + "Cancel";
     
    /**
     * Constructor for objects of class CardScannedState
     */
    public FuelDispensingState(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
    public void setMessage()
    {
        double unitCost = gasStation.getFuelUnitCost();
        if(unitCost == 0) {
            gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + printHelper.newLine(4) + ScreenMsg5);
        } else {
            String fuelType = gasStation.getFuelType();
            gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + fuelType 
            + ScreenMsg4 + unitCost + ScreenMsg5);
        }
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
        gasStation.setState(gasStation.getHelpState());
        gasStation.getState().setPrevState(gasStation.getFuelDispensingState());
        gasStation.updateScreen();
    }
    public void pressF(){
        
    }
    public void pressG(){
        
    }
    public void pressH(){
        gasStation.setState(gasStation.getCancelConfirmState());
        gasStation.getState().setPrevState(gasStation.getFuelDispensingState());
        gasStation.updateScreen();
        
    }    
    
    public void pressNumberKey(){}
    public void pressEnter(){}
    public void pressClear(){}
    public void pressFeulType (String fuelType, double unitCost) {
        gasStation.setFuelUnitCost(unitCost);
        gasStation.setFuelType(fuelType);
        gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + fuelType 
        + ScreenMsg4 + unitCost + ScreenMsg5);
        //gasStation.updateScreen();
    }
}
