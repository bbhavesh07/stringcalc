package src.test.java;

import src.main.java.StringCalc;
import org.junit.Test;

public class StringCalcTest {
    @Test
    public void givenEmptyString_returns_zero(){
        assert(StringCalc.add("") == 0);
    }
}
