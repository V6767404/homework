package empty05.part2;

public class MobilePhone {

	public int cost;
	public String model;
	
	// конструкторы --------

	public MobilePhone() { // конструктор - всегда как имя класса и всегда void - поэтому не указывается
		cost = 543; // инициализация в кострукторе цены
		System.out.println("constructor"); //будет выводиться каждый раз когда создается новый объект
	}
/*	
	 public MobilePhone(int c, String m) { // другой конструктор
	 cost =c;
	 model=m;}*/
	
	public MobilePhone(int cost, String model) {
	this.cost =cost ;
	this.model=model;
	}

	public MobilePhone(int cost) { // другой конструктор
	this.cost = cost;
}

	public MobilePhone(String cost) { // другой конструктор - перегрузка методов - с другим типом данных
	} // ничего плохого в том что здесь cost c другим типом ? cost поле класса типа int
	
	// конструкторы --------

	public void show() {
		System.out.println(cost + " " + model); 
	}

	// на втором уроке
	public int costPhone(int n) { // убрали void (метод возвращает) и добавили тип переменной возврата
		int rez = cost * n;
		return rez;
	}

	public void copy(MobilePhone ob) {
		cost = ob.cost;
		model = ob.model;
	}

	// на втором уроке
	public MobilePhone copy2() { // void меняем на тип когда return
		MobilePhone ob = new MobilePhone();
		ob.cost = cost;
		ob.model = model;
		return ob;

	}

}
