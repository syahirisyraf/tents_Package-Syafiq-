import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.GridLayout.*;

public class TentPackage extends JFrame implements ActionListener
{
	
		// frame width
		private static final int FRAME_WIDTH = 650;
		// frame height
		private static final int FRAME_HEIGHT = 550;
		// x coordinate of the frame default original point
		private static final int FRAME_X_ORIGIN = 300;
		// y coordinate of the frame default original point
		private static final int FRAME_Y_ORIGIN = 250;
		
		//JText Area
		private JTextArea txtAreaEconomy;
		private JTextArea txtAreaStandard;
		private JTextArea txtAreaPlatinum;
		
		// JScroll Pane
		private JScrollPane scrollEconomy;
		private JScrollPane scrollStandard;
		private JScrollPane scrollPlatinum;
		
		// JText
		private JTextField txtQtyEconomy;
		private JTextField txtQtyStandard;
		private JTextField txtQtyPlatinum;
		
		//JLabel Field for display Package
		private JLabel lblEconomy;
		private JLabel lblStandard;
		private JLabel lblPlatinum;
		
		//Check Box button for Package
		private JCheckBox chkEconomy;
		private JCheckBox chkStandard;
		private JCheckBox chkPlatinum;
		
		//
	
	public static void main(String args[]) throws IOException
	{
		TentPackage tents_Package = new TentPackage();
		tents_Package.setVisible(true);
	}
	
	public TentPackage()
	{
		Container contentPane;
		contentPane = getContentPane();
		
		// set frame properties
		setSize (700,550);
		setLocation (600,450);
		setLayout	(new GridLayout(6,2,0,0));
		contentPane.setBackground( Color.WHITE);
		setTitle("Tents Package Books System");
		setResizable (true);
		
		// add JLabel
		lblEconomy = new JLabel();
		lblEconomy.setText("Economy RM300");
		lblEconomy.setSize(150,25);
		
		lblStandard = new JLabel();
		lblStandard.setText("Standard RM450");
		lblStandard.setSize(150,25);
		
		lblPlatinum = new JLabel();
		lblPlatinum.setText("Platinum RM600");
		lblPlatinum.setSize(150,25);
		
		// Add Check Box
		chkEconomy = new JCheckBox("Economy RM300");
		chkStandard = new JCheckBox("Standard RM450");
		chkPlatinum = new JCheckBox("Platinum RM600");
		
		// add text Box
		txtQtyEconomy = new JTextField();
		txtQtyEconomy.setColumns(2); 
		txtQtyEconomy.setFont(new Font("Courier", Font.PLAIN, 14));
		
		txtQtyStandard = new JTextField();
		txtQtyStandard.setColumns(2); 
		txtQtyStandard.setFont(new Font("Courier", Font.PLAIN, 14));
		
		txtQtyPlatinum = new JTextField();
		txtQtyPlatinum.setColumns(2); 
		txtQtyPlatinum.setFont(new Font("Courier", Font.PLAIN, 14));
		
		// add text area
		scrollEconomy = new JScrollPane();
		txtAreaEconomy = new JTextArea();
		txtAreaEconomy.setEditable(false);
		txtAreaEconomy.setColumns(20);
		txtAreaEconomy.setRows(5);
		txtAreaEconomy.setText("1 Pyramid Canopy (20x20)\n40 Plastic Chair\n4 Round Table + tablecloth\nFan");
		scrollEconomy.setViewportView(txtAreaEconomy);
		
		scrollStandard = new JScrollPane();
		txtAreaStandard = new JTextArea();
		txtAreaStandard.setEditable(false);
		txtAreaStandard.setColumns(20);
		txtAreaStandard.setRows(5);
		txtAreaStandard.setText("1 Arabian Canopy (20x20) + scallops\n40 Plastic Chair\n4 Round table + tablecloth\nFan + light");
		scrollStandard.setViewportView(txtAreaStandard);
		
		scrollPlatinum = new JScrollPane();
		txtAreaPlatinum = new JTextArea();
		txtAreaPlatinum.setEditable(false);
		txtAreaPlatinum.setColumns(20);
		txtAreaPlatinum.setRows(5);
		txtAreaPlatinum.setText("1 Arabian Canopy (20x20) + scallops\n40 Plastic chair with fabric and ribbon\n4 round table + tablecloth\nFan + light");
		scrollPlatinum.setViewportView(txtAreaPlatinum);
		
		//add Economy label
		contentPane.add(chkEconomy);
		contentPane.add(scrollEconomy);
		contentPane.add(txtQtyEconomy);
		
		contentPane.add(chkStandard);
		contentPane.add(scrollStandard);
		contentPane.add(txtQtyStandard);
		
		contentPane.add(chkPlatinum);
		contentPane.add(scrollPlatinum);
		contentPane.add(txtQtyPlatinum);

		
	}
	
	public void actionPerformed(ActionEvent event)
	{
		
	}

}
