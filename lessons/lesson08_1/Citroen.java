package lesson8_1;

public class Citroen extends Cars {

	public String color;

	public Citroen(int cost, String model, String color) {
		super(cost, model); // �������� ���������� �� ������� ����
		this.color = color;
	}

	public void showCitroen() {
		System.out.println(cost + " " + model + " " + color);
	}

	public void show() {
		super.show(); // ��������������� ������ (�� ����� ������)
		System.out.print(" " + color);
		
		//���� �������� -Sourse - Overide Imlement - ����� ��� ������ ����������� ��� ���������������
	}
//������ ����
	public final void meth() { //final ��������� ��������������
		//����� ���� final ���� - ���������� ��������� public final int MAX=576 (����� ����� �����������)
		//static - ����� ���� ������������ - ����� ����� ����������� ��� ���� Citroenov
		//final class - ����� ��� ����� ���� final ���������
	}
//	public abstract void meth2(); //����������� ����� - ���� ����� �� ����� ����������
	//�� ����� ����; �� ���� ��� ������ ��� ���������������
	//������������ final - �� ������� �������������� ����������� �����

}
