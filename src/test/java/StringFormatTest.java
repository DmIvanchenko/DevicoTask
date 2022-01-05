import org.junit.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public class StringFormatTest {
    TemperatureFormatter formatter = new TemperatureFormatter();
    @Test
    public void noPlusOrMinusTest(){
        String str = "26C";
        double t = 0;
        formatter.formatChecker(str, t);
        assertEquals(t, null, "Plus/Minus value correctly detected");
    }
    @Test
    public void incorrectValueTest(){
        String str = "+2C6C";
        Double t = 0.0;
        t = formatter.formatter(str);
        assertEquals(t, null, "Incorrect value correctly checked");
    }
    @Test
    public void noUnitTest(){
        String str = "+26";
        Double t = 0.0;
        t = formatter.formatChecker(str, t);
        assertEquals(t, null, "Unit value checked correctly");
    }
}
