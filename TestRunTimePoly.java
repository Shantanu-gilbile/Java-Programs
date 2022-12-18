class TestRunTimePoly
{
    public static void main(String args[])
    {
        RunTimePolyChild runTimePolyChild = new RunTimePolyChild();
        runTimePolyChild.display();

        RunTimePolyParent runTimePolyParent = new RunTimePolyParent();
        runTimePolyParent.display();

        System.out.println("Call By Run Time Polymorphism");
        RunTimePolyParent ref;
        ref = runTimePolyChild; // Child
        ref.display();

        ref = runTimePolyParent;   //Parent
        ref.display();

        System.out.println("Calling by Ref Method");

        ref = runTimePolyParent;  //Parent
        ref.refCallMethod(ref);  

        ref = runTimePolyChild;   //Child
        ref.refCallMethod(ref);

    }
}