package Lesson1.homework;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Задание 1: " +myTask1(8,6,4,2));
        System.out.println("Задание 2: " +myTask2(8,5));
        System.out.println("Задание 3: " +myTask3(-2));
        System.out.println("Задание 4: " +myTask4("Константин"));
        System.out.println("Задание 5*: " +myTask5(1995));

    }
    public static float myTask1(int a, int b, int c, int d) {
        return (float) (a*b+(c/d));
    }
    public static boolean myTask2(int e, int f) {
        int sum = e+f;
        if (sum <=20 && sum >= 10)
            return true;
        else return false;
    }
    public static String myTask3(int j) {
        if (j>=0) return (String) ("Число " +j+ " положительное!");
        else return (String) ("Число " +j+ " отрицательное!");
    }
    public static String myTask4(String x) {
        return (String) ("Привет, " +x+ "!");
    }
//    Логику определения решил, не знал, как записать правильно! В итоге подглядел!
    public static String myTask5( int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0)
            return (String)(year+ " год - високосный!");
        else return (String) (year+ " год - невисокосный!");
            }
}
