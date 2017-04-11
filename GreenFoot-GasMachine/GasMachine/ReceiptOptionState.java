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
    final private String ScreenMsg1 = "                                                 ";
    final private String ScreenMsg2 = "Help";
    
    
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
        World world = gasStation.getCardSlot().getWorld();
        String msg = "Receipt\nYour cost is : $" + String.valueOf(cost);
        world.addObject(new Receipt(msg),100,380);
    }
    
    public void setMessage()
    {
        gasStation.getScreen().setText(OPTION_MESSAGE + "\n\n" + ScreenMsg1 + ScreenMsg2 + "\n\n\n\n" + YES_OPTION 
        +"\n\n" + NO_OPTION ); 
    }
    public void insertCreditCard(){}
    
    public void dispense(){}
    
    public void  pressA(){
      
    }
    
    public void  pressB(){
    
    }
    
    public void  pressC(){
    
        gasStation.printReceipt();
        gasStation.reStart();
    }
    public void  pressD(){
        gasStation.reStart();
    }
    public void pressE(){
        gasStation.setState(gasStation.helpState);
        gasStation.getState().setPrevState(gasStation.receiptOptionSate);
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


