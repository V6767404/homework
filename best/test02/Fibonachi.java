package by.test02;

public class Fibonachi {

    public static void main(String[] args) {
        int[] mas = new int[47]; // более 47 уже не помещаеся в Int

        mas[0] = 0;
        mas[1] = 1;
        mas[2] = 1;

        for (int i = 3; i < mas.length; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }
}
