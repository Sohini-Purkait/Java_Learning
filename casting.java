class casting{
    public static void main(String args[])
    {
        //casting = conversion from one data type to another. Two types:= Implicit and explicit

        //Implicit casting(small byte stored in larger byte e.g: int to double)
        double price = 100.00;
        double finalPrice = price + 18;

        System.out.println(finalPrice); //118.0

        //Explicit casting(larger byte stored in smaller byte e.g: double to int)
        int p = 100;
        int fp = p + (int)18.99;
        System.out.println(fp); //118

    }    
}
