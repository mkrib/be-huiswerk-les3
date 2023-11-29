import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    HashMap<Integer,String> numericAlpha = new HashMap<Integer, String>();
    public Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[0], alphabetic[0]);
        }
    }

    public String translate (Integer number) {
        return numericAlpha.get(number);
    }


}
