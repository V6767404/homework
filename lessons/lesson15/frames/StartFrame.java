package by.tc.booking.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Lesson 15 SWING 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import by.tc.booking.db.DB;
import by.tc.booking.db.WorkDB;
import by.tc.booking.frames.LoginFrame;

public class StartFrame extends JFrame {

	// 2 создаем элементы (вначале панелька на которой все расположим, на фрейме
	// сразу нельзя)

	private JPanel panel;
	private JTextField url, name, login;
	private JPasswordField password;
	private JLabel labelUrl, labelName, labelLogin, labelPassword;
	private JButton create, delete, connect;

	// 1 пишем конструктор StartFrame (по названию первого фрейма)

	public StartFrame() {
		setTitle("StartFrame");
		setSize(250, 290);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		initComponents(); // 4 записываем в контсруктор метод создания компонентов, описанный ниже
		action();
		setVisible(true); // ставиться в конце , за ним ничего не отразиться
	}

	// 3 метод для инициализации (создания) всех объектиков элементов панели

	public void initComponents() {

		panel = new JPanel();
		url = new JTextField("jdbc:mysql://127.0.0.1/", 20); // содержание по умолчанию, и размерность
		name = new JTextField("shop", 20);
		login = new JTextField("root", 20);

		password = new JPasswordField("root", 20);

		labelUrl = new JLabel("url"); // создаем 4-ре лейбла
		labelName = new JLabel("name");
		labelLogin = new JLabel("login");
		labelPassword = new JLabel("pass");

		create = new JButton("Создать"); // создаем три кнопки
		delete = new JButton("Удалить");
		connect = new JButton("Войти");

		// теперь компоненты (объекты) нужно расположить на панельке (panel)
		// для расположения метод add используем

		panel.add(labelUrl);
		panel.add(url);
		panel.add(labelName);
		panel.add(name);
		panel.add(labelLogin);
		panel.add(login);
		panel.add(labelPassword);
		panel.add(password);
		panel.add(create);
		panel.add(delete);
		panel.add(connect);

		add(panel); // этим методом закидываем панельку на фрейм
		// теперь чтобы метод initComponents запустить нужно его добавить в конструктор
		// -шаг 4

	}
	// 5 (урок 15 (43:00) функционал кнопок будет прописан в методе action

	public void action() {

		// к кнопке create добавляем слушатель событий и действие по методу
		// actionPerformed

		create.addActionListener(new ActionListener() { // создание объект интерфейса (анонимные классы)

			@Override
			public void actionPerformed(ActionEvent e) {
				WorkDB.createDB(url.getText(), name.getText(), login.getText(), String.valueOf(password.getPassword()));
			}
		});

		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				WorkDB.deleteDB(url.getText(), name.getText(), login.getText(), String.valueOf(password.getPassword()));
			}
		});

		connect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DB db = new DB(url.getText(), name.getText(), login.getText(), String.valueOf(password.getPassword()));
				new LoginFrame(db);
				dispose();
			}
		});

	}
}
