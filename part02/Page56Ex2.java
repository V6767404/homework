package homework.part02;

//Натуральное положительное число записано в переменную n.
//Создайте программу, которая будет генерировать и выводить на экран целое
//псевдослучайное число из отрезка [-n;n]


public class Page56Ex2 {
	public static void main(String[] args) {
		int n = 9;

		System.out.println((int) (Math.random() * (2 * n + 1)) - n); // [-n;n] (max - min + 1) + min
		System.out.println((int) (Math.random() * (2 * n + 1)) - n);
		System.out.println((int) (Math.random() * (2 * n + 1)) - n);
		System.out.println((int) (Math.random() * (2 * n + 1)) - n);
		System.out.println((int) (Math.random() * (2 * n + 1)) - n);
	}

}
