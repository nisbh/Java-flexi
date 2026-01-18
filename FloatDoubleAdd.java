
public class FloatDoubleAdd{
    static float[] getvalues(float x,float y){
        return new float[]{x+y};
    }
    public static void main(String[] args){
        
        float a=2.4f;
        float b=34.3f;
        float[] values=getvalues(a,b);
        double sum=(double) values[0];
        System.out.println("Sum="+sum);
    }
}