class Loopdemo
{
    public static void main(String args[])
    {
        
        for(int i=5; i>=1;i--)
        {
            if(i>=3)
            {
                System.out.println(i);
                continue;
            }
            
            System.out.println("Hello");
        }
    }
}