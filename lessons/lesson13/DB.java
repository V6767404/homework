import java.sql.Connection;  //1
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	private Connection cn; //объект connection (интерфейс)
	private Statement st; //объект типа данных Statement в котором нах. методы отправки запросов executeUpdate 

	public DB(String url, String name, String login, String password){ //	конструктор - сразу будет установлено соедитение с БД
		try {
			Class.forName("com.mysql.jdbc.Driver"); 	//путь к классу Driver в подключенном connector
			
			cn = DriverManager.getConnection(url+name, login, password); 	//соединение с БД
			st = cn.createStatement(); 	//объект, который позволит отправлять запросы в БД
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void update(String sql){ //sql - это строка запроса в БД. этот метод будет отправлять только те запросы которые не возвращают результаты
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String sql){
		ResultSet rs = null; //если из БД приходит информация она всегда сохраняется в ResultSet
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void showTable(ResultSet rs){
		try {
			
			ResultSetMetaData rsmd = rs.getMetaData(); //создание объета rsmd
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
	
	
}
