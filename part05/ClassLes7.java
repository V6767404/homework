package homework.part05;

import java.util.Scanner;

public class ClassLes7 {
	
	public String[] smas;

	// public ClassLes7(int n) { // êîíñòðóêòîð ñîçäàåò ìàññèâ ñòðîê çàäàííîé
	// ðàçìåðíîñòè
	// smas = new String[n]; }

	public String[] createMas() { // ñîçäàíèå ìàññèâà
		System.out.println("Ââåäèòå ðàçìåðíîñòü íóæíîãî ìàññèâà ñòðîê");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		smas = new String[n]; // îáúÿâëÿåì ìàññèâ
		System.out.println("Ââîäèòå ñòðîêè. Êîíåö ñòðîêè - enter. Êîíåö ââîäà - end");
		Scanner scan = new Scanner(System.in);
		String input;
		int i = 0;
		do {
			input = scan.nextLine();
			smas[i++] = input;
		} while (!input.equals("end")); // åñëè ââåäåíàÿ ñòðîêà end - òî ââîä ïðåêðàùàåòñÿ
		// çàïîëíÿåì îñòàâøèåñÿ ïîëÿ ìàññèâà
		for (i = (i - 1); i < n; i++) {
			smas[i] = "blabla"; // çäåñü íàäîáû çàïîëíèòü íîìåðàìè ñòðîê, íî íóæíà êîíâåðòàöèÿ öèôð â ñòðîêè - ïîäñêàæèòå êàê?
		}

		return smas;

		// System.out.println("Ââîäèòå ñòðîêè. Êîíåö ñòðîêè - enter. Êîíåö ââîäà -
		// end");
		// for (int i = 0; i < smas.length; i++) {
		// Scanner s = new Scanner(System.in);
		// smas[i] = s.nextLine();
		// }
		// return mas;
		// 

	}
}
