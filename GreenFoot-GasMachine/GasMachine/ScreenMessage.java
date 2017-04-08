import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenMessage extends Message
{   
    //default text location x_coordinate: TO BE changed to receipt printer (the credit card reader) location
    private int textLoc_x = 5;     
    //default text location y_coordinate: TO BE changed to receipt printer (the credit card reader) location
    private int textLoc_y = 25;    

    /**
     * Constructor for objects of class Message
     */
    public ScreenMessage()
    {
        image = new GreenfootImage(250, 200);
        setImage(image);
        image.setColor(Color.YELLOW);
        image.fill();
    }
    
   

    /**
     * When the message object is clicked, it'll disappear.
     * 
     */
    public void act()
    {
        
    }
    
     /**
     * setText of the message
     * 
     * @param msg   The content of the message
     */
    public void setText(String msg)
    {
        image.clear();
        image.setColor(Color.YELLOW);
        image.fill();
        image.setColor(Color.BLACK);
        image.drawString(msg, textLoc_x, textLoc_y);
    }
    
}
