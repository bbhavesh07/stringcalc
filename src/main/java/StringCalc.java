package src.main.java;

import java.util.Arrays;

public class StringCalc {

    public static int add(String s) {
        if(!s.isEmpty()){
            return Arrays.stream(s.split(",")).map(x->Integer.parseInt(x)).reduce(0, (sum, x)-> sum+x);
        }
        return 0;
    }
}
