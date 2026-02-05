final class FinalClass{
    final int max=100;
    final void display(){
        System.out.println("Final variable value:"+max);
    }
    public static void main(String[] args){
        FinalClass obj=new FinalClass();
        obj.display();
    }
}