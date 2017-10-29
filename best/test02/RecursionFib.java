package by.test02;

//Ctrl Alt L - выравнивание кода
//Фибоначи рекурсией
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
//так и не понял как это работает по шагам дебугером вообще странно

public class RecursionFib {

    public static void main(String[] args) {

        RecursionFib fibo = new RecursionFib();
        int n = 43;

        System.out.println(n + "-ое число Фибоначчи (используя массив) =" + fibo.calc2(n));
        System.out.println(n + "-ое число Фибоначчи (используя рекурсию) =" + fibo.calc(n));

    }


    private long calc(int n) {
        //здесь простейший вариант, в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        //т=40 считает довольно быстро а вот n=50 около минуты
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calc(n - 1) + calc(n - 2);

    }

    //более быстрый алгоритм мспользуя массив
    public long calc2(int n) {
        long[] mas = new long[n + 1];
        mas[0] = 0;
        mas[1] = 1;
        mas[2] = 1;

        for (int i = 3; i < mas.length; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }

        return mas[n];
    }

}
