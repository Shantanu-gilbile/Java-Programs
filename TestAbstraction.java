public class TestAbstraction{
    public static void main(String args[]){
        AbstractionRectangle abstractionRectangle = new AbstractionRectangle();

        TestAbstraction.invokeMethod(abstractionRectangle);

        abstractionRectangle.display();

    }

    public static void invokeMethod(AbstractionShape ref){
        ref.area();
    }
}