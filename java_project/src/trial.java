import javax.print.attribute.standard.MediaSize;
import java.util.*;

/**
 * Created by ab on 2017/9/26.
 */


public class trial {
    static public void main(String[] args) throws Exception {
        System.out.println(Math.exp(1));
        System.out.println(new Double("2323.23E2"));
        int a = 3;
        double b = 3.44;
        System.out.println(Double.NaN) ;
        System.out.println( Double.POSITIVE_INFINITY);
        Map m = new HashMap<String, Integer>();
        m.put("h", 3);
        for ( Object x : m.keySet()) {
            System.out.println(x);
        }
    }
}
