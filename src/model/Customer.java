package model;

import java.util.ArrayList;

public class Customer extends Person{
	private String customerCVR;
	private ArrayList<Order> purchaseHistory;
	
	
    public Customer(String name, String phoneNumber, String address, String customerCVR){
        super(name, phoneNumber, address);
        this.customerCVR = customerCVR;
    }
    
	public String getCustomerCVR() {
		return customerCVR;
	}
	public void setCustomerCVR(String customerCVR) {
		this.customerCVR = customerCVR;
	}
	public ArrayList<Order> getPurchaseHistory() {
		return purchaseHistory;
	}
	public void setPurchaseHistory(ArrayList<Order> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}

}
