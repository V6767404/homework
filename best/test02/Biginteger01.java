package by.test02;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

import java.math.BigInteger;
import java.util.ArrayList;

public class Biginteger01 {

    public static void main(String[] args) {

        Biginteger01 fibo = new Biginteger01();
        int n = 1000;
        System.out.println("Фибоначи ряда "  +n+ " ="+ fibo.fastB(n));

    }

    BigInteger fastB(int n) {


        ArrayList<BigInteger> fib = new ArrayList<>();
        fib.add(BigInteger.ZERO); //здесь add добавление элемента в коллекцию
        fib.add(BigInteger.ONE);
        for (int i = 2; i <= n; i++) {
            BigInteger s1 = fib.get(i - 1);
           // System.out.println("s1 =" + s1);
            BigInteger s2 = fib.get(i - 2);
          // System.out.println("s2 =" + s2);
            BigInteger sum = s1.add(s2); //add здесь сложение biginteger
           // System.out.println("sum =" + sum);
            fib.add(sum);
        }

        return fib.get(n);
    }
}
