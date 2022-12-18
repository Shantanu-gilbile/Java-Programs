class RunTimePolyParent
{
    public void display()
    {
    System.out.println("Inside Parent !!!");    
    }

    public void refCallMethod(RunTimePolyParent obj){
        obj.display();
    }
}
