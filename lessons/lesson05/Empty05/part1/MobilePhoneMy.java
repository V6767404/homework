package empty05.part1;

public class MobilePhoneMy {

	public int cost; // поле класса
	public String model;

	public void show() {
		System.out.println(cost + " " + model); // метод
	}

	public void costPhones() {
		System.out.println(cost * 10);
	}

	public void costPhones(int n) {
		System.out.println(cost * n);
	}

	public void test(int a, double d, String s) {

	}
	
	public void copy(MobilePhoneMy ob) {
		cost = ob.cost;
		model = ob.model;
	}
}
