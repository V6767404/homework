package lesson8_1;

public class C4 extends Citroen {
	
	public int weight;

	public C4 (int cost, String model, String color, int weight) {
		super(cost, model, color);
		this.weight = weight;
		this.model =model; //если не написать -не проинициализируется и будет null
		
		
	}

	@Override
	public void show() {
		super.show();
		System.out.print(" "+ weight);
	}

	
}
