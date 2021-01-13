public class Lesson1 {

    public static void main(String[] args) {
        byte A = 10;  // задание 2
        int B = 1024;
        long C = 12345L;
        float D = 12.34f;
        double E = 123.456;
        char val1 = 128;
        boolean G = true;
        float a = 2.5f;
        float b = 3.3f;
        float c = 4.4f;
        float d = 5.5f;
        int e = 10;
        int f = 5;
        int sum = 0;
        String name = "Александр";
        int year = 2020;


        System.out.println(calcForm(a, b, c, d));// задание 3
        System.out.println(checkRelate(e, f));// задание 4
        checkSign(B);// задание 5
        checkSignAgain(e);// задание 6
        helloString(name);// задание 7
        checkYear(year);// задание 8
    }


    private static float calcForm(float a, float b, float c, float d) { // задание 3
        float sum = 0;
        if (d == 0) {
            System.out.println("Переменная 'd' равняется нулю!");
        } else {
            sum = a * (b + (c / d));
        }
        return sum;
    }

    private static boolean checkRelate(int a, int b) {  // задание 4
        int sum = a + b;
        return (sum >= 10 & sum <= 20);
    }

    private static void checkSign(int a) {  // задание 5
        if (a >= 0) {
            System.out.println("Число " + a + " - положительное.");
        } else {
            System.out.println("Число " + a + " - отрицательное.");
        }
    }

    private static boolean checkSignAgain(int a) {  // задание 6

        return (a < 0);
    }

    private static void helloString(String name) {  // задание 7

        System.out.println("Привет, " + name + "!");
    }

    private static void checkYear(int year) {  // задание 8
        if (year % 4 != 0 || (year % 100 == 0 & year % 400 != 0)) {
            System.out.println("Обычный");
        } else {
            System.out.println("Високосный");
        }
    }
}
