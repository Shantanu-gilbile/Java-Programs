interface InterfaceParent{
    void display();

    default void added(){
        System.out.println("Added");
    }
}