//Организуйте бесконечный цикл вычисляющий факториал числа
//введенного с клавиатуры. Выход из цикла с помощью break

public class Page48Ex3 {

	public static void main(String[] args) {

		int n = 20; // введеное значение факториала
					// при значении n>20 уже не хватает лонга

		long calc = 1;
		int i = 1;

		while (true) {
			i++;
			calc = calc * i;
			System.out.println(calc + " факториал " + i);
			if (i == n) {
				break;
			}

		}

	}

}
//if (number==0) {
//	fact =1;
//	break;

