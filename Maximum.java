class Maximum
{
    public static void main(String args[])
    {
        int no1 = 14;
        int no2 = 5;
        int no3 = 112;

        if(no1 > no2 && no1 > no3)
        {
            System.out.println("Maximum number is : "+no1);
        }

        else if(no2 > no1 && no2 > no3)
        {
            System.out.println("Maximum number is : "+no2);
        }
        
        else if(no1==no2 && no1==no3 && no2==no3)
        {
            System.out.println("Equal");
        }
        
        else
        {
            System.out.println("Maximum Number is : "+no3);
        }
    }
}