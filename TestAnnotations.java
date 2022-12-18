import java.util.Scanner;

//@Deprecated
class TestAnnotations
{
     public static void main(String[] args) 
    {

        @SuppressWarnings("resource")
        
        Scanner ch  = new Scanner(System.in);
        int num = ch.nextInt();
        System.out.println("Number  :"+num);

        Annotation annotation = new Annotation();
        annotation.display();
      
    }
}
