import java.util.ArrayList; 

public class GasStation  
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> numberEntered;
    private Message screenMessage;
    private CardInsertSlot cardSlot;
    private boolean hasCarWash;
    private double fuelUnitCost = 0.0;
    private double fuelCost;
    
    
    State currentState;
    
    State initialState;
    State printReceiptState;
    State rceiptOptionSate;
    State cardScannedState;
    State cardVerifiedState;
    State fuelDispensingState;
    State helpState;
    
    

    /**
     * Constructor for objects of class Controller
     */
    public GasStation()
    {
        initialState = new InitialState(this);
        printReceiptState = new PrintReceiptState(this);
        rceiptOptionSate = new ReceiptOptionState(this);
        cardScannedState = new CardScannedState(this);
        cardVerifiedState = new CardVerifiedState(this);
        fuelDispensingState = new FuelDispensingState(this);
        helpState = new HelpState(this);
       
        numberEntered = new ArrayList<>();
        screenMessage = new ScreenMessage();
        cardSlot = new CardInsertSlot(this);
        setState(initialState);
        updateScreen();
        
        
    }
    
    public Message getScreen()
    {
        return screenMessage;
    }
    
    public CardInsertSlot getCardSlot()
    {
        return cardSlot;
    }
    
    public void addNumber(int m)
    {
        numberEntered.add(m);
    }
    
    public String getNumber(){
        StringBuilder output = new StringBuilder();
        if (numberEntered.size()>= 5) {
            for(int i=0; i< 5; i++){
                output.append(numberEntered.get(i).toString());
            }
        } else {
            for (Integer i : numberEntered) {
                output.append(i.toString());
            }
        }
        return output.toString();
    }
    
    public void clearNumber(){
        numberEntered.clear();
        updateScreen();
    }
    
    public void insertCreditCard() {
        setState(cardScannedState);
        updateScreen();
        
    }
    
    public void creditCardVerify(){
        if (numberEntered.size() >= 5) {
            setState(cardVerifiedState);
            updateScreen();
        }
    }
    public void updateScreen()
    {
        currentState.setMessage();
    }
    
    private void setState(State state)
    {
        currentState = state;
    }
    
    public State getState() 
    {
        return currentState;
    }
    
    public State getCardScannedState() 
    {
        return cardScannedState;
    }
    
    public State getCardVerifiedState()
    {
        return cardVerifiedState;
    }
    
    public State getFuelDispensingState() 
    {
        return fuelDispensingState;
    }
    
    public State getPrintReceiptState()
    {
        return printReceiptState;
    }
    
    public State getRceiptOptionSate()
    {
        return rceiptOptionSate;
    }
    
    public void carWash(boolean haveCarWash) 
    {
        hasCarWash = haveCarWash;
        setState(fuelDispensingState);
        
    }
   
    public void setFuelType(double unitCost)
    {
        fuelUnitCost = unitCost;
    }
    
    public double getFuelTypeCost() 
    {
        return fuelUnitCost;
    }
    
    public void calculateFuelCost(int units) 
    {
         fuelCost = fuelUnitCost*units;
         if (hasCarWash) {
             setState(printReceiptState);
             printReceipt();
         } else {
             setState(rceiptOptionSate);
         }
         updateScreen();
    }
    
    public void printReceipt()
    {
        currentState.print(fuelCost);
    }
    
    public void reStart() {
        setState(initialState);
        updateScreen();
    }
}
