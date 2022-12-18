interface Interface1{
    void addition();
    default void substraction(){
        System.out.println("Inside Interface1");
    }
}
