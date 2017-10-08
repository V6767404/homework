
public class MobilePhone {

	public int cost; // поле класса
	public String model;

	public void show() {
		System.out.println(cost + " " + model); // метод
	}

	/*
	 * public void costPhone() { System.out.println(cost*10); }
	 */
	public void costPhone(int n) {
		System.out.println(cost * n);
	}

	public void test(int a, double d, String s) {

	}

	public void copy(MobilePhone ob) {
		cost = ob.cost;
		model = ob.model;
	}
	// System.out.println();

}
