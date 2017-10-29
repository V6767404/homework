package by.tc.booking.entity;

//entity классы описывают таблицы Бд. Все поля обязательно private (чтобы создать необходимые getter setters)
//также в entity классе должен быть обязательно пустой конструктор
//также обязательно переопределить в entity классе hashcode equals и toString
//плюс переопределить Serializable

public class Users {

	// 1 описываем поля класса -будущие столбцы таблицы
	private int id_user;
	private String login;
	private String password;
	private int role;
	private int del_status;

	public Users(int id_user, String login, String password, int role, int del_status) {
		this.id_user = id_user;
		this.login = login;
		this.password = password;
		this.role = role;
		this.del_status = del_status;
	}
	
	//для урока 14 (1:28) создадим конструктор из двух аргументов (логин и пароль)
	
	public Users(String login, String password) {
		
		this.login = login;
		this.password = password;
		role =1; //пропишем эти значения по умолчанию
		del_status =1;
	}	

	// 3 создаем обязательный пустой конструктор, чтобы добавить пустое поле в
	// таблицу
	public Users() {
	}

	// 4 переопределяем hashCode() equals() toString()
	@Override
	public String toString() {
		return "Users [id_user=" + id_user + ", login=" + login + ", password=" + password + ", role=" + role
				+ ", del_status=" + del_status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + del_status;
		result = prime * result + id_user;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + role;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (del_status != other.del_status)
			return false;
		if (id_user != other.id_user)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role != other.role)
			return false;
		return true;
	}

	// 2 переопределили Getters Setters - Spring Hibernate ищут сразу именно их

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getDel_status() {
		return del_status;
	}

	public void setDel_status(int del_status) {
		this.del_status = del_status;
	}

}
