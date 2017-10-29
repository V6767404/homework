package by.test01;

public class MasMaxznach {

    public static void main(String[] args) {

        // создаем двумерный массив из случайных чисел из отрезка [-99;99]
        // (max - min + 1) + min c переносом строки

        int[][] mas = new int[5][8];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 199) - 99; // [10;99] (max - min + 1) + min
            }

        }
        // вывод массива

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }

            System.out.println();
        }

        // найти максимальное значение элемента массива и вывести на экран

        int temp = mas[0][0];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > temp) {
                    temp = mas[i][j];
                }
            }
        }

        System.out.println("значение макс элемента = " + temp);
    }

}
