class TestStaticClass{
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.display(10);
        
        StaticClass.StaticInner inner = new StaticClass.StaticInner();
        
        inner.addition();
    

      
      
        //inner.display(2);
    }
}