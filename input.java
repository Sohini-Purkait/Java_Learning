import java.util.Scanner;

class input{
    public static void main(String args[])
    {
       //How to take INPUT?
       Scanner sc = new Scanner(System.in);
       System.out.println("Input your Age: ");
       int age = sc.nextInt();
       System.out.println(age);

       Scanner scn = new Scanner(System.in);
       System.out.println("Input your Height: ");
       float height = scn.nextFloat();
       System.out.println(height);

       Scanner sn = new Scanner(System.in);
       System.out.println("Input your Name: ");
       String name = sn.next();
       System.out.println(name); //if input is "Sohini good girl" then output is"Sohini"

       Scanner snl = new Scanner(System.in);
       System.out.println("Input your line: ");
       String line = snl.nextLine();
       System.out.println(line); //if input is "Sohini good girl" then output is"Sohini good girl"



    }    
}
