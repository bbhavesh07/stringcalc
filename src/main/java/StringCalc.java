package src.main.java;

import java.util.Arrays;

public class StringCalc {

    public static int add(String s) {
        if(!s.isEmpty()){
            String delim = "[,\n]";
            if(s.length() > 2 && s.substring(0,2).equals("//")){
                delim = s.split("\n")[0].substring(2);
                s = s.substring(s.indexOf("\n")+1);
            }
            return Arrays.stream(s.split(delim)).map(x->Integer.parseInt(x)).reduce(0, (sum, x)-> sum+x);
        }
        return 0;
    }
}
