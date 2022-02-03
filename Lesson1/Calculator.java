package Lesson1;

public class Calculator {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        int result = 1;
        char sign = '^';
        if (sign == '-') {
            result = a - b;
        } else if (sign == '+') {
            result = a + b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b; //
        } else if (sign == '^') {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        }

        System.out.println("Результат выражения " + a + " " + sign + " " + b + " = " + result);
    }
}
