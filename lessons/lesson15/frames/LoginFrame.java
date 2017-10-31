package by.tc.booking.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import by.tc.booking.db.DB;

public class LoginFrame extends JFrame{
	
	private JPanel panel;
	private JTextField login;
	private JPasswordField password;
	private JLabel labelLogin, labelPassword;
	private JButton ok, rega;
	private DB db;
	
	public LoginFrame(DB db){
		this.db = db;
		setTitle("LoginFrame");
	//setIconImage(new ImageIcon("C://123/1.jpg").getImage());
		setSize(250, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		initComponents();
		action();
		setVisible(true);
	}
	
	public void initComponents(){
		panel = new JPanel();
		
		login = new JTextField("admin", 20);
		password = new JPasswordField("admin", 20);
		
		labelLogin = new JLabel("login");
		labelPassword = new JLabel("pass");
		
		ok = new JButton("Войти");
		rega = new JButton("Рега");
		
		panel.add(labelLogin);
		panel.add(login);
		panel.add(labelPassword);
		panel.add(password);
		panel.add(ok);
		panel.add(rega);

		add(panel);	
	}
	
public void action(){
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ResultSet rs = db.query("SELECT * FROM users WHERE login = '" + login.getText() + "'");
				try {
					if(rs.next()){
						if(String.valueOf(password.getPassword()).equals(rs.getString("password"))){
							if(rs.getInt("del_status") == 1){
								if(rs.getInt("role") == 1){
									JOptionPane.showMessageDialog(panel, "User", "Всё норм", JOptionPane.INFORMATION_MESSAGE);
								}else{
									JOptionPane.showMessageDialog(panel, "Admin", "Всё не норм", JOptionPane.ERROR_MESSAGE);
								}
							}else{
								JOptionPane.showMessageDialog(panel, "Вы заблокированы", "Всё не норм", JOptionPane.ERROR_MESSAGE);
							}
						}else{
							JOptionPane.showMessageDialog(panel, "Пароль не подходит", "Всё не норм", JOptionPane.ERROR_MESSAGE);
						}
					}else{
						JOptionPane.showMessageDialog(panel, "Нет такого", "Всё не норм", JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
	
	}
	

}
