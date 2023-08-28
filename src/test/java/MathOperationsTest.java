import org.example.MathOperations;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationsTest {
    private final MathOperations mathOperations = new MathOperations();

    @Test
    public void testAdd() {
        assertEquals(8, mathOperations.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, mathOperations.subtract(10, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, mathOperations.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, mathOperations.divide(5, 2), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        mathOperations.divide(10, 0);
    }

    @Test
    public void testFindMaxWithEqualNumbers() {
        int result = mathOperations.findMax(5, 5);
        assertEquals(5, result);
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        int result = mathOperations.findMax(-3, -7);
        assertEquals(-3, result);
    }

    @Test
    public void testFindMaxWithLargeNumbers() {
        int result = mathOperations.findMax(1000, 999);
        assertEquals(1000, result);
    }

    @Test(timeout = 1000)
    public void testFibonacciPerformance() {
        mathOperations.fibonacci(20);
    }
}