//массив - упорядоченный набор элементов одного типа данных

public class Les3Ex4 {
	public static void main(String[] args) {
		// System.out.println();

		// int a=4;
		// int b=7;
		// int c=2;
		// int d=9;

		int[] mas = new int[5]; // [0,0,0,0,0]

		System.out.println(mas); // в переменной mas храниться тупо ссылка на выденную память, но не значения

		// 0,1,2,3,4 индекс! указывает на сколько нужно отступить от самого крайнего
		// чтобы обратиться к нужному

		System.out.println(mas[4]); // если 5-ка будет ошибка как правило такая ошибка как правило в цикле

		// mas[2] = 56;

		// вывод всех значений массива - всегда for (никакого while)
		for (int i = 0; i < mas.length; i++) { // mas.length - свойство - длинна масива
			System.out.print(mas[i] + "\t");
		}

		// заполним массыв рандомом
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 11 + 5); // [5;15]
		}

		// найдем макс элемент массива

		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= max) {
				max = mas[i];
			}
		}
		System.out.println();
		System.out.println(max);
		
		//

		int[] mas2 = { 43543, 543, 5, 345, 43, 543, 5, 435, 43, 543, 543, 5, 43, 534 };
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "\t");
		}
	}
}
