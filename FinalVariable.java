public class FinalVariable{

    private final double PI =3.14;

    public void circleCircum(double radius)
    {
        double circum = 2 * PI * radius;
        System.out.println("Circumference of Circle is : "+circum);
    }
    public void circleArea(double radius){
        double area = PI * radius * radius;

        System.out.println("Area of Cicle is : "+area);
    }
}