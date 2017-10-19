package homework.part07;

// Создаёте класс в котором создаёте поле, которое является массивом типа int.
// Создаёте метод в этом классе, который создаёт и заполняем массив. Массив создаёт 
// из количества элементов от 5 до 15.
// Заполняем массив элементами из диапазона от -5 до +5.
// Создаём метод, который принимает оба этих массива и начинает их делить.
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

public class Class2 {

	public int mas[];

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

	public static void divMas(int[] mas1, int[] mas2) { // метод деления двух массивов,

		// mas1.int n = (mas1.length >= mas2.length) ? mas1.length : mas2.length;
		int[] tempmas;
		int n;
		if (mas1.length >= mas2.length) {
			n = mas1.length;
			tempmas = mas1;
		} else {
			n = mas2.length;
			tempmas = mas2;
		}

		int[] res = new int[n];
		int temp = 0;
		boolean check = false;

		for (int i = 0; i < n; i++) {
			temp = i;
			try {
				res[i] = mas1[i] / mas2[i];
			} catch (ArithmeticException e) {
				System.out.println("деление на ноль по индексу = " + temp);

			} catch (ArrayIndexOutOfBoundsException e) {
				check = true;
				System.out.println("переполнение массива по индексу = "+ temp); 
				break; //УСЕ
				

			}

		}
		if (check) { //продолжение для ошибки переполнение массива
			for (int j = temp; j < n; j++) {
			 res[j] = tempmas[j]/2; }
		}
		showMas(res);
	}
}
