import java.util.Scanner;

class TestEvenOdd
{
    public static void main(String args[])
    {
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the Number to be checked : ");
        int num = ch.nextInt();

        EvenOdd obj = new EvenOdd();

        obj.checkEven(num);

        ch.close();

    }
}
