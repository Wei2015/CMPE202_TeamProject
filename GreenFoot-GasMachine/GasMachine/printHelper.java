/**
 * Write a description of class printHelper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public final class printHelper  
{
    /**
     * Constructor for objects of class printHelper
     */
    public printHelper()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static String whiteSpace(int n)
    {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(" ");
        }
        return str.toString();
    }
    
    public static String newLine(int n)
    {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append("\n");
        }
        return str.toString();
    }
}
