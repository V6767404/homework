package homework.part02;
//�������� ���������, ������� ����� ������������ � �������� ��
//����� ������������ ��������������� ����� �� ���������� [-3;3).


public class Page56Ex1 {

	public static void main(String[] args) {
		
		//(max - min + 1) + min  ��� [min;max]
		//(int)(Math.random()*(max - min + 1) + min)) - �������� � ������������� ���������
		//(int)(Math.random()*(max - min + 1)) + min) - �������� �� ���� ����������. ����� ����� ����� � ������ �������?

		// ?? �� ���� ������ ����� �������� ������� (max - min + 2) - (min + 1) ����������� �� ������
		//System.out.println((int)( Math.random() * 8 + 2)); // �� �������� [-3;3] (3- (-3) +2) - (-3+1)
		
		System.out.println((int) (Math.random() * 6) - 3); // [-3;3) -�� ���� �� �� ��� � [-3;2]
		System.out.println((int) (Math.random() * 6) - 3); 
		System.out.println((int) (Math.random() * 6) - 3);
		System.out.println((int) (Math.random() * 6) - 3);
		System.out.println((int) (Math.random() * 6) - 3);
	

	

	}

}
