import java.util.Vector;
public class VectorExample{
    public static void main(String[] arrgs){
        Vector<Integer> numbers=new Vector<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("Vector:"+numbers);
        numbers.remove(1);
        System.out.println("Numbers after removing index 1:"+numbers);
        System.out.println("Size:"+numbers.size());
        System.out.println("Element at index zero:"+numbers.get(0));
    }
}