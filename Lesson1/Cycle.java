package Lesson1;

public class Cycle {
    public static void main(String[] args) {
        //Выведите на консоль с помощью цикла for все числа от [0, 20]
        System.out.println("Выведите на консоль с помощью цикла for все числа от [0, 20]");

        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        System.out.println("Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");

        int a = 6;
        while (a >= -6) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a--;
        }
        System.out.println();

        //Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        System.out.println("Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");

        int count = 0;
        int b = 10;

        do {
            if (b % 2 != 0)
            count += b;
            b++;
        }
        while (b <= 20);

        System.out.println("Сумма нечетных чисел " + count);
    }
}
