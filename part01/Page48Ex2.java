//Ќапишите цикл while вывод€щий числа последовательности 1, 4, 7,
//10Е до тех пор, пока их произведение не превысит 300 или сумма 200.
//¬ыведите количество этих чисел.

public class Page48Ex2 {

	public static void main(String[] args) {

		// if ( a > 10 && a > 20) - логическое и
		// if ( a > 10 || a > 20) - логическое или
		// if (( a > 40 || a>10 ) && a > 30)

		int n = 1;
		int i = 0;
		int sum = 1;
		int cmp = 1;

		while (cmp <= 300 && sum <= 200) {
			i++;
			System.out.println(n);

			// System.out.println("сумма= " + sum);
			// System.out.println("проив= " + cmp);

			n = n + 3;
			sum = sum + n;
			cmp = cmp * n;
		}

		System.out.println("количество чисел= " + i);

		// System.out.println("сумма вых= " + sum);
		// System.out.println("произведение вых= " + cmp);
	}
}