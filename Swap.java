class Swap{

    public static void swap(int no1 , int no2) //funtion Declaration
    {
        no1 = no1 + no2;  // 10 + 11 =21
        no2 = no1 - no2;  // 21 - 11 =10
        no1 = no1 - no2;  // 21 - 10 = 11

    }
    public static void main(String args[])
    {
        int no1 = 10;
        int no2 = 11;

        System.out.println("Before Swaping");
        System.out.println("no1 = "+no1);
        System.out.println("no2 = "+no2);

        
        swap(no1,no2);  //function call

        System.out.println("After Swaping");
        System.out.println("no1 = "+no1);
        System.out.println("no2 = "+no2);
    }   

}