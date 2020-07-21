package src.test.java;

import src.main.java.NegativeNumberException;
import src.main.java.StringCalc;
import org.junit.Test;

public class StringCalcTest {
    @Test
    public void givenEmptyString_returns_zero(){
        assert(StringCalc.add("") == 0);
    }

    @Test
    public void givenNumber_returns_number(){
        assert(StringCalc.add("1") == 1);
    }

    @Test
    public void givenTwoNumbers_returns_sum(){
        assert(StringCalc.add("1,2") == 3);
    }

    @Test
    public void givenNNumbers_returns_sum(){
        assert(StringCalc.add("1,2,3,4") == 10);
    }

    @Test
    public void givenNumbersSeparatedByNewLine_returns_sum(){
        assert(StringCalc.add("1\n2") == 3);
    }

    @Test
    public void givenNumbersAndDelimiter_returns_sum(){
        assert(StringCalc.add("//;\n1;2") == 3);
    }

    @Test(expected = NegativeNumberException.class)
    public void givenNegativeNumber_throws_exception(){
        try {
            StringCalc.add("//;\n-1;2");
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
            assert(e.getMessage().contains("-1"));
            throw e;
        }
        assert(false);
    }
}
