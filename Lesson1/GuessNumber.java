package Lesson1;

public class GuessNumber {
    public static void main(String[] args) {
        int userNumber = 17;
        int computerNumber = 87;

        System.out.println("Компьютер загадал число");
        System.out.println("Ваше число " + userNumber);

        do {
            if (userNumber <= 0 || userNumber > 100) {
                System.out.println("Ваше число должно быть от 1 до 100");
                break;
            } else if (userNumber > computerNumber) {
                System.out.println("Ваше число больше того, что загадал компьютер");
                userNumber--;
                computerNumber = userNumber / 5 + 4;
            } else if (userNumber < computerNumber) {
                System.out.println("Ваше число меньше того, что загадал компьютер");
                userNumber++;
                computerNumber = userNumber / 5 + 4;
            }
        } while (userNumber != computerNumber);

        if (userNumber == computerNumber) {
            System.out.println("Поздравляю, вы угадали число");
        }
    }
}