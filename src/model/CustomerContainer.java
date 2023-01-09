package model;

import java.util.HashMap;

public class CustomerContainer {
	private HashMap<String, Customer> customers;
	private static CustomerContainer instance;
	
    private CustomerContainer(){
        customers = new HashMap<>();
    }
	
    public static CustomerContainer getInstance(){
        if(instance == null){
            instance = new CustomerContainer();
        }
        return instance;
    }

    public boolean addCustomer(String phoneNumber, Customer customer){
        boolean added = false;
        if(instance != null){
            customers.put(phoneNumber, customer);
            if (customers.containsKey(phoneNumber)){
                added = true;
            }
        }
        return added;
    }
    
    public boolean removeCustomer(String phoneNumber){
        boolean removed = false;
        if(customers != null){
            customers.remove(phoneNumber);
            if (!customers.containsKey(phoneNumber)){
                removed = true;
            }
        }
        return removed; 
    }
    
    public Customer getCustomer(String phoneNumber){  
        Customer customer = null;
        if(customers.containsKey(phoneNumber)){
            customer = customers.get(phoneNumber);
        }
        return customer;
    }
}
