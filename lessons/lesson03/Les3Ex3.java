//Math и random

public class Les3Ex3 {

	public static void main(String[] args) {

		/*
		 * System.out.println(Math.pow(5,5)); // возведение в степень. результат double
		 * System.out.println(Math.round(3.55)); //округление =4
		 * System.out.println(Math.sqrt(121)); //квадратный корень. результат double
		 * System.out.println(Math.abs(-56)); //абсолютное значение
		 */

		// System.out.println(Math.random()); //[0;1)
		System.out.println(Math.random() * 9 + 1); // [1;9] (max - min + 1) + min

/*		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));*/

		System.out.println((int)( Math.random() * 22 - 11)); // [-10;10] (max -min +2)-(min -1)
		System.out.println((int)( Math.random() * 22 - 11)); // для вывода с отрицательным диапозоном
		System.out.println((int)( Math.random() * 22 - 11)); 
		System.out.println((int)( Math.random() * 22 - 11)); 
		 
		System.out.println("");
	
		System.out.println((int)( Math.random() * 21) - 10); //или так по старой формуле но со скобкой
		System.out.println((int)( Math.random() * 21) - 10);
		System.out.println((int)( Math.random() * 21) - 10);
		System.out.println((int)( Math.random() * 21) - 10);
		
		System.out.println("");	
	
		System.out.println((int)( Math.random() * 21 - 10)); // здесь "-10" никогда не выпадет
		
		/*System.out.println((int)(Math.random() * 21) - 10);    // [-10; 10] 
		System.out.println((int)(Math.random() * 21) - 10);
		System.out.println((int)(Math.random() * 21) - 10);
		System.out.println((int)(Math.random() * 21) - 10);
		System.out.println((int)(Math.random() * 21) - 10);*/
	}
}
