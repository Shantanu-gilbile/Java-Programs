import java.util.concurrent.atomic.*;

class WrapperDemo{
    public static void main(String[] args) 
    {
        int num =10;

        AtomicInteger obj = new AtomicInteger(num); //Boxing

        System.out.println(obj.intValue());  //Unboxing

        Integer obj1 = 20; //AutoBBoxing

        System.out.println(obj1);

    }

}