package by.tc.booking.db;

import by.tc.booking.frames.StartFrame;

public class Main {

	public static void main(String[] args) {
		
	//урок 15
		
	new StartFrame(); //даже никуда не сохраняем объект, простое создание запустит конструкт и окно
		
		
		
		
		//коментим эту часть на 15 уроке когда создаем фреймы для создания бд
		/*WorkDB.deleteDB("jdbc:mysql://127.0.0.1/", "shop", "root", "root");
		WorkDB.createDB("jdbc:mysql://127.0.0.1/", "shop", "root", "root");*/
		
	/*	
		DB db = new DB("jdbc:mysql://127.0.0.1/", "shop", "root", "root");
		//db.update("INSERT INTO users (login, password) VALUES ('admin', 'admin')");
		
		ResultSet rs = db.query("SELECT * FROM users");
		db.showTable(rs);
		
		db.close();*/
		
	}

}
