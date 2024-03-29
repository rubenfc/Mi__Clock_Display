
/**
 * Write a description of class numberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    //The value you want.
    private int value;
    //The limit of the value.
    private int limit;

    /**
     * Sets the value to 0 and asks for value's limit.
     */
    public NumberDisplay(int newLimit)
    {
        value = 0;
        limit = newLimit;
    }

    /**
     * Sets the value.
     */
    public void setValue (int currentDisplayValue)
    {
        if ((currentDisplayValue < limit) && (currentDisplayValue >= 0)){
            value = currentDisplayValue;
        }
        else{
            System.out.println("Introduce un valor dentro del limite");
        }    
        
    }

    /**
     * Gets the display value.
     */
    public String getDisplayValue()
    {
        String newDisplayValue; 
        if (value < 10)
        {
            newDisplayValue = ("0" + value);
        }
        else
        {
            newDisplayValue = ("" + value);
        }
        return newDisplayValue;
    }
    
    /**
     * Returns the value.
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Adds 1 to the current value.
     */

    public void increment()
    {
        value = value + 1;

        if (value == limit)
        {
            value = 0;
        }
    }

}