class Minimum
{
    public static void main(String args[])
    {
        int no1 = 2;
        int no2 = 15;
        int no3 = 11;

        if(no1 < no2 && no1<no3)
            {
                System.out.println("Minimum number is : "+no1);
            }

        else if(no2 < no3 && no2 < no3)
            {
                System.out.println("Minimum Number is : "+no2);
            }

        else if(no1==no2 && no1==no3 && no2==no3)
            {
                System.out.println("Equal");
            }

        else
            {
                System.out.println("Minimum Number is : "+no3);
            }      
    }
}
