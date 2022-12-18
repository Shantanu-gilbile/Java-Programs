class TestInterface{
    public static void main(String args[]){
        ClassInterface classInterface = new ClassInterface();

        Interface1 ref1 = classInterface;
        ref1.addition();
        ref1.substraction();
        //ref1.division()  Error

        Interface2 ref2 = classInterface;
        ref2.division();
        ref2.substraction();
        //ref1.addition(); Error
    }
}