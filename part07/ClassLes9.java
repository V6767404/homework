package homework.part07;

// Создаёте класс в котором создаёте поле, которое является массивом типа int.
// Создаёте метод в этом классе, который создаёт и заполняем массив. Массив создаёт 
// из количества элементов от 5 до 15.
// Заполняем массив элементами из диапазона от -5 до +5.
// Создаём метод, котоырй принимает оба этих массива и начинает их делить.
// Делим следующим образом: первый элемент первого массива делим на первый элемент второго массива и ТД.
// 
// В итоге получаем косяки, которые нужно обработать. 
// 
// В случае косяка деление на ноль мы уведомляем о  том, что была ошибка и продолжаем дальше 
// делить оставшиеся элементы.
// В случаен ошибким выхода за пределы массива, уведомляфем о данной ошибке и УСЁ.
// 
// Элементы, которые не поделились из-за выхода за пределы массива, делим на 2.
//

public class ClassLes9 {

	public int mas[];

	// можно былобы массив создать в конструкторе
	// public ClassLes9() {
	// int n =(int) (Math.random() * 11) + 5;
	// mas = new int[n]; }

	public int[] createMas() { // создание массива

		int n = (int) (int) (Math.random() * 11) + 5; // колич-во элементов случайно от 5 до 15
		mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 11) - 5; // random [-5;5]
		}
		return mas;
	}

	public static void showMas(int[] mas) { // вывести массив
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
	}

	public static void divMas(int[] mas1, int[] mas2) { // метод деления двух массивов
		
		int n = (mas1.length >= mas2.length) ? mas1.length : mas2.length; // если n присвоить длинну более длинного
																			// массива будет переполнение
		int[] res = new int[n];
		int temp = 0;
		
		try {

			for (int i = 0; i < n; i++) {
				temp = i;
				res[i] = mas1[i] / mas2[i];
				
			}

			// возможны две ошибки
			// java.lang.ArithmeticException: / by zero
			// java.lang.ArrayIndexOutOfBoundsException: 11 //если длинна расчетов привысит
			// длинну массива

		} catch (ArithmeticException e) {
			System.out.println("деление на ноль");
			System.out.println("продолжение");
			System.out.println(temp);
		/*	for (int i = temp; i < n; i++) {
			res[i] = mas1[i] / mas2[i];};*/

		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace(); //выводит содержимое объекта е
			System.out.println("переполнение массива");
			System.out.println("продолжение2");
		/*	for (int i = temp; i < n; i++) {
				res[i] = mas1[i] / 2;};*/
			
		}
		showMas(res);
	}

}
