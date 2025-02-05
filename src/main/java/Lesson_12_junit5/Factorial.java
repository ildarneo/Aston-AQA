package Lesson_12_junit5;


public class Factorial {
    public  static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Полученное число целое и положительно.");
        }
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }
}
