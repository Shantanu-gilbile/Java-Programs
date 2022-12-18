
class Circle extends Shape{
    final double PI = 3.14;
    Circle()
    {
        super(0);
    }
    public double calculateArea(int radius)
    {
        this.radius = radius;
        double area = PI * radius * radius;
        return area;
    }
}