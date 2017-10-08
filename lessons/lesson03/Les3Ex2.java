import java.util.Scanner; // по нажатию подсказки подчеркивания или Scanner Ctrl Shift O

// Scanner 

public class Les3Ex2 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение");
		if (sc.hasNextInt()) {
			a = sc.nextInt(); 	// NextDouble при вводе double с консоли нужно вводить с запятой а не с точкой
		} 						//  NextLine- строка считывается
		System.out.println("введеное значение = " + a);
	}

}

