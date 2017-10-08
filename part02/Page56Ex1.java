package homework.part02;
//Создайте программу, которая будет генерировать и выводить на
//экран вещественное псевдослучайное число из промежутка [-3;3). 

public class Page56Ex1 {

	public static void main(String[] args) {

		
		// (int)(Math.random()*(max - min + 1) + min)) - работает в положительном диапозоне [min;max]
		// (int)(Math.random()*(max - min + 1)) + min) - работает во всех диапозонах !!
		// Какой смысл тогда в первой формуле? - Никакого!
		// формула для отриц диапозона (max - min + 2) - (min - 1) тоже избыточна

		System.out.println((int) (Math.random() * 6) - 3); // [-3;3) -по сути то же что и [-3;2]
		System.out.println((int) (Math.random() * 6) - 3);
		System.out.println((int) (Math.random() * 6) - 3);
		System.out.println((int) (Math.random() * 6) - 3);
		System.out.println((int) (Math.random() * 6) - 3);

	}

}
