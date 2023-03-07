import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {
    @Test
    public void testAddition() {
        int num1 = 5;
        int num2 = 10;
        int result = num1 + num2;
        assertEquals(15, result);
        System.out.println("Test passed.");
    }
    
    @Test
    public void testSubtraction() {
        int num1 = 5;
        int num2 = 10;
        int result = num2 - num1;
        assertEquals(5, result);
        System.out.println("Test passed.");
    }
    
    @Test
    public void testMultiplication() {
        int num1 = 5;
        int num2 = 10;
        int result = num1 * num2;
        assertEquals(50, result);
        System.out.println("Test passed.");
    }
}
