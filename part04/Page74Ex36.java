package homework.part04;

/*Задана квадратная матрица. Поменять местами строку с
максимальным элементом на главной диагонали со строкой с заданным
номером.*/

public class Page74Ex36 {
	public static void main(String[] args) {

		// задаем произвольную квадратную матрицу

		int n = 5;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10) + 1; // [1;10]
			}

		}
		// вывод матрицы

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

		int indStrZadan = 2; // задание номера строки по услувию

		// нахождение индекса строки с максимальным элементом по диагонали

		int indStrIskom = 0;
		int temp = mas[0][0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i][i] > temp) {
				temp = mas[i][i];
				indStrIskom = i;
			}

		}
		System.out.println(
				"индекс строки с макс элем. на диагонали =" + indStrIskom + " номер строки =" + (indStrIskom + 1));

		// по заданию меняем местами строки заданную и найденную

		int[] tempStr = mas[indStrZadan];
		mas[indStrZadan] = mas[indStrIskom];
		mas[indStrIskom] = tempStr;
		// и выводим уже обновленный массив

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

	}
}

