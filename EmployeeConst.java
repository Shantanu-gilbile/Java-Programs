class EmployeeConst
{
    public EmployeeConst()
    {
        System.out.println("Inside Non Parameterised Constructor");
    }

    public EmployeeConst(int sal)
    {
        System.out.println("Salary is : "+sal);
    }

    public EmployeeConst(int no1 , int no2)
    {
        System.out.println("no1 : "+no1+ " no2 : "+no2);
    }

    public void display()
    {
        System.out.println("Inside display");
    }
}
