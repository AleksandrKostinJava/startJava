package Lesson1;

public class Unicode {
    static char c;

    public static void main(String[] args) {
        for (char i = 9398; i <= 10178; i++) {
            if (i % 75 == 0) {
                System.out.println();
            }
            System.out.print(c = i);
        }
    }
}

