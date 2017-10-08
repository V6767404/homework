package homework.part04;

/*
1. Нужно создать нерегулярный массив, подобный table:
int table[ ] [ ] = new int[ 4] [ ];
table[0] = new int[7];
table[1] = new int[3];
able[2] = new int[5];
table[3] = new int[1];
Количество строк вводится, а количество элементов в каждой строке
задается случайным образом в диапазоне от 1 до 10.
2. Заполнить его какими-нибудь элементами.
3. Вывести массив красиво (чтоб он выглядел как массив, а не строка
или столбец ) 
4. Необходимо переставить строки массива, чтобы их размер возрастал
(или убывал).
5. Вывести получившийся массив.
Для массива table результат будет выглядеть так:
table[0] = new int[1];
table[1] = new int[3];
table[2] = new int[5];
table[3] = new int[7];
*/

public class Page69Ex1 {
	public static void main(String[] args) {

		// 1. создать нерегулярный массив
		int n = 6;
		int[][] mas = new int[n][];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = new int[(int) (Math.random() * 10 + 1)]; // задаем кол-во элементов в строках рандомно [1;10]

		}
		// 2. Заполнить его какими-нибудь элементами.

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 41) - 20; // [-20;20]
			}
		}

		// 3. Вывести массив красиво

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

		// 4. Необходимо переставить строки массива, чтобы их размер возрастал (или
		// убывал).
		// 5. Вывести получившийся массив.

		// используем метод пузырек для сортировки строк (i) в соотвествии с их
		// значением (math[i].length)

		// System.out.println(mas[1]);

		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i].length > mas[j].length) {
					int[] temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}
			}
		}
		
		System.out.println("Строки массива отсортированы:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
