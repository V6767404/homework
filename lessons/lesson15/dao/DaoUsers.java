package by.tc.booking.dao; 

//также как для всех таблиц создаются entity классы также создаются для каждой таблицы создаются dao классы
//которые описывают методы работы с таблицами. Все методы описаны в DaoInterface

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.tc.booking.db.DB;
import by.tc.booking.entity.Users; //2 Ctrl Shift O - импортируем 


//1 реализуем интерфейс с типом Users
public class DaoUsers implements DaoInterface<Users>{
	
	
	//4 создаем объект чтобы обратиться к его методам
	private DB db;
	
	
	//5 в класс передаем объект существующий 
	// по сути инициализируем поля класса
	public DaoUsers(DB db){
		this.db = db;
	}
	
	//2 переопределяем методы интерфейса и наполняем их
	//3 ранее для отправки запроса в БД был спец объект statement а в нем были методы executequery exequteupdate
	// по аналогии создаем такойже объет preparedStatement
	@Override
	public void insert(Users ob) { 
		try {
			//cn типа Connection уже создан в DB классе и является его полем
			
			PreparedStatement ps = db.getCn().prepareStatement("INSERT INTO users VALUES (?,?,?,?,?)");
			ps.setInt(1, ob.getId_user()); //вместо первого вопросика подставляем
			ps.setString(2, ob.getLogin()); //вместо второго вопросика подставляем
			ps.setString(3, ob.getPassword());
			ps.setInt(4, ob.getRole());
			ps.setInt(5, ob.getDel_status());
			
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try {
			PreparedStatement ps = db.getCn().prepareStatement("UPDATE users SET del_status = 2 WHERE id_user=?");
			ps.setInt(1, id);
			
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Users ob) {
		try {
			PreparedStatement ps = db.getCn().prepareStatement("UPDATE users SET login=?, password=?, role=?, del_status=? WHERE id_user=?");
			
			ps.setString(1, ob.getLogin());
			ps.setString(2, ob.getPassword());
			ps.setInt(3, ob.getRole());
			ps.setInt(4, ob.getDel_status());
			ps.setInt(5, ob.getId_user());
			
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//метод get в уроке 15 5:57
	
	@Override
	public Users get(int id) {
		ResultSet rs = db.query("SELECT * FROM users WHERE id = " + id);
		try {
			if (rs.next()) { //проверяем существует ли в табличке след строка
				return new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}