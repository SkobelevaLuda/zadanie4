public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println( " Задача 1 ");
        // Объявите переменные типа int, byte, short, long, float, double
        int dog = 258741;
        System.out.println( "Значение переменной dog с типом int равно " + dog );
        byte cat = 8;
        System.out.println( "Значение переменной cat с типом byte равно " + cat );
        short frog = 130;
        System.out.println( "Значение переменной frog с типом short равно " + frog );
        long goat = 128987;
        System.out.println( "Значение переменной goat с типом long равно " + goat );
        float tea = 1258987.78f;
        System.out.println( "Значение переменной tea с типом float равно " + tea );
        double tree = 157.1589;
        System.out.println( "Значение переменной tree с типом double равно " + tree );


        System.out.println( "Задача 2. " );
        //  Инициализируйте переменные
        //
        //27.12 ,  987 678 965 549 , 2.786 , false, 569 , -159 , 27897 , 67.
        byte a = 67;
        System.out.println( a );
        short b = -159;
        System.out.println( b );
        int c = 27897;
        System.out.println( c );
        long d = 987678965549l;
        System.out.println( d );
        float e = 27.12f;
        System.out.println( e );
        double k = 2.786 ;
        System.out.println( k );
        char table = 569;
        System.out.println( table );
        boolean red = false;
        System.out.println( red );
        // Задача 3
        System.out.println( "Задача 3" );
        // Расчитать, сколько достанется листов каждому ученику
        short lp = 23;
        short as = 27;
        short ea = 30;
        short sheetPaper = 480;
        System.out.println( " На каждого ученика рассчитано " + ( sheetPaper/ ( lp + as + ea )) + " листов бумаги" );

        // Задача 4.
        System.out.println( "Задача 4" );
        // Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
        //за 20 минут
        //в сутки
        //за 3 дня
        //за 1 месяц

        int performance = 16;
        int performance1 = performance/2;
        System.out.println( " За 20 минут машина произвела бутылок " + (performance1*20) + " штук ");
        int day = 24*60;
        System.out.println( " За сутки машина произвела бутылок " + (performance1*day) + " штук ");
        int day3 = day*3;
        System.out.println( " За 3 суток машина произвела бутылок " + (performance1*day3) + " штук ");
        int month = day*30;
        System.out.println( " За месяц машина произвела бутылок " + (performance1*month) + " штук ");

        // Задача 5
        System.out.println( "Задача 5" );
        // На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?

        int canPaint = 2+4;
        int cabinet = 120/canPaint;
        int white = cabinet*2;
        int brown = cabinet*4;
        System.out.println( " В школе, где " + cabinet + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски ");

        // Задача 6
        System.out.println( " Задача 6" );

        // Бананы – 5 штук (1 банан - 80 грамм)
        //Молоко – 200 мл (100 мл = 105 грамм)
        //Мороженое пломбир – 2 брикета по 100 грамм
        //Яйца сырые – 4 яйца (1 яйцо - 70 грамм)
        //Смешать всё в блендере и готово
        //
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы
        int banana = 5*80;
        int milk = 200/100*105;
        int iceCream = 2*100;
        int egg = 4*70;
        int breakfast = banana+milk+iceCream+egg;
        double breakfast1 = breakfast/1000.00;
        System.out.println( " Вес завтрака спортсмена " + breakfast + " грамм, или " + breakfast1 + " киллограмм " );



        // Задача 7
        System.out.println( " Задача 7 " );
        //  спортсмену нужно сбросить 7 кг
        //
        //Тренер скорректировал, чтобы спортсмен мог терять от 250 до 500 грамм в день.
        //
        //Посчитайте, сколько дней уйдёт, если будет терять каждый день по 250 грамм и будет худеть на 500 грамм

        int excessWeight = 7*1000;
        int weightLoss1 = excessWeight/250;
        int weightLoss2 = excessWeight/500;
        double weightLoss3= excessWeight/((250.00+500.00)/2.00);
        System.out.println( " Если спортсмен будет терять 250 грамм, уйдет " + weightLoss1 + " дней, если будет терять 500 грамм, уйдет " + weightLoss2 + " дней, всреднем уйдет " + weightLoss3 + " дней " );

        // Задача 8
        System.out.println( " Задача 8" );

        // Задача автоматизировать повышение зарплаты, а также провести расчет:
        //
        //Маша получает 67 760 рублей в месяц
        //
        //Денис получает 83 690 рублей в месяц
        //
        //Кристина получает 76 230 рублей в месяц
        //
        //Каждому нужно увеличить зарплату на 10%.
        // Посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int masha1 = masha+(masha*10/100);
        int denis1 = denis+(denis*10/100);
        int kristina1 = kristina+(kristina*10/100);
        int mashaRaznica = (masha1-masha)*12;
        int denisRaznica = (denis1-denis)*12;
        int kristinaRaznica = (kristina1-kristina)*12;
        System.out.println( " Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + mashaRaznica + " рублей ");
        System.out.println( " Денис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + denisRaznica + " рублей ");
        System.out.println( " Кристина теперь получает " + kristina1 + " рублей. Годовой доход вырос на " + kristinaRaznica + " рублей ");
    }
}