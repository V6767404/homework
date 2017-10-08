package homework.part02;
//Создайте программу, которая будет генерировать и выводить на
//экран вещественное псевдослучайное число из промежутка [-3;3).


public class Page56Ex1 {

	public static void main(String[] args) {
		
		//(max - min + 1) + min  для [min;max]
		//(int)(Math.random()*(max - min + 1) + min)) - работает в положительном диапозоне
		//(int)(Math.random()*(max - min + 1)) + min) - работает во всех диапозонах. Какой смысл тогда в первой формуле?

		// ?? не могу понять когда работает формула (max - min + 2) - (min + 1) приведенная на лекции
		//System.out.println((int)( Math.random() * 8 + 2)); // не работает [-3;3] (3- (-3) +2) - (-3+1)
		
		System.out.println((int) (Math.random() * 6) - 3); // [-3;3) -по сути то же что и [-3;2]
		System.out.println((int) (Math.random() * 6) - 3); 
		System.out.println((int) (Math.random() * 6) - 3);
		System.out.println((int) (Math.random() * 6) - 3);
		System.out.println((int) (Math.random() * 6) - 3);
	

	

	}

}
