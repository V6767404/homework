//С помощью цикла for подсчитайте сумму всех четных чисел в
//диапазоне от -20 до 20

public class Page50Ex3 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = -20; i <= 20; i += 2) {

			sum = sum + i;
			// System.out.println(sum);
		}
		System.out.println(sum);

	}

}
