package homework.part03;
//Ñîçäàòü äâóìåðíûé ìàññèâ èç 8 ñòðîê ïî 5 ñòîëáöîâ â êàæäîé èç 
//ñëó÷àéíûõ öåëûõ ÷èñåë èç îòðåçêà [10;99]. Âûâåñòè ìàññèâ íà ýêðàí.

public class Page67Ex1 {

	public static void main(String[] args) {

		// ñîçäàåì äâóìåðíûé ìàññèâ èç ñëó÷àéíûõ ÷èñåë èç îòðåçêà [10;99]

		int[][] mas = new int[8][5];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 90 + 10); // [10;99] (max - min + 1) + min
			}

		}
		// âûâîä ìàññèâà

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

	}
}
