//Выведите все простые числа до 100
//число x является простым, если оно больше 1 и при этом делится без остатка только на  1 и на x 

public class Page50Ex5 {

	public static void main(String[] args) {

		int i, j;
		boolean check;

		for (i = 2; i < 100; i++) {
			check = true;

			for (j = 2; j < i; j++) {
				if ((i % j) == 0) {
					check = false;
					// System.out.print(j);
					// System.out.println(check);
					break;
				}

			}

			if (check) {
				System.out.println(i + " простое");

			}

		}
	}
}
