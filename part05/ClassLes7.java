package homework.part05;

import java.util.Scanner;

public class ClassLes7 {
	
	public String[] smas;

	// public ClassLes7(int n) { // конструктор создает массив строк заданной
	// размерности
	// smas = new String[n]; }

	public String[] createMas() { // создание массива
		System.out.println("Введите размерность нужного массива строк");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		smas = new String[n]; // объявляем массив
		System.out.println("Вводите строки. Конец строки - enter. Конец ввода - end");
		Scanner scan = new Scanner(System.in);
		String input;
		int i = 0;
		do {
			input = scan.nextLine();
			smas[i++] = input;
		} while (!input.equals("end")); // если введеная строка end - то ввод прекращается
		// заполняем оставшиеся поля массива числами номеров строк
		//.contains - вместо equals 
		for (i = (i - 1); i < n; i++) {
			smas[i] = String.valueOf(i); // число int преобразовываем в строку
			//другой вариант smas[i]=Integer.toString(i+1)
		}

		return smas;

		
	}
}
