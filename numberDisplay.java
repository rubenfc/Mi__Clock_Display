
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
    
   
        /**
        * fija el valor de display y pone el valor actual del display en 0
        */
        public numberDisplay(int newlimite)
        {
            value = 0;
            limite = newlimite;
        }

        /**
         * fija el valor del atributo value a uno dando
         */
        public void setValue(int currentDisplay)
        {
            value = currentDisplay;
        }

        /**
         * devuelve una cadena de dos caracteres 
         * con el valor del atributo value
         */

        public String getDisplayValue()
        {
            String returnValue = "";
            if (value > 10)
            {

                returnValue = "0" + value;
            }
            else 
            {
                returnValue = "" + value;
            }
            return returnValue;
        }

        /**
         * devuelve el valor del value
         */
        public int getValue()
        {
            return  value;
        }

        /**
         * incrementa en 1 el valor de value y lo hace volver a 0 si alcanza el limite
         */
        public int increment()
        {
            value = value + 1;
            if (value == limite) 
            {
                value = 0;
            }

        }
        
    }