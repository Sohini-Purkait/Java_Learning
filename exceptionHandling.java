class exceptionHandling{
    public static void main(String args[])
    {
        //TRY - CATCH IN EXCEPTION HANDLING (ERRORS CAN'T BE CATCHED OR HANDELED BUT EXCEPTIONS CAN BE HANDELED)
        int[] marks = {67, 90, 89};
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {
            //do something after catching the exception
        }
        System.out.println("the student name is Sohini.");
    }    
}
