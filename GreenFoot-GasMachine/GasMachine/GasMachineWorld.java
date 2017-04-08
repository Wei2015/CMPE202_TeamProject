import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasMachineWorld extends World
{
    private GasStation gasStation;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GasMachineWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        gasStation = new GasStation();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addFuelType();
        addKeyPad();
        addButtons();
        
        addObject(gasStation.getScreen(), 330, 150);
        addObject(gasStation.getCardSlot(), 250, 300);
        addObject(new Printer(), 250, 375);
        addObject(new CreditCard(), 600, 350);
    }
    
    private void addButtons()
    {
        Button[] buttons = new Button[8];
        buttons[0] = new ButtonA(gasStation);
        buttons[1] = new ButtonB(gasStation);
        buttons[2] = new ButtonC(gasStation);
        buttons[3] = new ButtonD(gasStation);
        buttons[4] = new ButtonE(gasStation);
        buttons[5] = new ButtonF(gasStation);
        buttons[6] = new ButtonG(gasStation);
        buttons[7] = new ButtonH(gasStation);
        
        int x = 160;
        int y = 100;
        for (int i = 0; i < buttons.length; i++) {
            if (i == 4) {
             x = 500;
             y = 100;
            }
            addObject(buttons[i], x, y);
            y+= 40;
        }
    }
    
    
    private void addFuelType()
    {
      FuelType[] types = new FuelType[3]; 
        types[0] = new FuelType87(gasStation);
        types[1] = new FuelType91(gasStation);
        types[2] = new FuelType93(gasStation);
        int x = 250;
        int y = 480;
        for (int i = 0; i < types.length; i++) {
            addObject(types[i], x, y);
            x+= 80;
        }  
        
        addObject(new Nozzle(gasStation), 600, y);
    }
    
    private void addKeyPad()
    {
        Key[] keyPad = new Key[12];
        keyPad[0] = new Key0(gasStation);
        keyPad[1] = new Key1(gasStation);
        keyPad[2] = new Key2(gasStation);
        keyPad[3] = new Key3(gasStation);
        keyPad[4] = new Key4(gasStation);
        keyPad[5] = new Key5(gasStation);
        keyPad[6] = new Key6(gasStation);
        keyPad[7] = new Key7(gasStation);
        keyPad[8] = new Key8(gasStation);
        keyPad[10] = new Key9(gasStation);
        keyPad[11] = new KeyEnter(gasStation);
        keyPad[9] = new KeyClear(gasStation);
        int x = 280;
        int y = 250;
        for (int i = 0; i < keyPad.length; i++) {
            if (i%3 ==0) {
             y+=35;
             x =330;
            }
            addObject(keyPad[i], x, y);
            x+= 45;
        }
    }
}
