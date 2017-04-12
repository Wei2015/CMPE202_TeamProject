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
    final private String ScreenMsg1 = "Do you want car wash?\n\n";
    final private String ScreenMsg2 = " Yes" + printHelper.whiteSpace(45) + "Help";
    final private String ScreenMsg3 = "\n\n No";
    final private String ScreenMsg4 = printHelper.newLine(4) + printHelper.whiteSpace(49) + "Cancel";
    /**
     * Constructor for objects of class CardScannedState
     */
    public CardVerifiedState (GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    
     public void setMessage()
     {
        gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + ScreenMsg4);
     }

    public void pressA(){
          gasStation.carWash(true);
          gasStation.setState(gasStation.getFuelDispensingState());
          gasStation.updateScreen();
    }
    
     public void pressB(){
          gasStation.carWash(false);
          gasStation.setState(gasStation.getFuelDispensingState());
          gasStation.updateScreen();
        }
        
    public void pressE(){
        gasStation.setState(gasStation.getHelpState());
        gasStation.getState().setPrevState(gasStation.getCardVerifiedState());
        gasStation.updateScreen();
    }

    public void pressH(){
        gasStation.setState(gasStation.getCancelConfirmState());
        gasStation.getState().setPrevState(gasStation.getCardVerifiedState());
        gasStation.updateScreen();
    }    
        

}
