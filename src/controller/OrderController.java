package controller;
import db.OrderDB;
import model.*;

public class OrderController {
    private OrderDB oDB;
    
    public OrderController(){
        oDB = new OrderDB();
    }
	
    public boolean saveOrder(Customer customer, Customer seller, Product product) {
    	boolean success = false;
    	
    	return success;
    }


}
