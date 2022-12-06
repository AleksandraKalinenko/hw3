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
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("Задача3");
        for (int i = 0; i < 17; i += 2){
            System.out.println(i);
        }
    }

    public static void task4 () {
        System.out.println("Задача4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5 () {
        System.out.println("Задача5");
        for (int i = 1904; i <= 2096; i += 4) {
                if (i % 400 == 0 || i % 100 != 0) {
                    System.out.println(i + "год является високосным");
                }
        }
    }

    public static void task6 () {
        System.out.println("Задача6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }
    }

    public static void task7 () {
        System.out.println("Задача7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("Задача8");
        int vklad = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += vklad;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9 () {
        System.out.println("Задача9");
        int vklad = 29000;
        int total = 0;
        for (int i = 1; i <=12; i++) {
            total += total/100;
            total += vklad;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10 () {
        System.out.println("Задача10");
        int a = 0;
        int b = 1;
        int sum;
        System.out.println(b);
        for (int i = 1; i < 11; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }
}
