import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mongo");
        System.out.println("Fruits:"+fruits);
        fruits.remove("Banana");
        System.out.println("Fruits: "+fruits);
        System.out.println("Size :"+fruits.size());
        System.out.println("Fruits have apple?"+fruits.contains("Apple"));

    }
}