import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

interface Taxable{
    double calculateTax();
}

abstract class Item implements Taxable{
    String itemid;
    String name;
    double baseprice;

    public Item(String itemid,String name,double baseprice){
        this.itemid=itemid;
        this.name=name;
        this.baseprice=baseprice;
    }
    public String getItemid() {
        return itemid;
    }
    public double getBaseprice() {
        return baseprice;
    }
    public double PricewithTax(){
        return baseprice+calculateTax();
    }
    public abstract void display();
}

class PerishableItem extends Item{
    LocalDate expirydate;
    public PerishableItem(String itemid,String name,double baseprice,LocalDate expirydate){
        super(itemid,name,baseprice);
        this.expirydate=expirydate;
    }
    @Override
    public double calculateTax() {
        return baseprice*0.05;}
    @Override
    public void display(){
        System.out.println("Item ID: "+itemid);
        System.out.println("Name: "+name);
        System.out.println("Base Price: "+baseprice);
        System.out.println("Expiry Date: "+expirydate);
    }
} 

class ElectronicItem extends Item{
    int warrantyperiod;
    public ElectronicItem(String itemid,String name,double baseprice,int warrantyperiod){
        super(itemid,name,baseprice);
        this.warrantyperiod=warrantyperiod;
    }
    @Override
    public double calculateTax(){
        return baseprice*0.15;
    }
    @Override
    public void display(){
        System.out.println("Item ID: "+itemid);
        System.out.println("Name: "+name);
        System.out.println("Base Price: "+baseprice);
        System.out.println("Warranty Period: "+warrantyperiod+" months");
    }
}

public class InventoryManager{
    public static HashMap<String,Item>inventory=new HashMap<>();

    public static void addItem(Item item){
        inventory.put(item.getItemid(),item);
    }
    
    public static void searchItem(String itemid){
        Item item=inventory.get(itemid);
        if(item!=null){
            item.display();
        }
        else{
            System.out.println("Item not found");
        }
    }
    public static void displayAllItems(){
        for(Item item:inventory.values()){
            item.display();
        }
    }
    public static void displaySortedbyPrice(){
        List<Item>itemList=new ArrayList<>(inventory.values());
        itemList.sort(Comparator.comparingDouble(Item::getBaseprice));
        for (Item item:itemList){
            item.display();
        }

    }
    public static double calculateTotalInventoryValue(){
        double total=0.0;
        for (Item item:inventory.values()){
            total=total+item.PricewithTax();
        }
        return total;
    }
    public static void main(String[] args){
        addItem(new PerishableItem("P001","Milk",2.5,LocalDate.of(2026,3,10)));
        addItem(new ElectronicItem("E501","Headphones",120,24));
        System.out.println("Inventory List:");
        displayAllItems();

        System.out.println("Item Search:");
        searchItem("E501");
        System.out.println("Sorted by price:");
        displaySortedbyPrice();
        System.out.printf(
            "Total Inventory value with tax: %.2f\n",
            calculateTotalInventoryValue()
        );
    }
}