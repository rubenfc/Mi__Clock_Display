
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockDisplay
{
    // las horas
    private int hours;
    // los minutos
    private int minutes;
    //hora actual
    private String horaActual;

    public void ClockDisplay()
    {
        horaActual = "00:00"; 
    }

    /**
     * fija la hora actual
     */
    public void numberDisplay(int horaActual, int minutoActual)

    {
        if (horaActual < 24 && horaActual >= 0) 
        {
            hours = horaActual;
        }
        if (horaActual < 60 && horaActual >= 0)
        {
            minutes = minutoActual;
        }

        /**
         * fija la hora en 00:00
         */

    }

    /**
     * fija unas horas y unos minutos dados
     */
    public void setTime(int newHours, int newMinutes)
    {
        hours = newHours;
        minutes = newMinutes;
    }

    /**
     *5 caractere motrando la hora y min separado por dos puntos 
     */
    public String getTime()
    {
        String time = "";

        if (hours < 10)
        {
            time = "0" + hours;
        }
        else 
        {
            time = "" + hours;
        }

        time = time + ":";

        if (minutes < 10)
        {
            time = time + "0" + minutes;
        }

        else
        {
            time = time +  minutes;
        }
        return time;
    }    
}