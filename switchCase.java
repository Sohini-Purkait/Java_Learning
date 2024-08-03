public class switchCase{
    public static void main(String args[])
    {
       int day = 1;  // 1- monday; 2- tuesday

        switch(day) {

            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;

            default:
                System.out.println("wed - sun");
       } 
    }    
}
