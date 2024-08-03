import java.util.Scanner;

public class project {
    public static void main(String args[])
    {
        //MINI METHODS: guess random number
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNunmber = 0;

        do{
            System.out.println("Guess my number: ");
            userNunmber = sc.nextInt();

            if(userNunmber == myNumber)
            {
                System.out.println("WO0HOO...You guessed it right!");
                break;
            }
            else if(userNunmber > myNumber)
            {
                System.out.println("Your number is too large");
            }
            else
            {
                System.out.println("Your number is too small");
            }
        }while(userNunmber >= 0);

        System.out.println("My number was: "+myNumber);

        
    }    
}