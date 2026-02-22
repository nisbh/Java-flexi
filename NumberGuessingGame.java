import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args){
        Random rand=new Random();
        int number=rand.nextInt(100)+1;
        int attempts=5;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=attempts;i++){
            System.out.print("Enter your guess:");
            int guess=sc.nextInt();
            if (guess>number){
                System.out.println("Too high");
            } 
            else if(guess<number){
                System.out.println("Too low");
            } 
            else{
                System.out.println("Correct");
                sc.close();
                return;
            }
        }
        System.out.println("Game Over.The number was "+number);
        sc.close();
    }
}