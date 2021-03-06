import greenfoot.*;  

/**
 * If Car Wash option is "NO", Ask customers if they want their receipt.
 *
 */

public class ReceiptOptionState extends State 
{
    GasStation gasStation;
    
    final String OPTION_MESSAGE = "Would you like to print your receipt?";
    final String YES_OPTION = "Yes";
    final String NO_OPTION = "No";
    final private String ScreenMsg = PrintHelper.whiteSpace(49) + "Help";
    
    
    private boolean answer;
    
    /**
    * Constructor 
    */
    public ReceiptOptionState(GasStation gasStation) 
    {
        this.gasStation = gasStation;
    }
    
    public void print(double cost) 
    {
       // World world = gasStation.getCardSlot().getWorld();
        World world = gasStation.getScreen().getWorld();
        String msg = "Receipt\nYour cost is : $" + String.valueOf(cost);
        world.addObject(new Receipt(msg),100,380);
    }
    
    public void setMessage()
    {
        gasStation.getScreen().setText(OPTION_MESSAGE + PrintHelper.newLine(2) + ScreenMsg 
        + PrintHelper.newLine(4) + YES_OPTION + PrintHelper.newLine(2) + NO_OPTION ); 
    }
    
    public void  pressC(){
        gasStation.printReceipt();
        gasStation.reStart();
    }
    
    public void  pressD(){
        gasStation.reStart();
    }
    
    public void pressE(){
        gasStation.setState(gasStation.getHelpState());
        gasStation.getState().setPrevState(gasStation.getReceiptOptionState());
        gasStation.updateScreen();
    }
}


