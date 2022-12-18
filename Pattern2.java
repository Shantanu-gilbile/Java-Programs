

class Pattern2
{
    public static void main(String args[])
    {
        int temp =1;
        for(int i=1;i<=4;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i % 2 !=0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(temp++);
                }
            }
            System.out.println();
        }

    }
}