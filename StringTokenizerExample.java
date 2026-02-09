import java.util.StringTokenizer;
public class StringTokenizerExample{
    public static void main(String[] args){
        String str="Java,Python,CPP,JS";
        StringTokenizer st=new StringTokenizer(str,",");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}