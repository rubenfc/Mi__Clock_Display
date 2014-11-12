
/**
 * Write a description of class numberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class numberDisplay
{
    //limite del display
    private int limite;
    //display actual
    private int value;
    private int incremento;
    
    /*
     * fija el valor de display y pone el valor actual del display en 0
     */
    public numberDisplay (int limite)
    {
        value = 0;
        
    }
    
    
    public void setValue(int currentDisplay)
    {
        value = currentDisplay;
    }
    
    public String getDisplayValue()
    {
        if (value > 10)
        {
           
            return "0" + value;
        }
        else 
        {
            return "" + value;
        }
    }
    
    public int getValue()
    {
        return  value;
    }
    
    public int increment()
    {
        if (value < limite)
        {
            return value = value + 1;
        }
        else 
        {
            return value = 0;
        }
    
    }
}