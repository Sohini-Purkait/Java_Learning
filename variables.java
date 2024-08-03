public class variables{
    public static void main(String[] args){
        // variables
        // String name = "Sohini";
        int age = 20;
        String neighbour = "Akku";
        String friend = neighbour;

        //data types:= Primitive(simple values stored) & Non primitive / Reference(complex vlaues stored)

        /*
        byte - 1[-128 to 127]
        short - 2
        int - 4
        long - 8
        float - 4
        double - 8
        char - 2
        boolean - 1
        */

        //primitive data types 
       //byte age = 12;
       int phone = 1234567890;
       long phone2 = 123456789000L;
       float pi = 3.14F;
       char letter = '@';
       boolean isAdult = false;

        //non primitive data types
        String name = "Sohini";
        String frnd = new String("Sneha"); //not compulsory to use new keyword

        System.out.println(name.length());
        System.out.println(frnd);
    }
}