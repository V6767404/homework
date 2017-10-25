import java.sql.ResultSet;

public class WorkDB {

	public static void createDB(String url, String name, String login, String password){
		DB db = new DB(url, "", login, password);
		db.update("CREATE DATABASE " + name);
		db.update("USE " + name);
		db.update("CREATE TABLE users(id_user INT AUTO_INCREMENT,"
				+ "login VARCHAR(30) UNIQUE,"
				+ "password VARCHAR(30) NOT NULL,"
				+ "role INT(1) DEFAULT 1,"
				+ "del_status INT(1) DEFAULT 1,"
				+ "PRIMARY KEY (id_user))");
		db.update("INSERT INTO users (login, password) VALUES ('admin1', 'admin1')");
		db.update("INSERT INTO users (login, password) VALUES ('admin2', 'admin2')");
		db.update("INSERT INTO users (login, password) VALUES ('admin3', 'admin3')");
		
		ResultSet rs = db.query("SELECT * FROM users");
		db.showTable(rs);
	}
	
	public static void deleteDB(String url, String name, String login, String password){
		DB db = new DB(url, "", login, password);
		db.update("DROP DATABASE " + name);
	}
	
	
}
