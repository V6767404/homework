package lesson07_1;


public class Test {
	
	public int a;
	//public static Test[]mas;
	
	public static Test[] createMas(int n){
		Test[]mas = new Test[n];
		for(int i = 0; i < mas.length; i++){
			mas[i] = new Test();
			mas[i].create();
		}
		return mas;
	}
	
	public void create(){
		a = (int)(Math.random() * 10 + 1);
	}
	
	public static void showMas(Test [] mas){
		for(int i = 0; i < mas.length; i++){
			System.out.println(mas[i].a);
		}
	}
	
	
	
	/*public static int b = 777;
	public static Scanner sc;
	
	static{ //блок
		sc = new Scanner(System.in);
		
	}
	
	public static void show(){
		int g = 56;
		System.out.println("hello");
	}*/
}