package Project1;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout.*;
import javax.swing.JButton.*;
import javax.swing.JFrame.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Login extends JFrame implements ActionListener{
	
	private JLabel name, id, address, phoneNo;
	private JTextField txtName, txtiD, txtAddress, txtPhoneNo;
	private JButton btnRegister, btnBook, btnClear;
	
	public static void main (String[] args) throws IOException {
		
		Login lg = new Login();
		lg.setVisible(true);
	}
	
	public Login() {
		
		Container contentPane;
		contentPane= getContentPane();
		setSize(350,200);
		setLayout(new GridLayout(6,2,0,0));
		setLocation(350,300);
		setTitle("REGISTER INNFORMATION");
		
		contentPane.setBackground(Color.yellow);
		contentPane.setForeground(getBackground());
		
		
		
		name=new JLabel("NAME:");
		txtName=new JTextField("");
	    txtName.setFont(new Font("Courier", Font.PLAIN, 14));
	    txtName.setEditable(true);
	        
		address=new JLabel("ADDRESS:");
		txtAddress=new JTextField("");
		txtAddress.setFont(new Font("Courier", Font.PLAIN, 14));
		txtAddress.setEditable(true);
	    
		id=new JLabel("IDENTITY CARD:");
		txtiD=new JTextField("");
		txtiD.setFont(new Font("Courier", Font.PLAIN, 14));
		txtiD.setEditable(true);
		
		phoneNo=new JLabel("PHONE NUMBER:");
		txtPhoneNo=new JTextField("");
		txtPhoneNo.setFont(new Font("Courier", Font.PLAIN, 14));
		txtPhoneNo.setEditable(true);
		
		btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(this);
		
		btnBook = new JButton("BOOK NOW!");
		btnBook.addActionListener(this);
		
		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(this);
		
		contentPane.add(name);
		contentPane.add(txtName);
	    contentPane.add(address);
	    contentPane.add(txtAddress);
		contentPane.add(id);
		contentPane.add(txtiD);
		contentPane.add(phoneNo);
		contentPane.add(txtPhoneNo);
		contentPane.add(btnRegister);
		contentPane.add(btnBook);
		contentPane.add(btnClear);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == btnRegister) {
			JOptionPane.showMessageDialog(null, "Register Successfully");
		}
		if(event.getSource() == btnBook) {
			TentPackage TentPackage = new TentPackage();
			TentPackage.setVisible(true);
			dispose();
		}
		if(event.getSource() == btnClear) {
			txtName.setText("");
		}
		
	}

}
