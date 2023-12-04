import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    HashMap<Integer,String> numericAlpha = new HashMap <Integer, String>();

    // Dit is een constructor, een constructor heeft altijd dezelfde naam als de class
    public Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    // Dit is een methode
    public String translate (Integer number) {
        return numericAlpha.get(number);
    }




}
