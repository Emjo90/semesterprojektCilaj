package ui;
import controller.*;
import java.util.Scanner;

//
// This file is depricated and should never be used by the software
//

public class mainUI {
    private OrderController orderController;
    private ProductController productController;
    private PersonController personController;



    public mainUI() {
        orderController = new OrderController();
        productController = new ProductController();
        personController = new PersonController();
    }
    
    public void start() {
        MainMenu();
    }
    
    
    private void MainMenu() {
        boolean running = true;
        while (running) {
            int input = writeMainMenu();
            switch (input) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    createCustomer();
                    break;
                case 3:
                    addProduct();
                    break;
                case 4:
                    getCustomerInformation();
                    break;
                default:
                    System.out.println("Fejl i dit input. Forkert tal?");
                    break;
            }
        }
    }

    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println(" 1: Opret Ordre");
        System.out.println(" 2: Opret Kunde");
        System.out.println(" 3: Tilføj produkt til ordre");
        System.out.println(" 4: Find Kunde Information");
        System.out.println("Skriv tal:");
        int choice = getNumber(keyboard);
        keyboard.close();
        return choice;
    }

    private void createOrder() {
        String phoneNumber = writeCustomerPhoneNumber();
        if (orderController.createOrder(phoneNumber)){
            System.out.println("En ordre er lavet for "+personController.findCustomer(phoneNumber).getName());
        } else {
            System.out.println("Fejl! Ordren kunne ikke oprettes. Har du skrevet det rigtige telefonnummer?");
        }
    }
    
    private void addProduct() {
        String productID = writeProductID();
        if (orderController.addProduct(productID)){
            System.out.println("Tilføjede "+productController.findProduct(productID).getName()+" til ordren.");
        } else {
            System.out.println("Fejl! Opret først en ordre!");
        }
    }
    
    private void createCustomer(){
        String name = writeCustomerName();
        String phoneNumber = writeCustomerPhoneNumber();
        String address = writeCustomerAddress();
        String customerCVR = writeCustomerCVR();
        personController.createCustomer(name, phoneNumber, address, customerCVR);
    }
    
    private void getCustomerInformation(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Skriv kundens telefonnummer");
        String phoneNumber = keyboard.nextLine();
        System.out.println(" Kunde information:");
        System.out.println("Kundens navn: "+personController.findCustomer(phoneNumber).getName());
        System.out.println("Kundens telefonnummer: "+personController.findCustomer(phoneNumber).getPhoneNumber());
        System.out.println("Kundens addresse: "+personController.findCustomer(phoneNumber).getAddress());
        System.out.println("Kundens CVR: "+personController.findCustomer(phoneNumber).getCustomerCVR());
        keyboard.close();
    }



    private String writeProductID() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Skriv produktets ID:");
        String input = keyboard.nextLine();
        keyboard.close();
        return input;
    }


    private String writeCustomerName(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Skriv kundenavn");
        String customerName = keyboard.nextLine();
        keyboard.close();
        return customerName;
    }

    private String writeCustomerPhoneNumber(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Skriv kundens telefonnummer");
        String customerPhoneNumber = keyboard.nextLine();
        keyboard.close();
        return customerPhoneNumber;
    }

    private String writeCustomerAddress(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Skriv kundens addresse");
        String customerAddress = keyboard.nextLine();
        keyboard.close();
        return customerAddress;
    }
    
    private String writeCustomerCVR(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Skriv kundens CVR");
        String customerCVR = keyboard.nextLine();
        keyboard.close();
        return customerCVR;
    }



    
    private int getNumber(Scanner keyboard) {
    	int number = 0;
    	while (!keyboard.hasNextInt()) {
    		System.out.println("Input kan kun være tal. Prøv igen.");
    		keyboard.nextLine();
    	}
    	number = keyboard.nextInt();
    	return number;
    }
}
