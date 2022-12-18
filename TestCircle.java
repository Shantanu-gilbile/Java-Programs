import java.util.Scanner;

class TestCircle{
    public static void main(String args[]){
        
        Circle circle = new Circle();

        System.out.println("Enter the Radius : ");

        Scanner ch = new Scanner(System.in);

        int radius = ch.nextInt();
        circle.setRadius(radius);
        
        System.out.println("Area : "+circle.calculateArea(circle.getRadius()));

        ch.close();

        
    }
}