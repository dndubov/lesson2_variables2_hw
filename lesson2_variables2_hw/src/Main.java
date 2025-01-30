public class Main {
    public static void main(String[] args) {
        // Задача 1
        int myInt = 42;
        byte myByte = 127;
        short myShort = 32000;
        long myLong = 123456789L;
        float myFloat = 3.14f;
        double myDouble = 2.71828;

        System.out.println("Задача 1:");
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        // Задача 2
        float value1 = 27.12f;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = 569;
        int value5 = -159;
        short value6 = 27897;
        byte value7 = 67;

        System.out.println("\nЗадача 2:");
        System.out.println("Значение переменной value1 с типом float равно " + value1);
        System.out.println("Значение переменной value2 с типом long равно " + value2);
        System.out.println("Значение переменной value3 с типом float равно " + value3);
        System.out.println("Значение переменной value4 с типом short равно " + value4);
        System.out.println("Значение переменной value5 с типом int равно " + value5);
        System.out.println("Значение переменной value6 с типом short равно " + value6);
        System.out.println("Значение переменной value7 с типом byte равно " + value7);

        // Задача 3
        byte ludmilaPupils = 23;
        byte annaPupils = 27;
        byte ekaterinaPupils = 30;
        int totalSheets = 480;

        int totalPupils = ludmilaPupils + annaPupils + ekaterinaPupils;
        int sheetsPerPupil = totalSheets / totalPupils;

        System.out.println("\nЗадача 3:");
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги");

        // Задача 4
        byte bottlesPer2Minutes = 16;
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        byte daysInMonth = 30;

        int bottlesPerMinute = bottlesPer2Minutes / 2;

        System.out.println("\nЗадача 4:");
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");

        int bottlesInDay = bottlesPerMinute * minutesInHour * hoursInDay;
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");

        int bottlesIn3Days = bottlesInDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");

        int bottlesInMonth = bottlesInDay * daysInMonth;
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");


        // Задача 5
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);

        int totalWhiteCans = whiteCansPerClass * totalClasses;
        int totalBrownCans = brownCansPerClass * totalClasses;

        System.out.println("\nЗадача 5:");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        // Задача 6
        byte bananasCount = 5;
        short bananaWeightGrams = 80;
        short milkVolumeMl = 200;
        short milkWeightPer100Ml = 105;
        byte iceCreamCount = 2;
        short iceCreamWeightGrams = 100;
        byte eggsCount = 4;
        short eggWeightGrams = 70;

        int bananasTotalWeight = bananasCount * bananaWeightGrams;
        int milkTotalWeight = (milkVolumeMl * milkWeightPer100Ml) / 100;
        int iceCreamTotalWeight = iceCreamCount * iceCreamWeightGrams;
        int eggsTotalWeight = eggsCount * eggWeightGrams;

        int totalWeightGrams = bananasTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggsTotalWeight;

        float totalWeightKilograms = totalWeightGrams / 1000.0f;

        System.out.println("\nЗадача 6:");
        System.out.println("Вес спортзавтрака: " + totalWeightGrams + " грамм (" + totalWeightKilograms + " кг)");

        // Задача 7
        float totalWeightToLoseKg = 7.0f;
        float minWeightLossPerDayKg = 0.250f;
        float maxWeightLossPerDayKg = 0.500f;


        float totalWeightToLoseGrams = totalWeightToLoseKg * 1000;

        int daysMinLoss = (int) Math.ceil(totalWeightToLoseGrams / (minWeightLossPerDayKg * 1000));
        int daysMaxLoss = (int) Math.ceil(totalWeightToLoseGrams / (maxWeightLossPerDayKg * 1000));

        int averageDays = (daysMinLoss + daysMaxLoss) / 2;

        System.out.println("\nЗадача 7:");
        System.out.println("Если спортсмен будет терять по 250 грамм в день, уйдет " + daysMinLoss + " дней.");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, уйдет " + daysMaxLoss + " дней.");
        System.out.println("В среднем может потребоваться " + averageDays + " дней для достижения результата.");


        // Задача 8
        int mashasSalary = 67760;   // Зарплата Маши
        int denisSalary = 83690;    // Зарплата Дениса
        int kristinasSalary = 76230; // Зарплата Кристины

        // Повышение зарплаты на 10%
        int mashasNewSalary = mashasSalary + (mashasSalary * 10 / 100);
        int denisNewSalary = denisSalary + (denisSalary * 10 / 100);
        int kristinasNewSalary = kristinasSalary + (kristinasSalary * 10 / 100);

        // Годовой доход до повышения
        int mashasAnnualIncome = mashasSalary * 12;
        int denisAnnualIncome = denisSalary * 12;
        int kristinasAnnualIncome = kristinasSalary * 12;

        // Годовой доход после повышения
        int mashasNewAnnualIncome = mashasNewSalary * 12;
        int denisNewAnnualIncome = denisNewSalary * 12;
        int kristinasNewAnnualIncome = kristinasNewSalary * 12;

        // Разница в годовом доходе
        int mashasIncomeDifference = mashasNewAnnualIncome - mashasAnnualIncome;
        int denisIncomeDifference = denisNewAnnualIncome - denisAnnualIncome;
        int kristinasIncomeDifference = kristinasNewAnnualIncome - kristinasAnnualIncome;

        System.out.println("\nЗадача 8:");
        System.out.println("Маша теперь получает " + mashasNewSalary + " рублей. Годовой доход вырос на " + mashasIncomeDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisIncomeDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinasNewSalary + " рублей. Годовой доход вырос на " + kristinasIncomeDifference + " рублей.");


    }
}
