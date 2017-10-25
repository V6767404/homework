import java.sql.Connection;  //1
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	private Connection cn; //îáúåêò connection (èíòåðôåéñ)
	private Statement st; //îáúåêò òèïà äàííûõ Statement â êîòîðîì íàõ. ìåòîäû îòïðàâêè çàïðîñîâ executeUpdate 

	public DB(String url, String name, String login, String password){ //	êîíñòðóêòîð - ñðàçó áóäåò óñòàíîâëåíî ñîåäèòåíèå ñ ÁÄ
		try {
			Class.forName("com.mysql.jdbc.Driver"); 	//ïóòü ê êëàññó Driver â ïîäêëþ÷åííîì connector
			
			cn = DriverManager.getConnection(url+name, login, password); 	//ñîåäèíåíèå ñ ÁÄ
			st = cn.createStatement(); 	//îáúåêò, êîòîðûé ïîçâîëèò îòïðàâëÿòü çàïðîñû â ÁÄ
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void update(String sql){ //sql - ýòî ñòðîêà çàïðîñà â ÁÄ. ýòîò ìåòîä áóäåò îòïðàâëÿòü òîëüêî òå çàïðîñû êîòîðûå íå âîçâðàùàþò ðåçóëüòàòû
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String sql){
		ResultSet rs = null; //åñëè èç ÁÄ ïðèõîäèò èíôîðìàöèÿ îíà âñåãäà ñîõðàíÿåòñÿ â ResultSet 
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void showTable(ResultSet rs){
		try {
			
			ResultSetMetaData rsmd = rs.getMetaData(); //ñîçäàíèå îáúåòà rsmd
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
