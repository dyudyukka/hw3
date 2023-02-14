public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        byte pByte = 127;
        short pShort = 32767;
        int pInt = 2147483647;
        long pLong = 9223372036854775807L;
        float pFloat = 3.4E+38f;
        double pDouble = 1.7E+308;
        char pChar = 65535;
        boolean pBoolean = true;
        System.out.println ("Значение переменной pByte с типом byte равно  "+ pByte);
        System.out.println ("Значение переменной pShort с типом short равно  "+ pShort);
        System.out.println ("Значение переменной pInt с типом int равно  "+ pInt);
        System.out.println ("Значение переменной pLong с типом long равно  "+ pLong);
        System.out.println ("Значение переменной pFloat с типом float равно  "+ pFloat);
        System.out.println ("Значение переменной pDouble с типом double равно  "+ pDouble);
        System.out.println ("Значение переменной pChar с типом char равно  "+ pChar);
        System.out.println ("Значение переменной pBoolean с типом boolean равно  "+ pBoolean);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        float pFloat = 27.12f;
        long pLong = 987678965549L;
        float pFloat1 = 2.786f;
        short pShort = 569;
        short pShort1 = -159;
        short pShort2 = 27897;
        byte pByte = 67;
        System.out.println ("Значение переменной pFloat с типом float равно  "+ pFloat);
        System.out.println ("Значение переменной pLong с типом long равно  "+ pLong);
        System.out.println ("Значение переменной pFloat1 с типом float равно  "+ pFloat1);
        System.out.println ("Значение переменной pShort с типом short равно  "+ pShort);
        System.out.println ("Значение переменной pShort1 с типом short равно  "+ pShort1);
        System.out.println ("Значение переменной pShort2 с типом short равно  "+ pShort2);
        System.out.println ("Значение переменной pByte с типом byte равно  "+ pByte);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        System.out.println ("Три школьных учителя ведут три класса."+
                "У Людмилы Павловны — 23 ученика,"+
                "у Анны Сергеевны — 27 учеников,"+
                "у Екатерины Андреевны — 30 учеников."+
                "На три класса закупленно 480 листов бумаги."+
                "Сколько достанется листов каждому ученику?");
        short pClassA = 23;
        short pClassB = 27;
        short pClassV = 30;
        int pList = 480;
        int pSumClass =  pClassA + pClassB + pClassV;
        int pListsForChild = pList / pSumClass;
        System.out.println ("Всего учеников в трёх классах -> "+ pSumClass);
        System.out.println ("На одного ученика можно выдать "+ pListsForChild + " листа(/ов)");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        System.out.println ("Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.");
        short pButylok = 16;
        short pTimeButylka = 2;
        int pMinuts = 20;
        int pKolButylokZa = pMinuts/pTimeButylka;
        System.out.println ("За "+ pMinuts + " минут машина произвела " + pKolButylokZa + " штук бутылок.");
        pMinuts = 24*60;
        pKolButylokZa = pMinuts/pTimeButylka;
        System.out.println ("За "+ pMinuts + " минут машина произвела " + pKolButylokZa + " штук бутылок.");
        pMinuts = pMinuts*3;
        pKolButylokZa = pMinuts/pTimeButylka;
        System.out.println ("За "+ pMinuts + " минут машина произвела " + pKolButylokZa + " штук бутылок.");
        pMinuts = pMinuts*10;  //Если предположить, что 1 месяц это 30 дней
        pKolButylokZa = pMinuts/pTimeButylka;
        System.out.println ("За "+ pMinuts + " минут машина произвела " + pKolButylokZa + " штук бутылок.");

    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        System.out.println ("На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?");
        short pBanokKraskiVsego = 120;
        short pWaiteBanok = 2;
        short pBraunBanok = 4;
        int pBanokNaCabinet = pWaiteBanok + pBraunBanok;
        System.out.println ("На один кабинет требуется -> " + pBanokNaCabinet + " банок краски двух цветов");
        int pCabinet = pBanokKraskiVsego / pBanokNaCabinet;
        System.out.println ("Всего кабинетов для ремонта -> " + pCabinet);
        int pWaiteVsego = pCabinet*2;
        System.out.println ("Всего на ремонт " + pCabinet + " кабинетов было куплено " + pWaiteVsego + " банок белой краски" );
        int pBrounVsego = pCabinet*4;
        System.out.println (" и " + pBrounVsego + " банок коричневой краски" );
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        System.out.println ("Бананы — 5 штук (1 банан — 80 грамм).");
        System.out.println ("Молоко — 200 мл (100 мл = 105 грамм).");
        System.out.println ("Мороженое-пломбир — 2 брикета по 100 грамм.");
        System.out.println ("Яйца сырые – 4 яйца (1 яйцо — 70 грамм).?");
        System.out.println ("Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.");
        short pBananKol = 5;
        short pBananVes = 80;
        short pMolokoKol = 2;
        short pMolokoVes = 105;
        short pPlombirKol = 2;
        short pPlombirVes = 100;
        short pEggKol = 4;
        short pEggVes = 70;
        int pVesZavtraka = pBananVes*pBananKol + pMolokoVes*pMolokoKol + pPlombirVes*pPlombirKol + pEggVes*pEggKol;
        System.out.println("Вес завтра составляет " + pVesZavtraka+" грамм");
        float pVesZavtrakaF = pVesZavtraka/1000F;
        System.out.println("Вес завтра составляет " + pVesZavtrakaF+" килограмм");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        System.out.println ("Нужно похудеть на 7 кг");
        System.out.println ("1. Сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм?");
        System.out.println ("2. Сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм?");
        short pKg = 7;
        short pVes250 = 250;
        short pVes500 = 500;
        int pKgGr = pKg*1000;
        int pDay250 = pKgGr/pVes250;
        int pDay500 = pKgGr/pVes500;
        System.out.println(pDay250+ "дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(pDay500+ "дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        System.out.println ("Маша получает 67 760 рублей в месяц");
        System.out.println ("Денис получает 83 690 рублей в месяц");
        System.out.println ("Кристина получает 76 230 рублей в месяц");
        System.out.println ("Каждому нужно увеличить зарплату на 10% от текущей месячной.");
        int pMashaZP = 67760;
        int pDenisZP = 83690;
        int pKristinaZP = 76230;
        int pMashaZPNew = pMashaZP + pMashaZP/10;
        int pDenisZPNew = pDenisZP+pDenisZP/10;
        int pKristinaZPNew = pKristinaZP+pKristinaZP/10;
        int pMashaIzmGod = pMashaZPNew*12 - pMashaZP*12;
        int pDenisIzmGod = pDenisZPNew*12 - pDenisZP*12;
        int pKristinaIzmGod = pKristinaZPNew*12 - pKristinaZP*12;
        System.out.println("Маша теперь получает "+pMashaZPNew+" рублей. Годовой доход вырос на "+pMashaIzmGod+" рублей");
        System.out.println("Денис теперь получает "+pDenisZPNew+" рублей. Годовой доход вырос на "+pDenisIzmGod+" рублей");
        System.out.println("Кристина теперь получает "+pKristinaZPNew+" рублей. Годовой доход вырос на "+pKristinaIzmGod+" рублей");
    }

}


