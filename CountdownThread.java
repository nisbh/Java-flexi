public class CountdownThread{
    public static void main(String[] args){
                new Thread(() -> {
            for(int i=5; i>0;i--){
                System.out.println(i);
                try{
                    Thread.sleep(1000); 
                } catch(InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
            System.out.println("Done!");
        }).start();
    }
}