import java.util.concurrent.TimeUnit;
/**
 * Customer has choice to cancel the whole transaction.
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
        gasStation.getScreen().setText(CONFIRM_MESSAGE + PrintHelper.newLine(6) 
        + YES_OPTION + PrintHelper.newLine(2) + NO_OPTION );
    }
    
    /**
     * If customer choose to cancel transaction, restart GasStation (go to initialstate).
     */
    public void  pressC(){
        gasStation.reStart();
    }
    
    /**
     * If customer doesn't cancel, keep going with current transaction (go to previous state).
     */
    public void  pressD(){
        gasStation.setState(this.prevState);
        gasStation.updateScreen();
    }
    
    /**
     * Help record previous state (state where the transaction got disruppted).
     */
    public void setPrevState (State prevState) {
        this.prevState = prevState;
    }
}
