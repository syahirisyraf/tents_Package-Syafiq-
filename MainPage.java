
import javax.swing.*;
import java.text.DecimalFormat;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.GridLayout.*;

public class FrontPage extends JFrame implements ActionListener {
	private JLabel pic, title;
	private JButton enter;

	public static void main(String args[]) throws IOException {
		FrontPage front = new FrontPage();
		front.setVisible(true);
	}

	public FrontPage() {
		Container contentPane;
		contentPane = getContentPane();

		// set frame properties
		setSize(750, 550);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(true);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setTitle("Tents Package Books System");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		title = new JLabel();
		title.setText("<html>WELCOME TO<br>PANDA WORLD SDN BHD</html>");
		contentPane.add(title);
		title.setBounds(250, 300, 400, 100);
		title.setFont(new Font("Serif", Font.BOLD, 20));
		title.setForeground(Color.WHITE);
		
		
		pic = new JLabel(new ImageIcon("C:\\Users\\M S I\\Desktop\\Java Workspace\\GUIProject\\src\\Project1\\Canopy.jpg"));
		contentPane.add(pic);
		pic.setBounds(10, 10, 720, 478);

		enter = new JButton("ENTER NOW");
		contentPane.add(enter);
		enter.setBounds(300, 400, 125, 25);
		enter.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == enter) {
			Login Login = new Login();
			Login.setVisible(true);
			dispose();

		}
	}
}
