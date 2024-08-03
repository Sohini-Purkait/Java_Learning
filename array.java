import java.util.Arrays;
public class array{
    public static void main(String args[])
    {    
        int[] score = {90, 80, 99}; //direct method of creating an array

        // Declare
        int[] marks = new int[3]; 
        // storing values
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        //accessing values
        System.out.println(marks[1]);

        //length
        System.out.println(marks.length); //3 (since length is a property of array () is not used)

        //sort
        System.out.println(marks[0]); //97
        Arrays.sort(marks); //import package to use it
        System.out.println(marks[0]); //95

        // if values not assigned in array it gets initialisec with 0 for int , false for boolean

        int[] subject = new int[3];  
        System.out.println(subject[1]); //0

        boolean[] sub = new boolean[3];  
        System.out.println(sub[1]); //false

        //2D-Array
        int[][] finalMarks = {{98, 89, 87}, {94, 96, 90}};
        System.out.println(finalMarks[0][1]); //89
    }    
}
