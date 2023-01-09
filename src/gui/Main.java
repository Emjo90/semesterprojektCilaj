package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import controller.OrderController;
import controller.CustomerController;
import controller.ProductController;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.SpinnerListModel;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Main {

	private JFrame frmCilajCreate;
	private JTextField buyerName;
	private JTextField buyerAddress;
	private JTextField buyerCity;
	private JTextField buyerCountry;
	private JTextField buyerPostalCode;
	private JLabel lblSellerDetails;
	private JTextField sellerName;
	private JTextField sellerAddress;
	private JTextField sellerCity;
	private JTextField sellerCountry;
	private JTextField sellerPostalCode;
	private JSeparator separator_1;
	private JSeparator separator;
	private JSeparator separator_2;
	private JButton databaseSyncButton;
	private JLabel databaseStatus;
	private Choice productType;
	private JSpinner productAmount;
	private Choice productUnit;
	private JSpinner productTollerance;
	private Choice productDeliveryType;
	private JTextPane sellerEkstraInfo;
	private OrderController orderController = new OrderController();
	private CustomerController customerController = new CustomerController();
	private ProductController productController = new ProductController();
	private JTextField buyerPhoneNr;
	private JTextField sellerPhoneNr;
	private JTextField buyerCVR;
	private JTextField sellerCVR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmCilajCreate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCilajCreate = new JFrame();
		frmCilajCreate.setResizable(false);
		frmCilajCreate.setTitle("CILAJ - Create Order");
		frmCilajCreate.setBounds(100, 100, 623, 389);
		frmCilajCreate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCilajCreate.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buyer details");
		lblNewLabel.setBounds(10, 11, 110, 14);
		frmCilajCreate.getContentPane().add(lblNewLabel);
		
		buyerName = new JTextField();
		buyerName.setText("Name");
		buyerName.setBounds(10, 36, 194, 20);
		frmCilajCreate.getContentPane().add(buyerName);
		buyerName.setColumns(10);
		
		buyerAddress = new JTextField();
		buyerAddress.setText("Address");
		buyerAddress.setBounds(10, 98, 194, 20);
		frmCilajCreate.getContentPane().add(buyerAddress);
		buyerAddress.setColumns(10);
		
		buyerCity = new JTextField();
		buyerCity.setText("City");
		buyerCity.setBounds(10, 129, 110, 20);
		frmCilajCreate.getContentPane().add(buyerCity);
		buyerCity.setColumns(10);
		
		buyerCountry = new JTextField();
		buyerCountry.setText("Country");
		buyerCountry.setBounds(10, 160, 110, 20);
		frmCilajCreate.getContentPane().add(buyerCountry);
		buyerCountry.setColumns(10);
		
		buyerPostalCode = new JTextField();
		buyerPostalCode.setText("Postal code");
		buyerPostalCode.setBounds(130, 129, 74, 20);
		frmCilajCreate.getContentPane().add(buyerPostalCode);
		buyerPostalCode.setColumns(10);
		
		lblSellerDetails = new JLabel("Seller details");
		lblSellerDetails.setBounds(226, 11, 136, 14);
		frmCilajCreate.getContentPane().add(lblSellerDetails);
		
		sellerName = new JTextField();
		sellerName.setText("Name");
		sellerName.setColumns(10);
		sellerName.setBounds(226, 36, 194, 20);
		frmCilajCreate.getContentPane().add(sellerName);
		
		sellerAddress = new JTextField();
		sellerAddress.setText("Address");
		sellerAddress.setColumns(10);
		sellerAddress.setBounds(226, 98, 194, 20);
		frmCilajCreate.getContentPane().add(sellerAddress);
		
		sellerCity = new JTextField();
		sellerCity.setText("City");
		sellerCity.setColumns(10);
		sellerCity.setBounds(226, 129, 110, 20);
		frmCilajCreate.getContentPane().add(sellerCity);
		
		sellerCountry = new JTextField();
		sellerCountry.setText("Country");
		sellerCountry.setColumns(10);
		sellerCountry.setBounds(226, 160, 110, 20);
		frmCilajCreate.getContentPane().add(sellerCountry);
		
		sellerPostalCode = new JTextField();
		sellerPostalCode.setText("Postal code");
		sellerPostalCode.setColumns(10);
		sellerPostalCode.setBounds(346, 129, 74, 20);
		frmCilajCreate.getContentPane().add(sellerPostalCode);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(430, 0, 2, 422);
		frmCilajCreate.getContentPane().add(separator_1);
		
		separator = new JSeparator();
		separator.setBounds(2, 191, 430, 2);
		frmCilajCreate.getContentPane().add(separator);
		
		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(214, 0, 2, 193);
		frmCilajCreate.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setBounds(10, 204, 46, 14);
		frmCilajCreate.getContentPane().add(lblNewLabel_1);
		
		JButton cancelOrderButton = new JButton("Cancel");
		cancelOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCilajCreate.dispose();
			}
		});
		cancelOrderButton.setBounds(442, 296, 152, 43);
		frmCilajCreate.getContentPane().add(cancelOrderButton);
		
		JButton createOrderButton = new JButton("Create order");
		createOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveOrder();
			}
		});
		createOrderButton.setBounds(442, 242, 152, 43);
		frmCilajCreate.getContentPane().add(createOrderButton);
		
		productType = new Choice();
		productType.setBounds(10, 224, 194, 20);
		frmCilajCreate.getContentPane().add(productType);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setBounds(10, 250, 46, 14);
		frmCilajCreate.getContentPane().add(lblNewLabel_2);
		
		productAmount = new JSpinner();
		productAmount.setBounds(10, 268, 71, 20);
		frmCilajCreate.getContentPane().add(productAmount);
		
		productUnit = new Choice();
		productUnit.setBounds(87, 268, 40, 20);
		frmCilajCreate.getContentPane().add(productUnit);
		
		productTollerance = new JSpinner();
		productTollerance.setBounds(133, 268, 71, 20);
		frmCilajCreate.getContentPane().add(productTollerance);
		
		JLabel lblNewLabel_3 = new JLabel("Unit");
		lblNewLabel_3.setBounds(87, 250, 30, 14);
		frmCilajCreate.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tollerance (%)");
		lblNewLabel_4.setBounds(130, 250, 86, 14);
		frmCilajCreate.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mode of delivery");
		lblNewLabel_5.setBounds(10, 299, 194, 14);
		frmCilajCreate.getContentPane().add(lblNewLabel_5);
		
		productDeliveryType = new Choice();
		productDeliveryType.setBounds(10, 319, 194, 20);
		frmCilajCreate.getContentPane().add(productDeliveryType);
		
		JLabel lblNewLabel_6 = new JLabel("Seller ekstra info");
		lblNewLabel_6.setBounds(226, 204, 136, 14);
		frmCilajCreate.getContentPane().add(lblNewLabel_6);
		
		sellerEkstraInfo = new JTextPane();
		sellerEkstraInfo.setBounds(226, 224, 194, 115);
		frmCilajCreate.getContentPane().add(sellerEkstraInfo);
		
		databaseSyncButton = new JButton("Sync to database");
		databaseSyncButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				syncToDB();
			}
		});
		databaseSyncButton.setBounds(442, 25, 152, 43);
		frmCilajCreate.getContentPane().add(databaseSyncButton);
		
		databaseStatus = new JLabel("Database status: OFFLINE");
		databaseStatus.setBounds(442, 11, 152, 14);
		frmCilajCreate.getContentPane().add(databaseStatus);
		
		buyerPhoneNr = new JTextField();
		buyerPhoneNr.setText("Phone Nr.");
		buyerPhoneNr.setColumns(10);
		buyerPhoneNr.setBounds(10, 67, 194, 20);
		frmCilajCreate.getContentPane().add(buyerPhoneNr);
		
		sellerPhoneNr = new JTextField();
		sellerPhoneNr.setText("Phone Nr.");
		sellerPhoneNr.setColumns(10);
		sellerPhoneNr.setBounds(226, 67, 194, 20);
		frmCilajCreate.getContentPane().add(sellerPhoneNr);
		
		buyerCVR = new JTextField();
		buyerCVR.setText("CVR");
		buyerCVR.setColumns(10);
		buyerCVR.setBounds(130, 160, 74, 20);
		frmCilajCreate.getContentPane().add(buyerCVR);
		
		sellerCVR = new JTextField();
		sellerCVR.setText("CVR");
		sellerCVR.setColumns(10);
		sellerCVR.setBounds(346, 160, 74, 20);
		frmCilajCreate.getContentPane().add(sellerCVR);
	}
	
	private void syncToDB() { // Contacts product controller to populate the GUI lists with product options
		 databaseStatus.setText("Database status: SYNCED");
		 String[] pTypes = {"Fatty Acids (Animal)","Fatty Acids (Plant)","Fatty Acids (Biofuel)"};
		 String[] uOMeasure = {"mt","t","kg"};
		 String[] mODelivery = {"Tank Truck","Barrels","Containers"};
		 populateGUI(pTypes, uOMeasure, mODelivery);
	}
	
	private void saveOrder() { // Uses the order controller to send new order data to the DB
		orderController.saveOrder(
				customerController.createCustomer(
						buyerName.getText(), 
						buyerPhoneNr.getText(), 
						buyerAddress.getText()+", "+buyerPostalCode.getText()+" "+buyerCity.getText()+", "+buyerCountry.getText(), 
						buyerCVR.getText()
				), 
				customerController.createCustomer(
						sellerName.getText(), 
						sellerPhoneNr.getText(), 
						sellerAddress.getText()+", "+sellerPostalCode.getText()+" "+sellerCity.getText()+", "+sellerCountry.getText(), 
						sellerCVR.getText()
				),
				productController.createProduct(
						productType.getSelectedItem(),
						(int)productAmount.getValue(),
						null)
				);
	}
	
	private void populateGUI(String[] productTypes, String[] unitsOfMeasure, String[] modesOfDelivery) { // Populates the GUI lists with provided data
		for (String string : productTypes) {
			productType.add(string);
		}
		for (String string : unitsOfMeasure) {
			productUnit.add(string);
		}
		for (String string : modesOfDelivery) {
			productDeliveryType.add(string);
		}
	}
}
