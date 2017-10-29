package by.test02;

public class Recursion02 {
    // https://habrahabr.ru/post/275813/


    public static int recursion(int n) {
        // условие выхода
        // Базовый случай
        // когда остановиться повторять рекурсию ?
        if (n == 1) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println("Факториал = "+recursion(5)); // вызов рекурсивной функции
    }
}

