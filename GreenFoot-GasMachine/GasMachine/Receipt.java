import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends Message
{
    private int textLoc_x = 5;     
    private int textLoc_y = 25;
   public Receipt(String message)
   {
        image = new GreenfootImage(200, 100);
        setImage(image);
        image.setColor(Color.GREEN);
        image.fill();
        image.setColor(Color.BLACK);
        image.drawString(message, textLoc_x, textLoc_y);
    }
    
   public void setText(String msg)
   {
   }
   
  
}
