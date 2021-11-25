package Project1;

import javax.swing.*;
import java.text.DecimalFormat;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.GridLayout.*;

public class TentPackage extends JFrame implements ActionListener {
	// JText Area
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
	private JTextField txtQtyCanopy;
	private JTextField txtQtyStandFan;
	private JTextField txtQtyBrideTable;
	private JTextField txtQtyPlasticChair;
	private JTextField txtQtyRoundTable;
	private JTextField txtTotalPackage;
	private JTextField txtTotalAddtional;
	private JTextField txtTotalPrice;
	private JTextField txtTotalPriceSST;

	// JLabel Field for display Type of Package
	private JLabel lblPackage;
	private JLabel lblQtyBook;
	private JLabel lblAdditional;
	private JLabel lblQtyAddtional;
	private JLabel lblTotalPackage;
	private JLabel lblTotalAddtional;
	private JLabel lblTotalPrice;
	private JLabel lblTotalPriceSST;
	private JLabel lblPriceCalc;

	// Check Box button for Package
	private JCheckBox chkEconomy;
	private JCheckBox chkStandard;
	private JCheckBox chkPlatinum;
	private JCheckBox chkCanopy;
	private JCheckBox chkStandFan;
	private JCheckBox chkBrideTable;
	private JCheckBox chkPlasticChair;
	private JCheckBox chkRound;

	// Button Calculate
	private JButton btnCalculate;
	private JButton btnClear;

	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String args[]) throws IOException {
		TentPackage tents_Package = new TentPackage();
		tents_Package.setVisible(true);
	}

	public TentPackage() {
		Container contentPane;
		contentPane = getContentPane();

		// set frame properties
		setSize(800, 400);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(true);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setTitle("Tents Package Books System");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// add JLabel
		lblPackage = new JLabel();
		lblPackage.setText("                    **********Package Type**********");
		lblPackage.setFont(new Font("Courier", Font.BOLD, 18));
		lblPackage.setSize(150, 25);

		lblQtyBook = new JLabel();
		lblQtyBook.setText("Book Package :");
		lblQtyBook.setSize(150, 25);

		lblAdditional = new JLabel();
		lblAdditional.setText("Additonal Item");
		lblAdditional.setSize(150, 25);

		lblQtyAddtional = new JLabel();
		lblQtyAddtional.setText("Quantity");
		lblQtyAddtional.setSize(150, 25);
		
		lblPriceCalc = new JLabel();
		lblPriceCalc.setText("          PRICE CALCULATION");
		lblPriceCalc.setFont(new Font("Courier", Font.BOLD,14));
		lblPriceCalc.setSize(150,25);
		
		lblTotalPackage = new JLabel();
		lblTotalPackage.setText("Total Package :");
		lblTotalPackage.setSize(150, 25);

		lblTotalAddtional = new JLabel();
		lblTotalAddtional.setText("Total Addtional Item :");
		lblTotalAddtional.setSize(150, 25);

		lblTotalPrice = new JLabel();
		lblTotalPrice.setText("Total Price :");
		lblTotalPrice.setSize(150, 25);

		lblTotalPriceSST = new JLabel();
		lblTotalPriceSST.setText("Total Price after 6% SST :");
		lblTotalPriceSST.setSize(150, 25);

		// Add Check Box
		chkEconomy = new JCheckBox("Economy RM300");
		chkStandard = new JCheckBox("Standard RM450");
		chkPlatinum = new JCheckBox("Platinum RM600");

		chkCanopy = new JCheckBox("Canopy Arabian (20x20) = RM200");
		chkStandFan = new JCheckBox("Stand Fan = RM25");
		chkBrideTable = new JCheckBox("Bride Groom Table = RM200");
		chkPlasticChair = new JCheckBox("Plastic Chair = RM1");
		chkRound = new JCheckBox("Round Table = RM15");

		// add text Box
		txtQtyEconomy = new JTextField("0");
		txtQtyEconomy.setColumns(2);
		txtQtyEconomy.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyEconomy.setEditable(false);

		txtQtyStandard = new JTextField("0");
		txtQtyStandard.setColumns(2);
		txtQtyStandard.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyStandard.setEditable(false);

		txtQtyPlatinum = new JTextField("0");
		txtQtyPlatinum.setColumns(2);
		txtQtyPlatinum.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyPlatinum.setEditable(false);

		txtQtyCanopy = new JTextField("0");
		txtQtyCanopy.setColumns(2);
		txtQtyCanopy.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyCanopy.setEditable(false);

		txtQtyStandFan = new JTextField("0");
		txtQtyStandFan.setColumns(2);
		txtQtyStandFan.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyStandFan.setEditable(false);

		txtQtyBrideTable = new JTextField("0");
		txtQtyBrideTable.setColumns(2);
		txtQtyBrideTable.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyBrideTable.setEditable(false);

		txtQtyPlasticChair = new JTextField("0");
		txtQtyPlasticChair.setColumns(2);
		txtQtyPlasticChair.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyPlasticChair.setEditable(false);

		txtQtyRoundTable = new JTextField("0");
		txtQtyRoundTable.setColumns(2);
		txtQtyRoundTable.setFont(new Font("Courier", Font.PLAIN, 14));
		txtQtyRoundTable.setEditable(false);

		txtTotalPackage = new JTextField();
		txtTotalPackage.setColumns(2);
		txtTotalPackage.setFont(new Font("Courier", Font.PLAIN, 14));
		txtTotalPackage.setEditable(false);
		txtTotalPackage.setBackground(Color.WHITE);

		txtTotalAddtional = new JTextField();
		txtTotalAddtional.setColumns(2);
		txtTotalAddtional.setFont(new Font("Courier", Font.PLAIN, 14));
		txtTotalAddtional.setEditable(false);
		txtTotalAddtional.setBackground(Color.WHITE);

		txtTotalPrice = new JTextField();
		txtTotalPrice.setColumns(2);
		txtTotalPrice.setFont(new Font("Courier", Font.PLAIN, 14));
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setBackground(Color.WHITE);

		txtTotalPriceSST = new JTextField();
		txtTotalPriceSST.setColumns(2);
		txtTotalPriceSST.setFont(new Font("Courier", Font.PLAIN, 14));
		txtTotalPriceSST.setEditable(false);
		txtTotalPriceSST.setBackground(Color.WHITE);

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
		txtAreaStandard.setText(
				"1 Arabian Canopy (20x20) + scallops\n40 Plastic Chair\n4 Round table + tablecloth\nFan + light");
		scrollStandard.setViewportView(txtAreaStandard);

		scrollPlatinum = new JScrollPane();
		txtAreaPlatinum = new JTextArea();
		txtAreaPlatinum.setEditable(false);
		txtAreaPlatinum.setColumns(20);
		txtAreaPlatinum.setRows(5);
		txtAreaPlatinum.setText(
				"1 Arabian Canopy (20x20) + scallops\n40 Plastic chair with fabric and ribbon\n4 round table + tablecloth\nFan + light");
		scrollPlatinum.setViewportView(txtAreaPlatinum);

		// Add button
		btnCalculate = new JButton("CALCULATE");
		btnClear = new JButton("CLEAR");

		// add Economy label
		contentPane.add(lblPackage);
		contentPane.add(lblQtyBook);
		contentPane.add(chkEconomy);
		contentPane.add(scrollEconomy);
		contentPane.add(txtQtyEconomy);

		contentPane.add(chkStandard);
		contentPane.add(scrollStandard);
		contentPane.add(txtQtyStandard);

		contentPane.add(chkPlatinum);
		contentPane.add(scrollPlatinum);
		contentPane.add(txtQtyPlatinum);

		contentPane.add(lblAdditional);
		contentPane.add(lblQtyAddtional);
		contentPane.add(chkCanopy);
		contentPane.add(chkStandFan);
		contentPane.add(chkBrideTable);
		contentPane.add(chkPlasticChair);
		contentPane.add(chkRound);
		contentPane.add(txtQtyCanopy);
		contentPane.add(txtQtyStandFan);
		contentPane.add(txtQtyBrideTable);
		contentPane.add(txtQtyPlasticChair);
		contentPane.add(txtQtyRoundTable);

		contentPane.add(lblTotalPackage);
		contentPane.add(lblTotalAddtional);
		contentPane.add(lblTotalPrice);
		contentPane.add(lblTotalPriceSST);
		contentPane.add(txtTotalPackage);
		contentPane.add(txtTotalAddtional);
		contentPane.add(txtTotalPrice);
		contentPane.add(txtTotalPriceSST);
		contentPane.add(lblPriceCalc);

		contentPane.add(btnCalculate);
		contentPane.add(btnClear);

		// add action Listener
		chkEconomy.addItemListener(new ItemListener() {
			// @Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyEconomy.setEditable(true);
				} else {
					txtQtyEconomy.setEditable(false);
					txtQtyEconomy.setText("0");
				}
			}

		});

		chkStandard.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyStandard.setEditable(true);
				} else {
					txtQtyStandard.setEditable(false);
					txtQtyStandard.setText("0");
				}
			}
		});

		chkPlatinum.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyPlatinum.setEditable(true);
				} else {
					txtQtyPlatinum.setEditable(false);
					txtQtyPlatinum.setText("0");
				}
			}
		});

		chkCanopy.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyCanopy.setEditable(true);
				} else {
					txtQtyCanopy.setEditable(false);
					txtQtyCanopy.setText("0");
				}
			}
		});

		chkStandFan.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyStandFan.setEditable(true);
				} else {
					txtQtyStandFan.setEditable(false);
					txtQtyStandFan.setText("0");
				}
			}
		});

		chkPlasticChair.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyPlasticChair.setEditable(true);
				} else {
					txtQtyPlasticChair.setEditable(false);
					txtQtyPlasticChair.setText("0");
				}
			}
		});

		chkRound.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyRoundTable.setEditable(true);
				} else {
					txtQtyRoundTable.setEditable(false);
					txtQtyRoundTable.setText("0");
				}
			}
		});

		chkBrideTable.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtQtyBrideTable.setEditable(true);
				} else {
					txtQtyBrideTable.setEditable(false);
					txtQtyBrideTable.setText("0");
				}
			}
		});
		chkEconomy.addActionListener(this);
		chkStandard.addActionListener(this);
		chkPlatinum.addActionListener(this);
		chkCanopy.addActionListener(this);
		chkStandFan.addActionListener(this);
		chkBrideTable.addActionListener(this);
		chkPlasticChair.addActionListener(this);
		chkRound.addActionListener(this);
		txtQtyEconomy.addActionListener(this);
		txtQtyStandard.addActionListener(this);
		txtQtyPlatinum.addActionListener(this);
		btnClear.addActionListener(this);
		btnCalculate.addActionListener(this);

		// Bound setting
		lblPackage.setBounds(10, 1, 800, 25);
		chkEconomy.setBounds(10, 25, 150, 25);
		chkStandard.setBounds(250, 25, 150, 25);
		chkPlatinum.setBounds(500, 25, 150, 25);
		scrollEconomy.setBounds(10, 50, 170, 100);
		scrollStandard.setBounds(250, 50, 170, 100);
		scrollPlatinum.setBounds(500, 50, 170, 100);

		lblQtyBook.setBounds(10, 155, 150, 25);
		txtQtyEconomy.setBounds(130, 155, 50, 25);
		txtQtyStandard.setBounds(370, 155, 50, 25);
		txtQtyPlatinum.setBounds(620, 155, 50, 25);

		lblAdditional.setBounds(10, 200, 150, 25);
		chkCanopy.setBounds(10, 225, 220, 25);
		chkStandFan.setBounds(10, 245, 220, 25);
		chkBrideTable.setBounds(10, 265, 220, 25);
		chkPlasticChair.setBounds(10, 285, 220, 25);
		chkRound.setBounds(10, 305, 220, 25);

		lblQtyAddtional.setBounds(250, 200, 150, 25);
		txtQtyCanopy.setBounds(250, 225, 70, 25);
		txtQtyStandFan.setBounds(250, 245, 70, 25);
		txtQtyBrideTable.setBounds(250, 265, 70, 25);
		txtQtyPlasticChair.setBounds(250, 285, 70, 25);
		txtQtyRoundTable.setBounds(250, 305, 70, 25);
		
		lblPriceCalc.setBounds(450,190,300,25);
		lblTotalPackage.setBounds(450, 220, 150, 25);
		lblTotalAddtional.setBounds(450, 240, 150, 25);
		lblTotalPrice.setBounds(450, 260, 150, 25);
		lblTotalPriceSST.setBounds(450, 280, 150, 25);

		txtTotalPackage.setBounds(600, 220, 150, 25);
		txtTotalAddtional.setBounds(600, 240, 150, 25);
		txtTotalPrice.setBounds(600, 260, 150, 25);
		txtTotalPriceSST.setBounds(600, 280, 150, 25);

		btnCalculate.setBounds(450, 320, 150, 25);
		btnClear.setBounds(600, 320, 150, 25);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnClear) {

			dispose();
		}
		double totPrice = 0.00;
		double totPckg = 0.00;
		int totqtyBook = 0;
		double totAddOn = 0.00;
		double totSst = 0.00;

		double totEco = 0.00;
		double totStdrd = 0.00;
		double totPltnm = 0.00;

		double totCanopy = 0.00;
		double totStandFan = 0.00;
		double totChair = 0.00;
		double totGTable = 0.00;
		double totRTable = 0.00;

		if (event.getSource() == btnCalculate) {
			// the input
			int qtyEco = Integer.parseInt(txtQtyEconomy.getText());
			int qtyStdrd = Integer.parseInt(txtQtyStandard.getText());
			int qtyPltnm = Integer.parseInt(txtQtyPlatinum.getText());
			/*
			 * if(chkEconomy.isSelected() && !chkStandard.isSelected() &&
			 * !chkPlatinum.isSelected()) { totPckg=300*qtyEco; }
			 * 
			 * else if(!chkEconomy.isSelected() && chkStandard.isSelected() &&
			 * !chkPlatinum.isSelected()) { totPckg=450*qtyStdrd; }
			 * 
			 * else if(!chkEconomy.isSelected() && !chkStandard.isSelected() &&
			 * chkPlatinum.isSelected()) { totPckg=600*qtyPltnm; }
			 * 
			 * else if(chkEconomy.isSelected() && chkStandard.isSelected() &&
			 * !chkPlatinum.isSelected()) { totPckg=(300*qtyEco)+(450*qtyStdrd); }
			 * 
			 * else if(chkEconomy.isSelected() && !chkStandard.isSelected() &&
			 * chkPlatinum.isSelected()) { totPckg=(300*qtyEco)+(600*qtyPltnm); }
			 * 
			 * else if(!chkEconomy.isSelected() && chkStandard.isSelected() &&
			 * chkPlatinum.isSelected()) { totPckg=450*qtyStdrd+(600*qtyPltnm); }
			 * 
			 * else if(chkEconomy.isSelected() && chkStandard.isSelected() &&
			 * chkPlatinum.isSelected()) {
			 * totPckg=(300*qtyEco)+(450*qtyStdrd)+(600*qtyPltnm); }
			 */
			totPckg = (300 * qtyEco) + (450 * qtyStdrd) + (600 * qtyPltnm);
			// quantity
			totqtyBook = totqtyBook + qtyEco + qtyStdrd + qtyPltnm;

			if (totqtyBook >= 5) {
				totPckg = totPckg * 0.90;
			}

			int qtyCanopy = Integer.parseInt(txtQtyCanopy.getText());
			int qtyStandFan = Integer.parseInt(txtQtyStandFan.getText());
			int qtyGTable = Integer.parseInt(txtQtyBrideTable.getText());
			int qtyChair = Integer.parseInt(txtQtyPlasticChair.getText());
			int qtyRTable = Integer.parseInt(txtQtyRoundTable.getText());
			
			totAddOn=(qtyCanopy*200)+(qtyStandFan*25)+(qtyGTable*200)+(qtyChair*1)+(qtyRTable*15);

			

			if (qtyChair >= 50 || qtyRTable >= 3) {
				totAddOn = totAddOn * 0.95;
			}

			totPrice = totPckg + totAddOn;

			totSst = totPrice * 1.06;

			txtTotalPackage.setText("RM " + df.format(totPckg));
			txtTotalAddtional.setText("RM " + df.format(totAddOn));
			txtTotalPrice.setText("RM " + df.format(totPrice));
			txtTotalPriceSST.setText("RM " + df.format(totSst));

		}
	}
}
