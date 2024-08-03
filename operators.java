class operators{
    public static void main(String args[])
    {
       //arithmatic operator
       int a = 1;
       int b = 2;
       int div = a / b;
       System.out.println(div); // 0 not 0.5 since int

       //unary operator
       int num = 1;
       System.out.println(num++); //1
       System.out.println(num); //2
       System.out.println(++num); //3
       
        //Comparison operator
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b
       
       //logical operators
        // && || !

        int x = 30;
        int y = 40;
        
        if(x < 50 && y < 50)
            System.out.println("Both less than 50");
        if(x < 50 || y < 50)
            System.out.println("Atleast one less than 50");

        boolean isAdult = false;       //is adult
        if(!isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult");

    }    
}
