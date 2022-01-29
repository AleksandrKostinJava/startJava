package Lesson1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");
        System.out.println();

        int age = 0;
        boolean isMale = true;
        double height = 0.0;
        String name = " ";
        char firstLetterOfTheName;

        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }

        if (!isMale) {
            System.out.println("Женского пола");
        }

        if (height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост выше 1.80");
        }

        firstLetterOfTheName = name.charAt(0);
        if (firstLetterOfTheName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfTheName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
        System.out.println();

        //Поиск максимального и минимального числа
        System.out.println("Поиск максимального и минимального числа");

        int firstNumber = 3;
        int secondNumber = 5;

        if (firstNumber > secondNumber) {
            System.out.println("Большее из двух чисел " + firstNumber + " и " + secondNumber + " - " + firstNumber);
        } else {
            System.out.println("Большее из двух чисел " + firstNumber + " и " + secondNumber + " - " + secondNumber);
        }
        System.out.println();

        //Работа с числом
        System.out.println("Работа с числом");

        int anyNumber = -1;

        if (anyNumber % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        if (anyNumber > 0) {
            System.out.println("Число положительное");
        } else if (anyNumber == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число отрицательное");
        }
        System.out.println();

        //Поиск общей цифры в числах
        System.out.println("Поиск общей цифры в числах");

        int aNum = 175;
        int bNum = 126;

        if ((aNum % 10) == (bNum % 10)) {
            System.out.println("У этих чисел одинаковое количество цифр в единицах");
        }
        if (((aNum / 10) % 10) == ((bNum / 10) % 10)) {
            System.out.println("У этих чисел одинаковое количество цифр в десятках");
        }
        if (((aNum / 100) % 10) == ((bNum / 100) % 10)) {
            System.out.println("У этих чисел одинаковое количество цифр в сотнях");
        }
        System.out.println();

        //Определение буквы или символа по их коду
        System.out.println("Определение буквы или символа по их коду");

        char a = '\u005A';

        if (a >= 'A' && a <= 'z') {
            System.out.println(a + " - этот символ - буква");
        } else if (a >= '1' && a <= '9') {
            System.out.println(a + " - этот символ - число");
        } else {
            System.out.println(a + " - это не число и не буква");
        }
        System.out.println();

        //Определение суммы вклада и начисленных банком %
        System.out.println("Определение суммы вклада и начисленных банком %");

        int deposit = 300_000;
        double annualPercent = 0.0;

        if (deposit > 0 && deposit < 100_000) {
            annualPercent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            annualPercent = 7;
        } else if (deposit > 300_000) {
            annualPercent = 10;
        } else {
            System.out.println("Недопустимый вклад");
        }

        double accruedSum = deposit * (annualPercent / 100);
        double totalSum = deposit + accruedSum;

        System.out.println("Сумма вклада - " + deposit + ", начисленный процент "
                + accruedSum + ", общая сумма " + totalSum);
        System.out.println();

        //Определение оценки по предметам
        System.out.println("Определение оценки по предметам");

        int historyPercent = 59;
        int programmingPercent = 91;
        double commonPercent = historyPercent + programmingPercent;
        double averagePercent = commonPercent / 2;
        int historyScore;
        int programmingScore;

        if (historyPercent > 60 && historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyScore = 4;
        } else if (historyPercent > 91) {
            historyScore = 5;
        } else historyScore = 2; // Подобный вариант не прописан в условии

        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingScore = 4;
        } else if (programmingPercent > 91) {
            programmingScore = 5;
        } else programmingScore = 2;

        double commonScore = programmingScore + historyScore;
        double averageScore = commonScore / 2;

        System.out.println(historyScore + " История");
        System.out.println(programmingScore + " Программирование");
        System.out.println(averageScore + " Средний балл по предметам");
        System.out.println(averagePercent + " Средний процент по предметам");
        System.out.println();
        
        //Расчет прибыли (убытка)
        System.out.println("Расчет прибыли (убытка)");

        int monthRentPrice = 5000;
        int monthCostPrice = 9000;
        int monthSellPrice = 15000;
        int annualRentPrice = monthRentPrice * 12;
        int annualCostPrice = monthCostPrice * 12;
        int annualSentPrice = monthSellPrice * 12;
        int endOutcome = annualSentPrice - (annualRentPrice + annualCostPrice);
        boolean isPositiveOutcome = endOutcome > 0;
        char endOutcomeSign;

        if (isPositiveOutcome) {
            endOutcomeSign = '+';
        } else if (!isPositiveOutcome) {
            endOutcomeSign = '-';
        } else endOutcomeSign = ' ';

        System.out.println("Итог продавца = " + endOutcomeSign + endOutcome);
        System.out.println();

        //*Определение существования треугольника
        System.out.println("*Определение существования треугольника");

        int aSide = 5;
        int bSide = 5;
        int cSide = 9;
        double triangleAngleDegrees = 90;
        char verticalLine = '|';
        char backSlash = '\\';
        char underScore = '_';
        StringBuilder aSideShow = new StringBuilder();
        StringBuilder bSideShow = new StringBuilder();
        boolean isTrianglePossibleToExist = (aSide + bSide) > cSide || (bSide + cSide) > aSide || (aSide + cSide) > bSide;
        double triangleSquare = (aSide * bSide) * (Math.sin(Math.toRadians(triangleAngleDegrees))) / 2;

        if (!isTrianglePossibleToExist) {
            System.out.println("Треугольник с такими сторонами не может сущестовать");
        } else System.out.println("Треугольник с такими сторонами может сущестовать");

        System.out.println("Площадь треугольника" + triangleSquare);
        System.out.println();

        /*    Вывод в консоль не поборол, если можно пожалуйста на этом не зацикливаться, потому что время дорого)

         for (int i = 0; i < bSide; i++) {
            bSideShow.append(underScore).append(System.getProperty("line.separator"));
        }

        for (int i = 0; i < aSide; i++) {
            aSideShow.append(verticalLine).append(System.getProperty("line.separator"));
        }

        System.out.println(aSideShow);
        System.out.println(bSideShow);

 */

        //Подсчет количества банкнот
        System.out.println("Подсчет количества банкнот");

        int sum = 567;
        int fiftyNominal = 50;
        int tenNominal = 10;
        int banknoteOfFiftyNominal = sum / fiftyNominal;
        int sumOfFiftyNominalBanknotesValue = banknoteOfFiftyNominal * fiftyNominal;
        int banknoteOfTenNominal = (sum - (sumOfFiftyNominalBanknotesValue)) / 10;
        int sumOfTenNominalBanknotesValue = banknoteOfTenNominal * tenNominal;
        int banknoteOfOneNominal = (sum - (sumOfFiftyNominalBanknotesValue) - (sumOfTenNominalBanknotesValue));

        System.out.println("Общая сумма - " + sum);
        System.out.println("Банкноты по 50 - " + banknoteOfFiftyNominal);
        System.out.println("Банкноты по 10 - " + banknoteOfTenNominal);
        System.out.println("Банкноты по 1 - " + banknoteOfOneNominal);

        int reverseCountSum = sumOfFiftyNominalBanknotesValue + sumOfTenNominalBanknotesValue + banknoteOfOneNominal;

        System.out.println(reverseCountSum);
    }
}
