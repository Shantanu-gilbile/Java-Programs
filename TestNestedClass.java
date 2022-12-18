class TestNestedClass{
    public static void main(String[] args) 
    {
        NestedClass nestedClass = new NestedClass();
        nestedClass.display();
        
        //nestedClass.show(); Error

        NestedClass.Inner inner = nestedClass.new Inner();
        inner.show();
        
    }


}