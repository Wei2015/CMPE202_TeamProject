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
}
