//Strings are immutable in java
public class string{
    public static void main(String args[])
    {
        // String concatenation
        String name1 = "Sohini";
        String name2 = "Swarnava";
        String name3 = name1 + " And " + name2;
        System.out.println(name3);

        //charAt
        System.out.println(name1.charAt(0)); //java is 0 index based language
        
        //length
        System.out.println(name1.length());

        //replace
        String newName = name1.replace('i', 'e');
        System.out.println(newName); //Sohene

        String line = "I love India";
        System.out.println(line.substring(2, 6)); //upper bound exclusive

        System.out.println(line); //Strings are immutable in java
    }    
}
