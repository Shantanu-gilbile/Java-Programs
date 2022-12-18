import java.util.Scanner;

class TestExceptionHandling
{
    public static void main(String[] args) 
    {
        System.out.println("Inside Main");

        ExceptionHandling exceptionHandling = new ExceptionHandling();

        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int num1 = ch.nextInt();

        System.out.println("Enter the Secomd Number : ");
        int num2 = ch.nextInt();
        
        exceptionHandling.division(num1, num2);
        exceptionHandling.display();

        System.out.println("Main Ended.");

        ch.close();
    }
}