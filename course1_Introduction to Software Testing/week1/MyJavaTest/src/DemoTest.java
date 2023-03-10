import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {
    @Test
    public void test_is_triangle_1() {
        assertTrue(Demo.isTriangle(3,4,5));
    }

    @Test
    public void test_is_triangle_2() {
        assertTrue(Demo.isTriangle(5,12,13));
    }

    @Test
    public void test_is_triangle_3() {
        assertTrue(Demo.isTriangle(5,13,12));
    }

    @Test
    public void test_is_triangle_4() {
        assertTrue(Demo.isTriangle(12,5,13));
    }

    @Test
    public void test_is_triangle_5() {
        assertTrue(Demo.isTriangle(12,13,5));
    }

    @Test
    public void test_is_NOT_triangle_1() {
        assertFalse(Demo.isTriangle(5,7,13));
    }

    @Test
    public void test_is_NOT_triangle_2() {
        assertFalse(Demo.isTriangle(5,13,7));
    }

    @Test
    public void test_is_NOT_triangle_3() {
        assertFalse(Demo.isTriangle(13,5,7));
    }

    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Demo.isTriangle(13,7,5));
    }

    @Test
    public void test_is_NOT_triangle_5() {
        assertFalse(Demo.isTriangle(13,7,5));
    }

    @Test
    public void test_is_NOT_triangle_6() {
        assertFalse(Demo.isTriangle(5,9,3)); // not a triangle!
    }

    @Test
    public void test_is_NOT_triangle_7() {
        assertFalse(Demo.isTriangle(1,2,-1));
    }

    @Test
    public void test_main_program_1() {

         String input = "5\n12\n13\n";
         ByteArrayInputStream in =
                 new ByteArrayInputStream(input.getBytes());
         System.setIn(in);
 
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         System.setOut(new PrintStream(out));
         String[] args = {};
         Demo.main(args);
         System.exit(0);

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";

        assertEquals(consoleOutput, out.toString());
    } 

    @Test
    public void test_main_program_2() {

         String input = "12\n5\n13\n";
         ByteArrayInputStream in =
                 new ByteArrayInputStream(input.getBytes());
         System.setIn(in);
 
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         System.setOut(new PrintStream(out));
         String[] args = {};
         Demo.main(args);
         System.exit(0);

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";

        assertEquals(consoleOutput, out.toString());
    } 

    @Test
    public void test_main_program_3() {

         String input = "5\n13\n12\n";
         ByteArrayInputStream in =
                 new ByteArrayInputStream(input.getBytes());
         System.setIn(in);
 
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         System.setOut(new PrintStream(out));
         String[] args = {};
         Demo.main(args);
         System.exit(0);

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";

        assertEquals(consoleOutput, out.toString());
    } 

    @Test
    public void test_main_program_4() {

         String input = "12\n13\n5\n";
         ByteArrayInputStream in =
                 new ByteArrayInputStream(input.getBytes());
         System.setIn(in);
 
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         System.setOut(new PrintStream(out));
         String[] args = {};
         Demo.main(args);
         System.exit(0);

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";

        assertEquals(consoleOutput, out.toString());
    } 
}