import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){return name;}
    public double getPrice(){return price;}
    @Override
    public String toString(){
        return name+"($" + price + ")";
    }
}
class ShoppingCart{
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(String productName){
        products.removeIf(p ->p.getName().equalsIgnoreCase(productName));
    }
    public double calculateTotalCost(){
        double total=0;
        for (Product p:products)total+=p.getPrice();
        return total;
    }
    public void displayCart(){
        System.out.println("Items in Cart:");
        for(Product p:products)System.out.println("-"+p);
        System.out.println("Total Cost: $"+calculateTotalCost());
    }
}
public class ShoppingCartApp{
    public static void main(String[] args){
        ShoppingCart cart=new ShoppingCart();
        cart.addProduct(new Product("Laptop", 999.99));
        cart.addProduct(new Product("Mouse", 25.50));
        cart.addProduct(new Product("Keyboard", 45.00));
        System.out.println("Initial Cart:");
        cart.displayCart();
        System.out.println("\nRemoving 'Mouse':");
        cart.removeProduct("Mouse");
        cart.displayCart();
    }
}