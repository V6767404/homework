package homework.part02;
//В переменные a и b записаны целые числа, при этом b больше a.
//Создайте программу, которая будет генерировать и выводить на экран целое
//псевдослучайное число из отрезка [a;b].

public class Page56Ex3 {
	public static void main(String[] args) {
		int a = 4;
		int b = 10;
		System.out.println((int) (Math.random() * (b - a + 1)) + a); // [a;b] (max - min + 1) + min
		System.out.println((int) (Math.random() * (b - a + 1)) + a);
		System.out.println((int) (Math.random() * (b - a + 1)) + a);
		System.out.println((int) (Math.random() * (b - a + 1)) + a);
		System.out.println((int) (Math.random() * (b - a + 1)) + a);

	}

}
