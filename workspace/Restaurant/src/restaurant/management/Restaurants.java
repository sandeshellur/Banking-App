package restaurant.management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.FlowLayout;

public class Restaurants {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	double Indian_Rupee = 1;
	double US_Dollar = 75;
	double UnitedKingdom_D = 66;
	double Europe_Euro = 48;
	double Indonesia_Rupiah = 12;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel.setBounds(36, 57, 518, 236);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblVegBurger = new JLabel("Veg Burger");
		lblVegBurger.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblVegBurger.setBounds(25, 29, 200, 30);
		panel.add(lblVegBurger);

		JLabel lblVegBurgerMeal = new JLabel("Veg Burger Meal");
		lblVegBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblVegBurgerMeal.setBounds(25, 113, 200, 30);
		panel.add(lblVegBurgerMeal);

		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblCheeseBurger.setBounds(25, 70, 200, 30);
		panel.add(lblCheeseBurger);

		final JLabel label = new JLabel("");
		label.setBounds(335, 42, 46, 14);
		panel.add(label);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(321, 28, 154, 31);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(321, 67, 154, 31);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(321, 112, 154, 31);
		panel.add(textField_2);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {
				"Select a Drink", "coke", "pepsi", "sprite", "Tea", "Coffee" }));
		comboBox.setBounds(25, 183, 168, 20);
		panel.add(comboBox);

		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDrink.setBounds(25, 158, 61, 20);
		panel.add(lblDrink);

		textField_4 = new JTextField();
		textField_4.setBounds(321, 183, 122, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQty.setBounds(321, 154, 46, 23);
		panel.add(lblQty);

		final JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setBounds(25, 206, 122, 23);
		panel.add(chckbxHomeDelivery);

		final JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setBounds(321, 206, 97, 23);
		panel.add(chckbxTax);

		JSeparator separator = new JSeparator();
		separator.setBounds(25, 154, 450, 1);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(192, 154, 1, 1);
		panel.add(separator_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_1.setBounds(564, 57, 388, 236);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblCureencyConverter = new JLabel("Currency Converter");
		lblCureencyConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCureencyConverter.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCureencyConverter.setBounds(98, 11, 193, 24);
		panel_1.add(lblCureencyConverter);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
				"Select One", "India", "USA", "United Kingdom", "Europe",
				"Indonesia" }));
		comboBox_1.setBounds(86, 46, 220, 31);
		panel_1.add(comboBox_1);

		textField_5 = new JTextField();
		textField_5.setBounds(86, 88, 220, 31);
		panel_1.add(textField_5);
		textField_5.setColumns(10);

		final JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_11.setBounds(86, 130, 220, 28);
		panel_1.add(label_11);

		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Rupees = Double.parseDouble(textField_5.getText());
				if (comboBox_1.getSelectedItem().equals("India")) {
					String cConvert = String.format("Rs. %.2f", Rupees
							* Indian_Rupee);
					label_11.setText(cConvert);
				}
				if (comboBox_1.getSelectedItem().equals("USA")) {
					String cConvert_1 = String.format("$ %.2f", Rupees
							* US_Dollar);
					label_11.setText(cConvert_1);
				}
				if (comboBox_1.getSelectedItem().equals("United Kingdom")) {
					String cConvert_2 = String.format("UK %.2f", Rupees
							* UnitedKingdom_D);
					label_11.setText(cConvert_2);
				}
				if (comboBox_1.getSelectedItem().equals("Europe")) {
					String cConvert_3 = String.format("E %.2f", Rupees
							* Europe_Euro);
					label_11.setText(cConvert_3);
				}
				if (comboBox_1.getSelectedItem().equals("Indonesia")) {
					String cConvert_4 = String.format("I %.2f", Rupees
							* Indonesia_Rupiah);
					label_11.setText(cConvert_4);
				}
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConvert.setBounds(60, 182, 89, 23);
		panel_1.add(btnConvert);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_5.setText(null);
				label_11.setText(null);
				comboBox_1.setSelectedItem("Select One");
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClose.setBounds(245, 182, 89, 23);
		panel_1.add(btnClose);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_2.setBounds(36, 304, 518, 176);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCostOfDrinks.setBounds(30, 11, 168, 31);
		panel_2.add(lblCostOfDrinks);

		final JLabel label_2 = new JLabel("Cost of Meals");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(30, 53, 205, 31);
		panel_2.add(label_2);

		final JLabel label_3 = new JLabel("Cost of Delivery");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_3.setBounds(30, 95, 179, 31);
		panel_2.add(label_3);

		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(323, 11, 156, 28);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(lblNewLabel_1);

		final JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_1.setBounds(323, 53, 156, 28);
		panel_2.add(label_1);

		final JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(323, 98, 156, 28);
		panel_2.add(label_4);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_3.setBounds(564, 304, 388, 176);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		final JLabel label_5 = new JLabel("Tax");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_5.setBounds(20, 22, 168, 31);
		panel_3.add(label_5);

		final JLabel label_6 = new JLabel("Sub-Total");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_6.setBounds(20, 64, 205, 31);
		panel_3.add(label_6);

		final JLabel label_7 = new JLabel("Total");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_7.setBounds(20, 106, 179, 31);
		panel_3.add(label_7);

		final JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_8.setBounds(198, 22, 156, 28);
		panel_3.add(label_8);

		final JLabel label_9 = new JLabel("");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_9.setBounds(198, 67, 156, 28);
		panel_3.add(label_9);

		final JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_10.setBounds(198, 109, 156, 28);
		panel_3.add(label_10);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_4.setBounds(962, 57, 313, 423);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 43, 271, 358);
		panel_4.add(tabbedPane);

		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 11, 246, 308);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_5.setBounds(36, 491, 1239, 128);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);

		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.exit(0);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(764, 44, 89, 23);
		panel_5.add(button);

		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				label.setText(null);
				lblNewLabel_1.setText(null);
				label_1.setText(null);
				label_4.setText(null);
				label_8.setText(null);
				label_9.setText(null);
				label_10.setText(null);
				label_11.setText(null);
				comboBox.setSelectedItem("Select a drink");
				comboBox_1.setSelectedItem("Select One");

			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_1.setBounds(596, 44, 89, 23);
		panel_5.add(button_1);

		JButton button_2 = new JButton("Receipt");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Qty1 = Double.parseDouble(textField.getText());
				double Qty2 = Double.parseDouble(textField_1.getText());
				double Qty3 = Double.parseDouble(textField_2.getText());
				textField_3.setText("\t\nRestaurant Management Systems :\n"
						+ "Veg Burger :\t\t" + Qty1 + "\nCheese Burger :\t\t"
						+ Qty2 + "\nVeg Burger Meal :\t\t" + Qty3
						+ "\nThank You for using our Service");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_2.setBounds(436, 44, 105, 23);
		panel_5.add(button_2);

		JButton button_3 = new JButton("Total");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double vegBurger = Double.parseDouble(textField.getText());
				double vegbur = 30;
				double Burger;
				Burger = (vegBurger * vegbur);
				String pMeal = String.format("%.2f", Burger);
				label_1.setText(pMeal);

				double vegBurgerMeal = Double.parseDouble(textField_2.getText());
				double vegburMeal = 60;
				double BurgerMeal;
				BurgerMeal = (vegBurgerMeal * vegburMeal);
				String vbMeal = String.format("%.2f", BurgerMeal + Burger);
				label_1.setText(vbMeal);

				double CheeseBurger = Double.parseDouble(textField_1.getText());
				double CheeseMeal = 100;
				double CheeseBur;
				CheeseBur = (CheeseBurger * CheeseMeal);
				String cheese = String.format("%.2f", BurgerMeal + Burger
						+ CheeseBur);
				label_1.setText(cheese);
				// ----------------------Delivery------------------//
				double delivery = 35;
				if (chckbxHomeDelivery.isSelected()) {
					String pDelivery = String.format("%.2f", delivery);
					label_4.setText(pDelivery);
				} else {
					label_4.setText("0");
				}

				// ------------------Drinks-----------------//

				double Drinks = Double.parseDouble(textField_4.getText());
				double coke = 15 * Drinks;
				double pepsi = 15 * Drinks;
				double sprite = 15 * Drinks;
				double Tea = 10 * Drinks;
				double Coffee = 12 * Drinks;

				if (comboBox.getSelectedItem().equals("coke")) {
					String cCoke = String.format("%.2f", coke);
					lblNewLabel_1.setText(cCoke);
				}
				if (comboBox.getSelectedItem().equals("pepsi")) {
					String cPepsi = String.format("%.2f", pepsi);
					lblNewLabel_1.setText(cPepsi);
				}
				if (comboBox.getSelectedItem().equals("sprite")) {
					String cSprite = String.format("%.2f", sprite);
					lblNewLabel_1.setText(cSprite);
				}
				if (comboBox.getSelectedItem().equals("Tea")) {
					String cTea = String.format("%.2f", Tea);
					lblNewLabel_1.setText(cTea);
				}
				if (comboBox.getSelectedItem().equals("Coffee")) {
					String cCoffee = String.format("%.2f", Coffee);
					lblNewLabel_1.setText(cCoffee);
				}
				if (comboBox.getSelectedItem().equals("Select a Drink")) {
					lblNewLabel_1.setText("0");
				}

				// -------------Tax Rate-------------//

				double cTotal1 = Double.parseDouble(lblNewLabel_1.getText());
				double cTotal2 = Double.parseDouble(label_1.getText());
				double cTotal3 = Double.parseDouble(label_4.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3) * 0.16;
				if (chckbxTax.isSelected()) {
					String iTotal = String.format("%.2f", AllTotal);
					label_8.setText(iTotal);
				}
				double cTotal4 = Double.parseDouble(label_8.getText());

				double subtotal = (cTotal1 + cTotal2 + cTotal3);
				String iSubtotal = String.format("Rs. %.2f", subtotal);
				label_9.setText(iSubtotal);

				double total = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String itotal = String.format("Rs. %.2f", total);
				label_10.setText(itotal);

				String itaxtotal = String.format("Rs. %.2f", cTotal4);
				label_8.setText(itaxtotal);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_3.setBounds(288, 44, 89, 23);
		panel_5.add(button_3);

		JLabel lblNewLabel = new JLabel("RESTAURANT MANAGEMENT SYSTEMS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(239, 11, 797, 35);
		frame.getContentPane().add(lblNewLabel);
	}
}
