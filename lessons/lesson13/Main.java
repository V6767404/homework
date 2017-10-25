import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		
		
		WorkDB.deleteDB("jdbc:mysql://127.0.0.1/", "shop", "root", "root");
		WorkDB.createDB("jdbc:mysql://127.0.0.1/", "shop", "root", "root");
		
		
	//	DB db = new DB("jdbc:mysql://127.0.0.1/", "shop", "root", "root"); //подключение (connection из конструктора) к имеющейся БД

		/*db.update("CREATE DATABASE shop");
		db.update("USE shop");
		db.update("CREATE TABLE users(id_user INT AUTO_INCREMENT,"
				+ "login VARCHAR(30) UNIQUE,"
				+ "password VARCHAR(30) NOT NULL,"
				+ "role INT(1) DEFAULT 1,"
				+ "del_status INT(1) DEFAULT 1,"
				+ "PRIMARY KEY (id_user))");*/
		
		//db.update("INSERT INTO users (login, password) VALUES ('admin', 'admin')");
			
		/*
		ResultSet rs = db.query("SELECT * FROM users");
		db.showTable(rs);
		*/
		
		//db.close();
		
	}

}
