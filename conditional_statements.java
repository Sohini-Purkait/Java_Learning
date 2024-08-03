import java.util.Scanner;
public class conditional_statements{
    public static void main(String args[])
    {
        boolean isSunUp = false;
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");
        

        int age = 20;
        if(age >= 18)
            System.out.println("can vote");
        else
            System.out.println("can't vote");


        //pen = 10; notebook = 40
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cash amount: ");
        int cash = sc.nextInt();
        if(cash < 10){
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }
        else if(cash > 10 && cash < 50){
            System.out.println("can get 1 thing");
        }
        else{
            System.out.println("can get both");
        }       
    }    
}
