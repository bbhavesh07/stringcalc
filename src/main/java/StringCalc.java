package src.main.java;

public class StringCalc {

    public static int add(String s) {
        if(!s.isEmpty()){
            String nums[] = s.split(",");
            if(nums.length == 1)
                return Integer.parseInt(nums[0]);
            else
                return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
        }
        return 0;
    }
}
