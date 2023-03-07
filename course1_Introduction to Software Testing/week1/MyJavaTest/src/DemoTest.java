import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest {

    @Test
    public void test_is_triangle_1() {
        assertTrue(Demo.isTrinagle(3,4,5));
    }

    @Test
    public void test_is_triangle_2() {
        assertTrue(Demo.isTrinagle(5,12,13));
    }

    @Test
    public void test_is_triangle_3() {
        assertTrue(Demo.isTrinagle(5,13,12));
    }

    @Test
    public void test_is_triangle_4() {
        assertTrue(Demo.isTrinagle(12,5,13));
    }

    @Test
    public void test_is_triangle_5() {
        assertTrue(Demo.isTrinagle(12,13,5));
    }

    @Test
    public void test_is_NOT_triangle_1() {
        assertFalse(Demo.isTrinagle(5,7,13));
    }

    @Test
    public void test_is_NOT_triangle_2() {
        assertFalse(Demo.isTrinagle(5,13,7));
    }

    @Test
    public void test_is_NOT_triangle_3() {
        assertFalse(Demo.isTrinagle(13,5,7));
    }

    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Demo.isTrinagle(13,7,5));
    }

    @Test
    public void test_is_NOT_triangle_5() {
        assertFalse(Demo.isTrinagle(13,7,5));
    }

    @Test
    public void test_is_NOT_triangle_6() {
        assertFalse(Demo.isTrinagle(5,9,3)); // not a triangle!
    }

    @Test
    public void test_is_NOT_triangle_7() {
        assertFalse(Demo.isTrinagle(1,2,-1));
    }

    /*
    @Test
    public void test_main_program_1() {
        ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle. \n";

        assertEquals(consoleOutput, out.toString());
    }  */
}