class NestedClass
{
    private int num;

    public NestedClass()
    {
        System.out.println("In Outer Constructor");
        num = 10;
    }

    public void display()
    {
        System.out.println("In Outer display");
    }

    class Inner  //Nested Inner Class
    {
        public Inner()
        {
            System.out.println("Inside Inner class Constructor");
        }
        public void show(){
            System.out.println("In Inner Show");
            display();
            System.out.println(" Number = "+num);
        }
    }
}
