import java.util.concurrent.TimeUnit;
/**
 * Write a description of class HelpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CancelConfirmState extends State
{
    GasStation gasStation;
    private State prevState;
    final String CONFIRM_MESSAGE = "Are you sure you want to cancel?";
    final String YES_OPTION = "Yes";
    final String NO_OPTION = "No";
    /**
     * Constructor for objects of class CardScannedState
     */
    public CancelConfirmState(GasStation gasStation)
    {
        this.prevState = gasStation.cardVerifiedState;
        this.gasStation = gasStation;
    }
    
    public void setMessage(){
        gasStation.getScreen().setText(CONFIRM_MESSAGE + printHelper.newLine(6) 
        + YES_OPTION + printHelper.newLine(2) + NO_OPTION );
    }
    
    
    public void  pressC(){
        gasStation.reStart();
    }
    
    public void  pressD(){
        gasStation.setState(this.prevState);
        gasStation.updateScreen();
    }
    
    public void setPrevState (State prevState) {
        this.prevState = prevState;
    }
}
