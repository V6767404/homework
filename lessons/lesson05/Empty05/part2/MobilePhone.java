package empty05.part2;

public class MobilePhone {

	public int cost;
	public String model;
	
	// ������������ --------

	public MobilePhone() { // ����������� - ������ ��� ��� ������ � ������ void - ������� �� �����������
		cost = 543; // ������������� � ����������� ����
		System.out.println("constructor"); //����� ���������� ������ ��� ����� ��������� ����� ������
	}
/*	
	 public MobilePhone(int c, String m) { // ������ �����������
	 cost =c;
	 model=m;}*/
	
	public MobilePhone(int cost, String model) {
	this.cost =cost ;
	this.model=model;
	}

	public MobilePhone(int cost) { // ������ �����������
	this.cost = cost;
}

	public MobilePhone(String cost) { // ������ ����������� - ���������� ������� - � ������ ����� ������
	} // ������ ������� � ��� ��� ����� cost c ������ ����� ? cost ���� ������ ���� int
	
	// ������������ --------

	public void show() {
		System.out.println(cost + " " + model); 
	}

	// �� ������ �����
	public int costPhone(int n) { // ������ void (����� ����������) � �������� ��� ���������� ��������
		int rez = cost * n;
		return rez;
	}

	public void copy(MobilePhone ob) {
		cost = ob.cost;
		model = ob.model;
	}

	// �� ������ �����
	public MobilePhone copy2() { // void ������ �� ��� ����� return
		MobilePhone ob = new MobilePhone();
		ob.cost = cost;
		ob.model = model;
		return ob;

	}

}
