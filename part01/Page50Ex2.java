//Вывести все числа кратные 5 от 0 до введенного числа и посчитать их
//количество.


public class Page50Ex2 {
	public static void main(String[] args) {

		int n = 57;
		int amount = 0;

		for (int i = 0; i <= n; i += 5) {
			System.out.println("i=" + i);
			amount = amount + 1;

		}
		System.out.println("количество=" + amount);

	}

}
