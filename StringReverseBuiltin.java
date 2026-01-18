public class StringReverseBuiltin{
    public static void main(String[] args){
        String str="hello";

        String reverse= new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}