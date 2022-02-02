package Lesson1;

import java.beans.Expression;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a = 8;      //  double
        int b = 8;      //  если деление
        int result = 1; //  с остатком
        char sign = '^';
        if(sign == '-') {
            result = a - b;
        } else if(sign == '+') {
            result = a + b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '/') {
            result = a / b; //
        } else if(sign == '^') {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        } else if(sign == '%') {
            result = a % b;
        }

        System.out.println("Результат выражения " + a + " " + sign + " " + b + " = " + result);
    }
}
