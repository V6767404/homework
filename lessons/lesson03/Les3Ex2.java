import java.util.Scanner; // по нажатию подсказки подчеркивани€ или Scanner Ctrl Shift O

// Scanner

public class Les3Ex2 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите значение");
		if (sc.hasNextInt()) {
			a = sc.nextInt(); 	// NextDouble при вводе double с консоли нужно вводить с зап€той а не с точкой
		} 						//  NextLine- строка считываетс€
		System.out.println("введеное значение = " + a);
	}

}
