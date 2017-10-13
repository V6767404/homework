package lesson8_1;

public class Cars {
	public int cost;
	public String model;

	public Cars(int cost, String model) {
		this.cost = cost;
		this.model = model;
	}

	public Cars(int cost) {
		this.cost = cost;
	}

	public void show() {
		System.out.println();
		System.out.print(cost + " " + model);

	}

}
