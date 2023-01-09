package model;
import java.util.HashMap;

public class ProductContainer {
    private HashMap<String, Product> products;
    private static ProductContainer instance;
    
    private ProductContainer(){
        products = new HashMap<>();
    }
    
    public static ProductContainer getInstance(){
        if(instance == null){
            instance = new ProductContainer();
        }
        return instance;
    }
    
    public boolean addProduct(String id, Product p){
        if(instance != null){
            products.put(id, p);
        }
        else{
            return false;
        }
        return true;
    }
    
    public boolean removeProduct(String id){
        if(products != null){
            products.remove(id);
        }else{
            return false;
        }
        return true; 
    }
    
    public Product getProduct(String id){
        Product product = null;
        if(products.containsKey(id)){
            product = products.get(id);
        }
        return product;
    }
    
    public int getNewProductNumber() {
    	return (products.size()+1);
    }
}
