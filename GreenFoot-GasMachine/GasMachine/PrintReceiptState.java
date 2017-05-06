import greenfoot.*;  
import java.util.Random;
/**
 * PrintReceiptState is to print the receipt if:
 * Car Wash option is "YES" or
 * Car Wash option is "NO" and Print Receipt option is "YES".
 *
 */

public class PrintReceiptState extends State
{
    GasStation gasStation;
    final private String ScreenMsg = "Your receipt is being printed!";
    private int carWashCode;


    /**
     * Constructor 
     */
    public PrintReceiptState(GasStation gasStation) 
    {
        this.gasStation = gasStation;
    }

    public void setMessage(){
        gasStation.getScreen().setText(ScreenMsg);
    }
    
    public void print(double cost){
        carWashCode = new Random().nextInt(999999)+100000;
       // World world = gasStation.getCardSlot().getWorld();
       World world = gasStation.getScreen().getWorld();
        String msg = "Receipt\nYour cost is : $" + String.valueOf(cost) +"\nYour car wash code is: " 
        + carWashCode;
        world.addObject(new Receipt(msg),100,380);
    }
   
}