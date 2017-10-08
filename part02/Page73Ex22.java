package homework.part02;
//Создайте массив из 8 случайных целых чисел из отрезка [1;10].
//Выведите массив на экран в строку. Замените каждый элемент с нечётным
//индексом на ноль. Снова выведете массив на экран на отдельной строке

public class Page73Ex22 {

	public static void main(String[] args) {

		// System.out.println((int) (Math.random() * 10)+1); //[1;10]

		int[] mas = new int[8];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 10) + 1); // [1;10]
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// замена элементов с нечетным индексом на 0 и вывод
		int ammount = 0;
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				mas[i] = 0;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}
