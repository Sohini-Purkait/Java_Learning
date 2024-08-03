import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        //1-100
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        //100-1
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

        //while loop
        int i = 10;
        while(i >= 1){
            System.out.println(i);
            i--;
        }

        //do while loop
        int j = 5; 
        do{
            System.out.println(j);
            j--;
        } while(j >= 0);


        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            System.out.print("You entered number: ");
            System.out.println(number);
        } while(number >= 0);
        System.out.println("The end"); //enter -1 to exit loop in the terminal
        
    }
        
        
}
