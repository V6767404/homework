//Двумерные массивы
//каждый элемент двумерного массива это одномерный массив
//Нерегулярный массив

public class Les4Ex1 {
	public static void main(String[] args) {

		int[][] mas = new int[3][6]; // 3 -колво строк 6-кол-во столбцов

		// заполняем массив случайными числами

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 43) - 15;
			}

		}

		// вывод массива

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}
		// найти и вывести максимальный в массиве

		int max = mas[0][0]; // вводим переменную сравнения и присваисаем ей первое значение массива
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
		}
		System.out.println("макс. значение " + max);
		
		//сортировка массива - рассмотрим для начало одномерный
		
	/*int [] mas = new int[5];
		
		for(int i = 0; i < mas.length; i++){
			mas[i] = (int)(Math.random() * 31) - 15;
		}
		
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + "\t");
		}
		
		//здесь сравниваются сначала первых два и меняются местами если условие
		//потом первый и третий, первый и четвертый и до конца. 
		//Потом перебор начинается уже со второго элемента
		 
		for(int i = 0; i < mas.length; i++){
			for(int j = i + 1; j < mas.length; j++){
				if(mas[i] < mas[j]){
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + "\t");
		}*/
		
		// для сортировки двумерного массива используется тоже самое только 
		//только перебираются ещё все строки 
		
	
	/*	for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int k = j + 1; k < mas[i].length; k++) {
					if (mas[i][j] > mas[i][k]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i][k];
						mas[i][k] = temp;
					}
				}
			}
		}
		System.out.println();
		for(int i = 0; i < mas.length; i++){
			for(int j = 0; j < mas[i].length; j++){
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		
	}
		
		//заполнить массив можно и таким образом
		
		int [][] mas2 = {{435,345,435,3},{53,45,435,345},{43543,543,543,5},{543,543,543,5}};
		for(int i = 0; i < mas2.length; i++){
			for(int j = 0; j < mas2[i].length; j++){
				System.out.print(mas2[i][j] + "\t");
			}
			System.out.println();
		}*/

	// нерегулярный массив
		
/*		int [][] mas = new int[6][];
		
		
		for(int i = 0; i < mas.length; i++){
			mas[i] = new int[(int)(Math.random() * 10 + 1)];
		}
		
		for(int i = 0; i < mas.length; i++){
			for(int j = 0; j < mas[i].length; j++){
				mas[i][j] = (int)(Math.random() * 43) - 15;
			}
		}
		
		for(int i = 0; i < mas.length; i++){
			for(int j = 0; j < mas[i].length; j++){
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}*/
	
	}
	}
