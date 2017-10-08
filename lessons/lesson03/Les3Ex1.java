//switch
public class Les3Ex1 {

	public static void main(String[] args) {

	

		for (int i = 0; i < 10; i++) {
				
		switch (i) {
		case 5:
			System.out.println(5);
			break;
		case 6: 
		case 7:
		case 8:
			System.out.println(6);
			break;
		case 89:
			System.out.println(89);
			break;
		case 12:
			System.out.println(12);
			break;
		case 2:
			System.out.println(2);
			break;
			default :System.out.println("Case не найден");
		}
	}
}
}	