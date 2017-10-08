package homework.part02;
//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5]

//каждый, выведите массивы на экран в двух отдельных строках. Посчитайте
//среднее арифметическое элементов каждого массива и сообщите, для какого
//из массивов это значение оказалось больше (либо сообщите, что их средние
//арифметические равны).

public class Page73Ex23 {
	public static void main(String[] args) {

		int[] mas1 = new int[5];
		int[] mas2 = new int[5]; //?? возможно ли и как одновременно двум переменным присвоить одинковое значение

		// создаем и выводим два массива

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (int) (Math.random() * 6); // [0;5]
		}
		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = (int) (Math.random() * 6); // [0;5]
		}
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");
		}
		System.out.println();

		// считаем среднее арифметическиое для двух массивов
		
		int sumMas1 = 0;
		int sumMas2 = 0;
		for (int i = 0; i < mas1.length; i++) {
			sumMas1 = sumMas1 + mas1[i];
		}
		for (int i = 0; i < mas2.length; i++) {
			sumMas2 = sumMas2 + mas2[i];
		}
		System.out.println("сумма первого " + sumMas1);
		System.out.println("сумма второго " + sumMas2);

		int aveSumMas1 = sumMas1 / mas1.length;
		int aveSumMas2 = sumMas2 / mas2.length;
		
		// сравниваем и выводим результат
		
		if (aveSumMas1 == aveSumMas2) {
			System.out.print("среднее ариф первого и второго = " + aveSumMas1);
		}
		if (aveSumMas1 > aveSumMas2) {
			System.out.print("среднее ариф первого больше и = " + aveSumMas1);
		}
		
		System.out.print("среднее ариф второго больше и = " + aveSumMas2);

	}

}
