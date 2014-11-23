/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //horas
    private NumberDisplay hour;
    //minutos
    private NumberDisplay minute;
    //dia
    private NumberDisplay dia;
    //mes
    private NumberDisplay mes;
    //año
    private NumberDisplay anio;
    //hora y fecha
    private String courentValue;

    /**
     * da la hora a 00:00 y la fecha 01/01/01
     */
    public ClockDisplay()
    {
        hour   = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        dia    = new NumberDisplay(31);
        mes  = new NumberDisplay(13);
        anio   = new NumberDisplay(100);
        dia.setValue(1);
        mes.setValue(1);
        anio.setValue(0);
        updateDisplay();       
    }

    /**
     * introducir la hora
     */
    public ClockDisplay(int newHour, int newMinute, int newDay, int newMonth, int newYear)
    {
        hour   = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        dia    = new NumberDisplay(31);
        mes  = new NumberDisplay(13);
        anio   = new NumberDisplay(100);
        hour.setValue(newHour);
        minute.setValue(newMinute);
        dia.setValue(newDay);
        mes.setValue(newMonth);
        anio.setValue(newYear);       
        updateDisplay();
    }

    /**
     * fija la hora y fecha 
     */

    public void setTime(int newHour, int newMinute, int newDia, int newMes, int newAnio)
    {
        hour.setValue(newHour);
        minute.setValue(newMinute);
        dia.setValue(newDia);
        mes.setValue(newMes);
        anio.setValue(newAnio);
        updateDisplay();
    }
    
   
    public void setDate(int newDia, int newMes, int newAnio)
    {
        dia.setValue(newDia);
        mes.setValue(newMes);
        anio.setValue(newAnio);      
        updateDisplay();
    }
    
     /**
     * fija la hora en valores nuevos
     */

    public void setHour(int newHour, int newMinute)
    {
        hour.setValue(newHour);
        minute.setValue(newMinute);      
        updateDisplay();
    }
    
    
    
    /**
     * devuelve en cadena la hora
     */
    public String getTime()
    {
        return courentValue;
    }

    /**
     * incrementa un minuto 
     */

    public void timeTick()
    {
        minute.increment();
        
        if (minute.getValue() == 0)
        {
            hour.increment();
            
            if (hour.getValue() == 0)
            {
               dia.increment();
            }
           
            if (dia.getValue() == 0)
            {   
                dia.setValue(1);
                mes.increment();
            
                if (mes.getValue() == 0)
                {
                    mes.setValue(1);
                    anio.increment();
                }
            }
        }
        updateDisplay();
    }
      
    /**
     * cadena hora y fecha
     */
    private void updateDisplay()
    {
        int valueHour = hour.getValue();
        String newMinute = minute.getDisplayValue();
        String newHour; 
        String amPm;
        
            
       
        if(valueHour < 12)
        {   
            String manana = "am";
           
            if (valueHour == 0)
            {
                newHour = "12";
            }
            else
            {
                newHour = hour.getDisplayValue();
                courentValue = newHour + ":" + newMinute + " " + manana + " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + anio.getDisplayValue();
            }
            
        }
        else
        {
            String tarde = "pm";
            
            if (valueHour == 12)
            {
                newHour = "12";
            }
            else if((valueHour - 12) < 10 )
            {
                newHour = "0" + (valueHour - 12);
            }
            else
            {
                newHour = "" + (valueHour - 12);
                courentValue = newHour + ":" + newMinute + " " + tarde + " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + anio.getDisplayValue();
            }
        
        }
    }

}
