import Lesson_12_testng.Factorial;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class TestNG {

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(6, Factorial.factorial(3));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialExceptionForNegativeNumber() {
        Factorial.factorial(-3);
    }
}