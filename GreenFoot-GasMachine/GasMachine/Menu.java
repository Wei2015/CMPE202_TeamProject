import java.util.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu  
{
    
    
     
     Map<String, IMenuInvoker > map= new HashMap<String, IMenuInvoker >();
     
    private IMenuInvoker menuA = new MenuOption() ;
    private IMenuInvoker menuB = new MenuOption() ;
    private IMenuInvoker menuC = new MenuOption() ;
    private IMenuInvoker menuD = new MenuOption() ;
    private IMenuInvoker menuE = new MenuOption() ;
    private IMenuInvoker menuF = new MenuOption() ;
    private IMenuInvoker menuG = new MenuOption() ;
    private IMenuInvoker menuH = new MenuOption() ;
     
     public Menu(){
        map.put("A",menuA);
        map.put("B",menuB);
        map.put("C",menuC);
        map.put("D",menuD);
        map.put("E",menuE);
        map.put("F",menuF);
        map.put("G",menuG);
        map.put("H",menuH);
    }
    
    public void setMenuItem( String slot, IMenuCommand c )
    {
        IMenuInvoker invoker= map.get(slot);
        invoker.setCommand(c) ;
  
    }
    
       
    public void cmd( String c ) 
    {
        map.get(c).invoke();
    }
    
}
