package Lesson1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");
        System.out.println();

        int age = 0;

        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }

        boolean isMale = true;

        if (!isMale) {
            System.out.println("Женского пола");
        }

        double height = 0.0;

        if (height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост выше 1.80");
        }

        String name = " ";
        char firstLetterOfName;

        firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
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

        int aNum = 465;
        int bNum = 785;

        if ((aNum % 10) == (bNum % 10)) {
            System.out.println("У этих чисел равны цифры в единицах");
        } else if (((aNum / 10) % 10) == ((bNum / 10) % 10)) {
            System.out.println("У этих чисел равны цифры в десятках");
        } else if (((aNum / 100) % 10) == ((bNum / 100) % 10)) {
            System.out.println("У этих чисел равны цифры в сотнях");
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

        int endOutcome = (15_000 - 5_000 - 9_000) * 12;

        if (endOutcome > 0) {
            System.out.println("Итог продавца = +" + endOutcome);
        } else System.out.println("Итог продавца = -" + endOutcome);
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
        boolean isTrianglePossibleToExist = (aSide + bSide) > cSide || (bSide + cSide) > aSide || (aSide + cSide) > bSide;
        double triangleSquare = (aSide * bSide) * (Math.sin(Math.toRadians(triangleAngleDegrees))) / 2;

        if (!isTrianglePossibleToExist) {
            System.out.println("Треугольник с такими сторонами не может сущестовать");
        } else System.out.println("Треугольник с такими сторонами может сущестовать");

        System.out.println("Площадь треугольника " + triangleSquare);
        System.out.println();

        System.out.println("|\\");
        System.out.println("  \\");
        System.out.println("|  \\");
        System.out.println("    \\");
        System.out.println("|    \\");
        System.out.println("      \\");
        System.out.println("|      \\");
        System.out.println("        \\");
        System.out.println("|__ _ _ _\\");
        System.out.println();

        //Подсчет количества банкнот
        System.out.println("Подсчет количества банкнот");

        int sum = 567;
        int countNominal50 = sum / 50;
        int valueCountNominal50 = countNominal50 * 50;
        int countNominal10 = (sum - (valueCountNominal50)) / 10;
        int valueCountNominal10 = countNominal10 * 10;
        int countNominal1 = (sum - (valueCountNominal50) - (valueCountNominal10));

        System.out.println("Общая сумма - " + sum);
        System.out.println("Банкноты по 50 - " + countNominal50);
        System.out.println("Банкноты по 10 - " + countNominal10);
        System.out.println("Банкноты по 1 - " + countNominal1);

        int reverseCountSum = valueCountNominal50 + valueCountNominal10 + countNominal1;

        System.out.println(reverseCountSum);
    }
}
