class breakAndCont{
    public static void main(String args[])
    {
        int i = 0;
        while(true){
            if(i == 2){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if(i > 5){
                break;
            }
            
        }
    }    
}

// Output:
// 0
// 1
// 3
// 4
// 5
