/**
 * Write a description of class HelpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpState extends State
{
    GasStation gasStation;
    private State prevState;
    final private String ScreenMsg1 = PrintHelper.newLine(4) + PrintHelper.whiteSpace(51) + "Back\n";
    final private String ScreenMsg2 = PrintHelper.whiteSpace(15) + "Our staff is coming...";
    final private String ScreenMsg3 = PrintHelper.newLine(2) + PrintHelper.whiteSpace(19) + "Please wait...\n\n";
    final private String ScreenMsg4 = PrintHelper.whiteSpace(21) + "[]~(￣▽￣)~* ";
    /**
     * Constructor for objects of class CardScannedState
     */
    public HelpState(GasStation gasStation)
    {
        this.prevState = gasStation.cardVerifiedState;
        this.gasStation = gasStation;
    }
    
    public void setMessage(){
        gasStation.getScreen().setText(ScreenMsg1 + ScreenMsg2 + ScreenMsg3 + ScreenMsg4);
    }

    public void pressF(){
        gasStation.setState(this.prevState);
        gasStation.updateScreen();
    }

    public void setPrevState (State prevState) {
        this.prevState = prevState;
    }
}
