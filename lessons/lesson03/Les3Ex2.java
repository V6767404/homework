import java.util.Scanner; // �� ������� ��������� ������������� ��� Scanner Ctrl Shift O

// Scanner

public class Les3Ex2 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��������");
		if (sc.hasNextInt()) {
			a = sc.nextInt(); 	// NextDouble ��� ����� double � ������� ����� ������� � ������� � �� � ������
		} 						//  NextLine- ������ �����������
		System.out.println("�������� �������� = " + a);
	}

}
