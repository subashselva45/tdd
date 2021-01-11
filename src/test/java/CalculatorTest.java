import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int sum = calculator.sum(2, 2);
        Assert.assertEquals(4, sum);
    }

    @Test
    public void testSum2() {
        int sum = calculator.sum(0, -1);
        Assert.assertEquals(-1, sum);
    }

    @Test
    public void divide() {
        int result = calculator.divide(2, 2);
        Assert.assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException() {
        int result = calculator.divide(2, 0);
    }

    @Test
    public void divideDouble() {
        double result = calculator.divide(2, 2);
        Assert.assertEquals(1, result, 0.001);

    }

    @Test
    public  void testSortArray(){
        int[] arr = {3,1,2};
        Assert.assertArrayEquals(new int[]{1,2,3}, calculator.sortAnArray(arr));
    }
}