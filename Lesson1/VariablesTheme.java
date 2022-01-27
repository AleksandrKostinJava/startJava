package Lesson1;

public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        System.out.println("Создание переменных и вывод их значений на консоль");

        byte totalCores = 4;
        short totalThreads = 8;
        int baseFrequency = 2500;
        long ramSize = 8192L;
        float dramFrequency = 1463.1F;
        double uncoreFrequency = 797.7;
        char letter = 'a';
        boolean isWorking = true;

        System.out.println(totalCores);
        System.out.println(totalThreads);
        System.out.println(baseFrequency);
        System.out.println(dramFrequency);
        System.out.println(uncoreFrequency);
        System.out.println(letter);
        System.out.println(isWorking);

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");

        double xPrice = 100.0;
        double yPrice = 200.0;

        double discountAmount = (yPrice + xPrice) / 10;
        double lastPrice = (xPrice + yPrice) - discountAmount;
        System.out.println("Стоимость со скидкой - " + lastPrice);
        System.out.println("Сумма скидки - " + discountAmount);

        //Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных
        System.out.println("Отображение min и max значений числовых типов данных");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);

//        byte maxByteIncreasedByOne = 128;
//        short maxShortIncreasedByOne = 32_768;
//        int maxIntIncreasedByOne = 2_147_483_648;
//        long maxLongIncreasedByOne = 9_223_372_036_854_775_808L;
//
//        System.out.println(maxByteIncreasedByOne);
//        System.out.println(maxShortIncreasedByOne);
//        System.out.println(maxIntIncreasedByOne);
//        System.out.println(maxLongIncreasedByOne);

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");

        double firstVariable = 5.4;
        double secondVariable = 3.68;

        System.out.println(firstVariable + " " + secondVariable);

        double thirdVariable = 0.0;
        thirdVariable = secondVariable;
        secondVariable = firstVariable;
        firstVariable = thirdVariable;

        System.out.println(firstVariable + " " + secondVariable);

        //Вывод ASCII-символов и их кодов
        System.out.println("Вывод ASCII-символов и их кодов");

        byte a = 35;
        byte b = 38;
        byte c = 64;
        byte d = 94;
        byte e = 95;

        char aNumberChar = 35;
        char bNumberChar = 38;
        char cNumberChar = 64;
        char dNumberChar = 94;
        char eNumberChar = 95;

        System.out.println(a + " in char equals " + aNumberChar);
        System.out.println(b + " in char equals " + bNumberChar);
        System.out.println(c + " in char equals " + cNumberChar);
        System.out.println(d + " in char equals " + dNumberChar);
        System.out.println(e + " in char equals " + eNumberChar);

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");

        int startNumber = 345;
        int summa = 0;
        int composition = 1;

        while (startNumber != 0) {
            composition = composition * (startNumber % 10) ;
            summa += startNumber % 10;
            startNumber /= 10;

        }

        System.out.println(startNumber);
        System.out.println(summa);
        System.out.println(composition);

        //Вывод на консоль ascii-арт Дюка
        System.out.println("Вывод на консоль ascii-арт Дюка");

        char space = ' ';
        char slash = '/';
        char backSlash = '\\';
        char underScore = '_';
        char roundBracketLeft = '(';
        char roundBracketRight = ')';

        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(space);
        System.out.println(backSlash);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(backSlash);
        System.out.println(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(underScore);
        System.out.print(roundBracketLeft);
        System.out.print(space);
        System.out.print(roundBracketRight);
        System.out.print(underScore);
        System.out.print(backSlash);
        System.out.println(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(backSlash);
        System.out.println(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(underScore);
        System.out.print(underScore);
        System.out.print(underScore);
        System.out.print(slash);
        System.out.print(backSlash);
        System.out.print(underScore);
        System.out.print(underScore);
        System.out.print(underScore);
        System.out.print(underScore);
        System.out.print(backSlash);
        System.out.println();

        //Отображение сотен, десятков, единиц числа
        System.out.println("Отображение сотен, десятков, единиц числа");

        int taskNineNumber = 123;
        int hundreds = taskNineNumber / 100 * 100;
        int decades = taskNineNumber % 100 / 10 * 10;
        int units = taskNineNumber % 10;

        System.out.println("Число " + taskNineNumber + " состоит из " + hundreds + " + " + decades + " + " + units);

        //Преобразование секунд
        System.out.println("Преобразование секунд");

        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = (seconds % 3600) % 60;

        System.out.println("В " + seconds + " секундах " + hours + " часов " + minutes + " минут и " + remainingSeconds + " секунд");
    }
}
