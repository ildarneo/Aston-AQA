import Lesson_12_junit5.Factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test_Junit {

    @Test
        void FactorialPositiveNumber() {
        assertEquals(24, Factorial.factorial(4));
        System.out.println("Проверка факториала 4");
    }

    @Test
    void FactorialZero  () {
        assertEquals(1, Factorial.factorial(0));
        System.out.println("Проверка на ноль");
    }

    @Test
    void FactorialExceptionForNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-4);
        });
        assertEquals("Полученное число целое и положительно.", exception.getMessage());
        System.out.println("Проверка на отрицательное число");
    }
}