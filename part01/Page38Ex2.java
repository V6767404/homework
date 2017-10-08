//В переменной n хранится трёхзначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр n 



public class Page38Ex2 {
	public static void main(String[] args) {
		int n = 564;
		int n1 = n / 100;
		int n2 = n - n1 * 100;
		int n3 = n2 / 10;
		int n4 = n2 % 10;

		System.out.println(n1+n3+n4);

	}

}
