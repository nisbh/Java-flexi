public class CommandLineAdd {
    static void area(int length, int width) {
        int result = length * width;
        System.out.println("Area = " + result);
    }
    public static void main(String args[]) {
        int l = Integer.parseInt(args[0]);    //taking input from command line
        int w = Integer.parseInt(args[1]);    //taking input from command line
        area(l, w);
    }
}