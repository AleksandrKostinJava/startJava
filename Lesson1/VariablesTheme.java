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
        System.out.println();

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");

        double xPrice = 100.0;
        double yPrice = 200.0;
        double discount = 11;

        double discountAmount = (yPrice + xPrice) * (discount / 100);
        double lastPrice = (xPrice + yPrice) - discountAmount;
        System.out.println("Стоимость со скидкой - " + lastPrice);
        System.out.println("Сумма скидки - " + discountAmount);
        System.out.println();

        //Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");
        System.out.println();

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

        maxByte++;
        maxShort++;
        maxInt++;
        maxLong++;

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);

        maxByte--;
        maxShort--;
        maxInt--;
        maxLong--;

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);
        System.out.println();

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");

        double firstNum = 5.4;
        double secondNum = 3.68;

        System.out.println(firstNum + " " + secondNum);

        double tmpNum = 0.0;
        tmpNum = secondNum;
        secondNum = firstNum;
        firstNum = tmpNum;

        System.out.println(firstNum + " " + secondNum);
        System.out.println();

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
        System.out.println();

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");

        int startNum = 345;
        int sum = 0;
        int composition = 1;
        int reminderByTenDivision = (startNum % 10);
        int dividedByTenReminderByTenDivision = ((startNum/10) % 10);
        int dividedByHundredReminderByTenDivision = ((startNum/100) % 10);

        sum = reminderByTenDivision + dividedByTenReminderByTenDivision + dividedByHundredReminderByTenDivision;
        composition = reminderByTenDivision * dividedByTenReminderByTenDivision * dividedByHundredReminderByTenDivision;

        System.out.println(startNum);
        System.out.println("Сумма цифр " + sum);
        System.out.println("Произведение цифр " + composition);
        System.out.println();

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

        int someNumber = 123;
        int hundreds = someNumber / 100 * 100;
        int decades = someNumber % 100 / 10 * 10;
        int units = someNumber % 10;

        System.out.println("Число " + someNumber + " состоит из " + hundreds + " + " + decades + " + " + units);
        System.out.println();

        //Преобразование секунд
        System.out.println("Преобразование секунд");

        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = (seconds % 3600) % 60;

        System.out.println("В " + seconds + " секундах " + hours + " часов " + minutes + " минут и " + remainingSeconds + " секунд");
    }
}
