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
     final private String ScreenMsg2 = PrintHelper.whiteSpace(49) + "Help";
     final private String ScreenMsg3 = PrintHelper.newLine(3) + PrintHelper.whiteSpace(10) + "You selected fuel type: ";
     final private String ScreenMsg4 = "\n" + PrintHelper.whiteSpace(28) + "unit cost: $";
     final private String ScreenMsg5 = PrintHelper.newLine(2) + PrintHelper.whiteSpace(49)  + "Cancel";
     
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
            gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + PrintHelper.newLine(4) + ScreenMsg5);
        } else {
            String fuelType = gasStation.getFuelType();
            gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + fuelType 
            + ScreenMsg4 + unitCost + ScreenMsg5);
        }
    }

    public void pressE(){
        gasStation.setState(gasStation.getHelpState());
        gasStation.getState().setPrevState(gasStation.getFuelDispensingState());
        gasStation.updateScreen();
    }

    public void pressH(){
        gasStation.setState(gasStation.getCancelConfirmState());
        gasStation.getState().setPrevState(gasStation.getFuelDispensingState());
        gasStation.updateScreen();
        
    }    

    public void pressFeulType (String fuelType, double unitCost) {
        gasStation.setFuelUnitCost(unitCost);
        gasStation.setFuelType(fuelType);
        gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + fuelType 
        + ScreenMsg4 + unitCost + ScreenMsg5);
    }
}
