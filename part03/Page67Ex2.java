package homework.part03;
//Ñîçäàòü äâóìåðíûé ìàññèâ èç 5 ñòðîê ïî 8 ñòîëáöîâ â êàæäîé èç
//ñëó÷àéíûõ öåëûõ ÷èñåë èç îòðåçêà [-99;99]. Âûâåñòè ìàññèâ íà ýêðàí. Ïîñëå
//íà îòäåëüíîé ñòðîêå âûâåñòè íà ýêðàí çíà÷åíèå ìàêñèìàëüíîãî ýëåìåíòà
//ýòîãî ìàññèâà (åãî èíäåêñ íå èìååò çíà÷åíèÿ). 

public class Page67Ex2 {
	public static void main(String[] args) {

		// ñîçäàåì äâóìåðíûé ìàññèâ èç ñëó÷àéíûõ ÷èñåë èç îòðåçêà [-99;99]
		// (max - min + 1) + min c ïåðåíîñîì ñòðîêè

		int[][] mas = new int[5][8];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 199) - 99; // [10;99] (max - min + 1) + min
			}

		}
		// âûâîä ìàññèâà

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

		// íàéòè ìàêñèìàëüíîå çíà÷åíèå ýëåìåíòà ìàññèâà è âûâåñòè íà ýêðàí

		//int temp = -100;
		int temp = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > temp) {
					temp = mas[i][j];
				}
			}
		}

		System.out.println("çíà÷åíèå ìàêñ ýëåìåíòà = " + temp);
	}

}
