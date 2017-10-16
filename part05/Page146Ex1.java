package homework.part05;

//p146task1

/*Написать класс, в котором как поле объявлен массив строк. Вводим
количество строк с консоли. Организовать ввод строк с консоли до тех пор,
пока в какой-то строке не встретится слово end, остальные строки
заполняются цифрами = номер строки. Отсортируйте строки по длине.
Определите, есть ли среди строк одинаковые. Выведите 3 последних
элемента самой длинной строки. Преобразуйте 2 строку к верхнему регистру
Разделите самую длинную строку на слова. Определить является ли второй
символ самой короткой строки цифрой.*/

public class Page146Ex1 {
	
	public static void showMas(String[] mas) { // статический метод для вывода массивов
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		ClassLes7 cl = new ClassLes7();

		//создаем массив
		
		String[] mas = cl.createMas();
		
		//String mas[] = { "kfdklf", "asdkjjkffdsfadsf", "aaaaa", "bla", "bla" }; // для отладки

		// выводим массив
		//for (int i = 0; i < mas.length; i++) {
		//	System.out.print(mas[i] + "\t");
		//}
		
		System.out.println("\n----Введенный массив:");
		Page146Ex1.showMas(mas);  // ?? правильно ли так и почему нужно указывать имя класса ? мы же ведь в немже находимся
		
		
		
		// сортировка строк массива по длинне

		String tempstr;

		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i].length() > mas[j].length()) {
					tempstr = mas[i];
					mas[i] = mas[j];
					mas[j] = tempstr;
				}
			}
		}
		System.out.println("----Строки массива отсортированы:");
		
		Page146Ex1.showMas(mas); 
		

		// вывести 3 последних элемента самой длинной строки

		tempstr = mas[mas.length - 1];
		int maxStrLength = tempstr.length();
		System.out.println("----3 последних элемента самой длинной строки");
		System.out.println(tempstr.substring(maxStrLength - 3, maxStrLength));

		// преобразовать 2 строку к верхнему регистру

		char[] charmas = mas[2].toCharArray();
		for (int i = 0; i < charmas.length; i++) {
			charmas[i] = Character.toUpperCase(charmas[i]);
		}
		// for (int i = 0; i < charmas.length; i++) {
		// System.out.print(charmas[i] + "\t");

		mas[2] = "";
		for (int i = 0; i < charmas.length; i++) { // ?? слияние в строку - полагаю код не лучший
			mas[2] = mas[2] + charmas[i];
		}
		System.out.println("----2-ая строка к верхнем регистре");
		System.out.println(mas[2]);
		// разделить самую длинную строку на слова
		// ?? это не понятно

		// Определить является ли второй символ самой короткой строки цифрой
		
		charmas = mas[2].toCharArray();
		System.out.println("----является ли второй символ самой короткой строки цифрой?");
		System.out.println(Character.isDigit(charmas[1]));
	
	
	
	}

	
}
