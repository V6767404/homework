package homework.part05;

import java.util.Scanner;

public class ClassLes7 {
	
	public String[] smas;

	// public ClassLes7(int n) { // ����������� ������� ������ ����� ��������
	// �����������
	// smas = new String[n]; }

	public String[] createMas() { // �������� �������
		System.out.println("������� ����������� ������� ������� �����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		smas = new String[n]; // ��������� ������
		System.out.println("������� ������. ����� ������ - enter. ����� ����� - end");
		Scanner scan = new Scanner(System.in);
		String input;
		int i = 0;
		do {
			input = scan.nextLine();
			smas[i++] = input;
		} while (!input.equals("end")); // ���� �������� ������ end - �� ���� ������������
		// ��������� ���������� ���� �������
		for (i = (i - 1); i < n; i++) {
			smas[i] = "blabla"; // ����� ������ ��������� �������� �����, �� ����� ����������� ���� � ������ - ���������� ���?
		}

		return smas;

		// System.out.println("������� ������. ����� ������ - enter. ����� ����� -
		// end");
		// for (int i = 0; i < smas.length; i++) {
		// Scanner s = new Scanner(System.in);
		// smas[i] = s.nextLine();
		// }
		// return mas;
		//

	}
}
