package homework.part02;
//Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
//и выведете это количество на экран на отдельной строке.

public class Page61Ex3 {

	public static void main(String[] args) {

		int[] mas = new int[15]; // выделена память, в память заносяться 0

		// заполним массив рандомом
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10); // [0;9] 
		}

		// вывод всех значений массива
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// подсчет четных чисел (0 - тоже четное)
		int ammount = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				ammount++;
			}
		}
		System.out.print("четных = " + ammount);
	}
}
