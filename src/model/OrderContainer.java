package model;

import java.util.ArrayList;

public class OrderContainer {
	
	private ArrayList<Order> orders;
	private static OrderContainer instance;
	
    private OrderContainer(){
        orders = new ArrayList<>();
    }
    
    public static OrderContainer getInstance(){
        if(instance == null){
            instance = new OrderContainer();
        }
        return instance;

    }
    
    public boolean addOrder(Order order){
        boolean added = false;
        if(instance != null){
            orders.add(order);
            if (orders.contains(order)){
                added = true;
            }
        }
        return added;
    }
    
    public boolean removeOrder(int orderNumber){
        boolean removed = false;
        if(orders != null){
            orders.remove(orderNumber);
            if (!orders.contains(orders.get(orderNumber))){
                removed = true;
            }
        }
        return removed; 
    }
    
    public Order getOrder(int orderNumber){  
        Order order = null;
        if(orders.contains(orders.get(orderNumber))){
        	order = orders.get(orderNumber);
        }
        return order;
    }
    
    public Order getMostRecentOrder() {
    	Order order = null;
    	order = orders.get(orders.size()-1);
    	return order;
    }
    
    public ArrayList<Order> getOrdersFrom(String phoneNumber){
        ArrayList<Order> list = new ArrayList<>();
        
        for(int i=0; i<orders.size(); i++) {
        	if(orders.get(i).getCustomer().getPhoneNumber()==phoneNumber) {
        		list.add(orders.get(i));
        	}
        }
        return list;
    }
    
    public int getAmountOfOrders() {
    	int amountOfOrders = getAmountOfOrders();
    	return amountOfOrders;
    }
    

    
}
