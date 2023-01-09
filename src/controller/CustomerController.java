package controller;
import model.*;

public class CustomerController {

    public Customer findCustomer(String phoneNumber){
        return CustomerContainer.getInstance().getCustomer(phoneNumber);       
    }
    
    public boolean createCustomer(String name, String phoneNumber, String address,String customerCVR){
        Customer c = new Customer(name, phoneNumber, address, customerCVR);
        return CustomerContainer.getInstance().addCustomer(phoneNumber, c);
    }
    
    public boolean updateCustomer(String phoneNumber, Customer newData){
        boolean updatedSuccessfully = false;
        Customer oldData = CustomerContainer.getInstance().getCustomer(phoneNumber);


        if (newData.getName() == null){
            newData.setName(oldData.getName());
        }
        if (newData.getPhoneNumber() == null){
            newData.setPhoneNumber(oldData.getPhoneNumber());
        } else { 
            CustomerContainer.getInstance().removeCustomer(phoneNumber);
            phoneNumber = newData.getPhoneNumber();
        }
        if (newData.getAddress() == null){
            newData.setAddress(oldData.getAddress());
        }
        if (newData.getCustomerCVR() == null) {
        	newData.setCustomerCVR(oldData.getCustomerCVR());
        }


        CustomerContainer.getInstance().addCustomer(phoneNumber, newData);
        if (CustomerContainer.getInstance().getCustomer(phoneNumber).equals(newData)){ 
            updatedSuccessfully = true;
        }

        return updatedSuccessfully;
    }
    
    public boolean deleteCustomer(String phoneNumber){
        return CustomerContainer.getInstance().removeCustomer(phoneNumber);
    }

	
}
