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
    private String fuelType;
    
    private IMenuCommand aCommand;
    private IMenuCommand bCommand;
    private IMenuCommand cCommand;
    private IMenuCommand dCommand;
    private IMenuCommand eCommand;
    private IMenuCommand fCommand;
    private IMenuCommand gCommand;
    private IMenuCommand hCommand;
    Menu menu = new Menu();
    
    
    State currentState;
    //State prevState;
    
    State initialState;
    State printReceiptState;
    State receiptOptionSate;
    State cardScannedState;
    State cardVerifiedState;
    State fuelDispensingState;
    State helpState;
    State cancelConfirmState;
    
   public Menu getMenu(){
    return menu;
}
    /**
     * Constructor for objects of class Controller
     */
    public GasStation()
    {
        initialState = new InitialState(this);
        printReceiptState = new PrintReceiptState(this);
        receiptOptionSate = new ReceiptOptionState(this);
        cardScannedState = new CardScannedState(this);
        cardVerifiedState = new CardVerifiedState(this);
        fuelDispensingState = new FuelDispensingState(this);
        helpState = new HelpState(this);
        cancelConfirmState = new CancelConfirmState(this);
       
        numberEntered = new ArrayList<>();
        screenMessage = new ScreenMessage();
        cardSlot = new CardInsertSlot(this);
        setState(initialState);
           
            
            aCommand  = new MenuCommand() ;
            IMenuInvoker menuA = new MenuOption() ;
            menuA.setCommand(aCommand);
            aCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressA();
                    }
                }
            ) ;
            
            bCommand  = new MenuCommand() ;
            IMenuInvoker menuB = new MenuOption() ;
            menuB.setCommand(bCommand);
            bCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressB();
                    }
                }
            ) ;
            
            cCommand  = new MenuCommand() ;
            IMenuInvoker menuC = new MenuOption() ;
            menuC.setCommand(cCommand);
            cCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressC();
                    }
                }
            ) ;
            
            dCommand  = new MenuCommand() ;
            IMenuInvoker menuD = new MenuOption() ;
            menuD.setCommand(dCommand);
            dCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressD();
                    }
                }
            ) ;
            
            eCommand  = new MenuCommand() ;
            IMenuInvoker menuE = new MenuOption() ;
            menuE.setCommand(eCommand);
            eCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressE();
                    }
                }
            ) ; 
                      
            fCommand  = new MenuCommand() ;
            IMenuInvoker menuF = new MenuOption() ;
            menuF.setCommand(fCommand);
            fCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressF();
                    }
                }
            ) ; 
            
            gCommand  = new MenuCommand() ;
            IMenuInvoker menuG = new MenuOption() ;
            menuG.setCommand(gCommand);
            gCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressG();
                    }
                }
            ) ; 
            
            
            hCommand  = new MenuCommand() ;
            IMenuInvoker menuH = new MenuOption() ;
            menuH.setCommand(hCommand);
            hCommand.setReceiver(
                new IMenuReceiver() {
                    public void doAction() {
                           currentState.pressH();
                    }
                }
            ) ; 
            
            menu.setMenuItem("A",aCommand);
            menu.setMenuItem("B",bCommand);
            menu.setMenuItem("C",cCommand);
            menu.setMenuItem("D",dCommand);
            menu.setMenuItem("E",eCommand);
            menu.setMenuItem("F",fCommand);
            menu.setMenuItem("G",gCommand);
            menu.setMenuItem("H",hCommand);
            
            
            
        
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
       // setState(cardScannedState);
       // updateScreen();
        
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
    
    public void setState(State state)
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
    
    public State getReceiptOptionState()
    {
        return receiptOptionSate;
    }

    public State getHelpState()
    {
        return helpState;
    }
 
    public State getCancelConfirmState()
    {
        return cancelConfirmState;
    }
    
    public void carWash(boolean haveCarWash) 
    {
        this.hasCarWash = haveCarWash;
        
        
    }
   
    public void setFuelUnitCost(double unitCost)
    {
        fuelUnitCost = unitCost;
    }
    
    public double getFuelUnitCost() 
    {
        return fuelUnitCost;
    }
    
    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }
    
    public String getFuelType() 
    {
        return fuelType;
    }
    
    public void calculateFuelCost(int units) 
    {
         fuelCost = fuelUnitCost*units;
         if (hasCarWash) {
             setState(printReceiptState);
             printReceipt();
         } else {
             setState(receiptOptionSate);
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
