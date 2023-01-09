package controller;

import model.*;

public class ProductController {
	
    public Product findProduct(String id){
        return ProductContainer.getInstance().getProduct(id);
    }
    
    public Product createProduct(String name, int amount, String unit, int tolerance){
    	double priceCost = 0;
        return new Product(name, amount, priceCost, id);
    }
    
    public boolean updateProduct(){
        return true;
    }
    
    public boolean deleteProduct(String barcode){
        return ProductContainer.getInstance().removeProduct(barcode);
    }

    public int getNewProductNumber(){
        return ProductContainer.getInstance().getNewProductNumber();
    }
	
}
