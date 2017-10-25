import java.sql.Connection;  //1
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	private Connection cn; //������ connection (���������)
	private Statement st; //������ ���� ������ Statement � ������� ���. ������ �������� �������� executeUpdate 

	public DB(String url, String name, String login, String password){ //	����������� - ����� ����� ����������� ���������� � ��
		try {
			Class.forName("com.mysql.jdbc.Driver"); 	//���� � ������ Driver � ������������ connector
			
			cn = DriverManager.getConnection(url+name, login, password); 	//���������� � ��
			st = cn.createStatement(); 	//������, ������� �������� ���������� ������� � ��
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void update(String sql){ //sql - ��� ������ ������� � ��. ���� ����� ����� ���������� ������ �� ������� ������� �� ���������� ����������
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String sql){
		ResultSet rs = null; //���� �� �� �������� ���������� ��� ������ ����������� � ResultSet
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void showTable(ResultSet rs){
		try {
			
			ResultSetMetaData rsmd = rs.getMetaData(); //�������� ������ rsmd
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
