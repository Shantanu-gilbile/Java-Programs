class MyArray
{
    public static void main(String args[])
    {
        int num[]={1,2,3,4,5};  //Declaration
        //int num[] = new int[]{1,2,3,4,5};
        
        /*     

        for(int value : num) //Advanced for loop
        {
            System.out.println(value);
        }

        */

        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i] +" "); // Single Line
        }
    }
}