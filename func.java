public class func {
    public static void printJava()
    {
        System.out.println("Hello Java");
    }

    public static void printName(String name)
    {
        System.out.println("Hello "+name);
    }

    public static void printSum(int a, int b)
    {
        System.out.println("Sum is: "+(a+b));
    }
    


    public static void main(String args[])
    {
        //METHODS
        printJava(); //calling the function
        printName("Sohini");
        printName("Hini");
        printSum(1, 3);
        
    }    
}