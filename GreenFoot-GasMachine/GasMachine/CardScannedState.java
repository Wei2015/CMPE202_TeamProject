/**
 * Write a description of class CardScannedState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardScannedState extends State 
{
    GasStation gasStation;
    final private String ScreenMsg1 = "Please input your Zipcode for card\n";
    final private String ScreenMsg2 = "verification!" + PrintHelper.newLine(4);
    final private String ScreenMsg3 = PrintHelper.whiteSpace(16) + "Your input: ";
    final private String ScreenMsg4 = PrintHelper.newLine(3) + PrintHelper.whiteSpace(49) + "Cancel";
    /**
    * Constructor for objects of class CardScannedState
    */
    public CardScannedState(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }
    
    public void setMessage()
    {
        String message = ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + gasStation.getNumber() + ScreenMsg4;
        gasStation.getScreen().setText(message);
    }
    
    public void pressH(){
        gasStation.setState(gasStation.getCancelConfirmState());
        gasStation.getState().setPrevState(gasStation.getCardScannedState());
        gasStation.updateScreen();
    }    
    
    public void pressEnter(){
        gasStation.creditCardVerify();
    }
    
    public void pressClear(){
        gasStation.clearNumber();
    }
}
