class ExceptionHandling
{
    public ExceptionHandling()
    {
        System.out.println("Inside Constructor");
    }
   
    public void division(int num1 , int num2)
    {
        try
        {
        System.out.println("In Division Method");
        int div = num1 / num2;
        System.out.println("Division : "+div);
        }catch(ArithmeticException e)
        {
            System.out.println("In Catch Block");
            e.printStackTrace();
        }
    }
    
    public void display()
    {
        System.out.println("Inside display");
    }
}