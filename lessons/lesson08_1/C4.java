package lesson8_1;

public class C4 extends Citroen {
	
	public int weight;

	public C4 (int cost, String model, String color, int weight) {
		super(cost, model, color);
		this.weight = weight;
		this.model =model; //если не написать непроинициализируется и будет null
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.print(" "+ weight);
	}

	
}
