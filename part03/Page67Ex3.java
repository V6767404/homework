package homework.part03;

//Cоздать двумерный массив из 7 строк по 4 столбца в каждой из
//случайных целых чисел из отрезка [-5;5]. Вывести массив на экран.
//Определить и вывести на экран индекс строки с наибольшим по модулю
//произведением элементов. Если таких строк несколько, то вывести индекс
//первой встретившейся из них.

public class Page67Ex3 {
	public static void main(String[] args) {

		// создаем двумерный массив из случайных чисел из отрезка [-5;5]
		// (max - min + 1) + min c переносом строки

		int[][] mas = new int[7][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 11) - 5; // [-5;5] (max - min + 1) + min
			}

		}
		// вывод массива

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		// вывести на экран индекс строки с наибольшим по модулю произведением элементов

		int temp = -4000;
		int k = 0;

		for (int i = 0; i < mas.length; i++) {

			int proiz = 1;
			for (int j = 0; j < mas[i].length; j++) {
				proiz = Math.abs(mas[i][j] * proiz);
			}
			System.out.println("произведение = " + i + "-ой " + proiz);

			if (proiz > temp) {
				temp = proiz;
				k = i;
			}
		}

		System.out.println("индекс искомой строки = " + k);
	}
}
