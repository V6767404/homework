package by.test02;

//рассчет факториала рекурсивным методом
// 5 ! = 1 * 2 * 3 * 4 * 5 = 120.

public class RecursionFac {

    public static void main(String[] args) {

        RecursionFac fact = new RecursionFac();
        int n = 6;

        System.out.println("Факториал числа " +n +" = "+ fact.calc(n));

    }


    //расчет факториала рекурсивным методом
    public int calc(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = calc(n - 1) * n;
        return result;
    }


}

