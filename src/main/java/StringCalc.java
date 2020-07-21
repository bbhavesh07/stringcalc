package src.main.java;

public class StringCalc {

    public static int add(String s) {
        if(!s.isEmpty())
            return Integer.parseInt(s);
        return 0;
    }
}
