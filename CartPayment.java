class CartPayment
{
    public void cartPayment(int num[])  //NullPointer Exception
    {
        try
        {
        if(num == null)
        {
            throw new CartEmptyException("Cart is empty");
        }
        else
        {
            System.out.println(num[0]);
        }
    }catch(CartEmptyException e)
    {
        System.out.println(e.getMessage()); 
    }

    }

    public void division(int num1,int num2) //Arithmetic Exception
    {
        try
        {
            if(num2==0)
            {
                throw new CartEmptyException("Can't Divide by 0");
            }
            else
            {
                int div = num1 / num2;
                System.out.println("Division "+div);
            }
        }
        catch(CartEmptyException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
