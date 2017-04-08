import greenfoot.*;  

/**
 * If Car Wash option is "NO", Ask customers if they want their receipt.
 *
 */

public class ReceiptOptionState implements State 
{
   GasStation gasStation;
    
    final String OPTION_MESSAGE = "Would you like to print your receipt?";
    final String YES_OPTION = "Yes";
    final String NO_OPTION = "No";
    
    
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
       gasStation.getScreen().setText(OPTION_MESSAGE + "\n\n\n\n\n\n\n" + YES_OPTION 
       +"\n\n\n" + NO_OPTION ); 
     }
     public void insertCreditCard(){}
    
    public void dispense(){}
}


