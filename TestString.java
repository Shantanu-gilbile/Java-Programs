class TestString{
    public static void main(String[] args) {
        String name = "Shantanu";
        String nam = "Shantanu";

        System.out.println(name == nam);

        String st = new String("Shan"); 
        String s = new String("Shan");

        System.out.println(st ==s);

        System.out.println(st.equals(s));

        name = "#Shantanu";

        System.out.println(name == nam);

        st = "Shantanu";

        System.out.println(st == nam);
        System.out.println(st.equals(nam));



        String s1 = "Shanu";
        String s2 = "shanu";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        StringBuffer s4 = new StringBuffer("Pratik");
        System.out.println(s4.length());
        System.out.println(s4.capacity());

        s4.append(" How are you");
        System.out.println(s4.capacity());
        System.out.println(s4.length());

        s4.trimToSize();
        System.out.println(s4.length());


    }
}