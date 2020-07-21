package src.main.java;

import java.util.Arrays;

public class StringCalc {

    public static int add(String s) throws NegativeNumberException{
        if(!s.isEmpty()){
            String delim = "[,\n]";
            if(s.length() > 2 && s.substring(0,2).equals("//")){
                delim = s.split("\n")[0].substring(2);
                s = s.substring(s.indexOf("\n")+1);
            }
            String nums[] = s.split(delim);
            int negNumbers[] = new int[nums.length];
            int i = 0, sum = 0;
            for(String num: nums){
                int n = Integer.parseInt(num);
                if(n < 0)
                    negNumbers[i++] = n;
                if(n <= 1000)
                    sum += n;
            }
            if(i > 0){
                StringBuilder msg = new StringBuilder();
                while(i > 0){
                    msg.append(negNumbers[--i] + " ");
                }
                throw new NegativeNumberException(msg.toString());
            }
            return sum;
        }
        return 0;
    }
}
