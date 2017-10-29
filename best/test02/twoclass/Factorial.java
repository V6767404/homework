package by.test02.twoclass;

public class Factorial {
    // это рекурсивный метод
    public int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}

