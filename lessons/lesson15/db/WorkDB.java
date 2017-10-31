package by.tc.booking.db;

import java.sql.ResultSet;

import by.tc.booking.dao.DaoUsers;
import by.tc.booking.entity.Users;

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
		
		//2. урок 14 после создания DaoUsers метода insert переписывам способ добавления в БД
		//добавить пользователя в БД - для этого сейчас создан метод insert в DaoUsers
		//для этого понадобиться создать объект класса DaoUsers
		
		DaoUsers du = new DaoUsers(db);	 //создали объект с передачей в коснтруктор DB db
		
		//Users us = new Users(1, "aaaa", "aaaa", 1, 1); //создаем новый объект класcа Users который понадобиться для метода insert
		//du.insert(us);
		//или короче код
				
		du.insert(new Users(1, "aaaa", "aaaa", 1, 1));
		du.insert(new Users(2, "aaaa2", "aaaa", 1, 1));
		du.insert(new Users(3, "aaaa3", "aaaa", 1, 1));
		du.insert(new Users("aaaa4", "aaaa")); //используем конструктор из двух аргументов
		du.insert(new Users("aaaa5", "aaaa"));
		
		du.update(new Users(3, "dd", "aaa", 1, 1)); //используем созданный метод update в DaoUsers (1:33 u14)
	
		//1. коментим код из урока 13
		/*	db.update("INSERT INTO users (login, password) VALUES ('admin1', 'admin1')");
		db.update("INSERT INTO users (login, password) VALUES ('admin2', 'admin2')");
		db.update("INSERT INTO users (login, password) VALUES ('admin3', 'admin3')");*/
		
		ResultSet rs = db.query("SELECT * FROM users");
		db.showTable(rs);
	}
	
	public static void deleteDB(String url, String name, String login, String password){
		DB db = new DB(url, "", login, password);
		db.update("DROP DATABASE " + name);
	}
	
	
}
