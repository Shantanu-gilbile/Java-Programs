class TestInheritance
{
    public static void main(String args[])
    {
        InheritanceChild inheritanceChild = new InheritanceChild();

        inheritanceChild.setNumber1(10);
        inheritanceChild.setNumber2(20);

        System.out.println("Number1 : "+inheritanceChild.getNumber1()+" "+"Number2 : "+inheritanceChild.getNumber2());

        inheritanceChild.Addition();  
    }
}