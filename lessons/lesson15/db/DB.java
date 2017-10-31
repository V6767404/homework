package by.tc.booking.db;

//урок 13. класс создающий соедининение с БД

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	private Connection cn;
	private Statement st;

	public DB(String url, String name, String login, String password){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url+name, login, password); //соединение с БД
			st = cn.createStatement(); //объект, который позволит отправлять запросы в БД
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void update(String sql){ //тправляет только те запросы, которые не возвращают результат
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String sql){
		ResultSet rs = null;
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void showTable(ResultSet rs){
		try {
			
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i = 1; i <= rsmd.getColumnCount(); i++){
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			while(rs.next()){
				System.out.println();
				for(int i = 1; i <= rsmd.getColumnCount(); i++){
					System.out.print(rs.getString(i) + "\t");
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			st.close();
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//5 пишем для DaoUsers getter к полю cn - чтобы была возможность обратиться к уже созданному connection
	
	public Connection getCn() {
		return cn;
	}
	

	
}