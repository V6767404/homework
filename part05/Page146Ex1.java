package homework.part05;

//p146task1

/*�������� �����, � ������� ��� ���� �������� ������ �����. ������
���������� ����� � �������. ������������ ���� ����� � ������� �� ��� ���,
���� � �����-�� ������ �� ���������� ����� end, ��������� ������
����������� ������� = ����� ������. ������������ ������ �� �����.
����������, ���� �� ����� ����� ����������. �������� 3 ���������
�������� ����� ������� ������. ������������ 2 ������ � �������� ��������
��������� ����� ������� ������ �� �����. ���������� �������� �� ������
������ ����� �������� ������ ������.*/

public class Page146Ex1 {
	
	public static void showMas(String[] mas) { // ����������� ����� ��� ������ ��������
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		ClassLes7 cl = new ClassLes7();

		//������� ������
		
		String[] mas = cl.createMas();
		
		//String mas[] = { "kfdklf", "asdkjjkffdsfadsf", "aaaaa", "bla", "bla" }; // ��� �������

		// ������� ������
		//for (int i = 0; i < mas.length; i++) {
		//	System.out.print(mas[i] + "\t");
		//}
		
		System.out.println("\n----��������� ������:");
		Page146Ex1.showMas(mas);  // ?? ��������� �� ��� � ������ ����� ��������� ��� ������ ? �� �� ���� � ����� ���������
		
		
		
		// ���������� ����� ������� �� ������

		String tempstr;

		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i].length() > mas[j].length()) {
					tempstr = mas[i];
					mas[i] = mas[j];
					mas[j] = tempstr;
				}
			}
		}
		System.out.println("----������ ������� �������������:");
		
		Page146Ex1.showMas(mas); 
		

		// ������� 3 ��������� �������� ����� ������� ������

		tempstr = mas[mas.length - 1];
		int maxStrLength = tempstr.length();
		System.out.println("----3 ��������� �������� ����� ������� ������");
		System.out.println(tempstr.substring(maxStrLength - 3, maxStrLength));

		// ������������� 2 ������ � �������� ��������

		char[] charmas = mas[2].toCharArray();
		for (int i = 0; i < charmas.length; i++) {
			charmas[i] = Character.toUpperCase(charmas[i]);
		}
		// for (int i = 0; i < charmas.length; i++) {
		// System.out.print(charmas[i] + "\t");

		mas[2] = "";
		for (int i = 0; i < charmas.length; i++) { // ?? ������� � ������ - ������� ��� �� ������
			mas[2] = mas[2] + charmas[i];
		}
		System.out.println("----2-�� ������ � ������� ��������");
		System.out.println(mas[2]);
		// ��������� ����� ������� ������ �� �����
		// ?? ��� �� �������

		// ���������� �������� �� ������ ������ ����� �������� ������ ������
		
		charmas = mas[2].toCharArray();
		System.out.println("----�������� �� ������ ������ ����� �������� ������ ������?");
		System.out.println(Character.isDigit(charmas[1]));
	
	
	
	}

	
}
