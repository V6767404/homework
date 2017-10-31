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

	// 2 ������� �������� (������� �������� �� ������� ��� ����������, �� ������
	// ����� ������)

	private JPanel panel;
	private JTextField url, name, login;
	private JPasswordField password;
	private JLabel labelUrl, labelName, labelLogin, labelPassword;
	private JButton create, delete, connect;

	// 1 ����� ����������� StartFrame (�� �������� ������� ������)

	public StartFrame() {
		setTitle("StartFrame");
		setSize(250, 290);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		initComponents(); // 4 ���������� � ����������� ����� �������� �����������, ��������� ����
		action();
		setVisible(true); // ��������� � ����� , �� ��� ������ �� ����������
	}

	// 3 ����� ��� ������������� (��������) ���� ���������� ��������� ������

	public void initComponents() {

		panel = new JPanel();
		url = new JTextField("jdbc:mysql://127.0.0.1/", 20); // ���������� �� ���������, � �����������
		name = new JTextField("shop", 20);
		login = new JTextField("root", 20);

		password = new JPasswordField("root", 20);

		labelUrl = new JLabel("url"); // ������� 4-�� ������
		labelName = new JLabel("name");
		labelLogin = new JLabel("login");
		labelPassword = new JLabel("pass");

		create = new JButton("�������"); // ������� ��� ������
		delete = new JButton("�������");
		connect = new JButton("�����");

		// ������ ���������� (�������) ����� ����������� �� �������� (panel)
		// ��� ������������ ����� add ����������

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

		add(panel); // ���� ������� ���������� �������� �� �����
		// ������ ����� ����� initComponents ��������� ����� ��� �������� � �����������
		// -��� 4

	}
	// 5 (���� 15 (43:00) ���������� ������ ����� �������� � ������ action

	public void action() {

		// � ������ create ��������� ��������� ������� � �������� �� ������
		// actionPerformed

		create.addActionListener(new ActionListener() { // �������� ������ ���������� (��������� ������)

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
