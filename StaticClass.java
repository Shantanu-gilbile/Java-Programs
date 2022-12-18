public class StaticClass{
    public static int num1;
    public static int num2;
    public int num3;

    public void display(int num3){
        this.num3 = num3;
        System.out.println("Num3 : "+num3);
    }
   static class StaticInner{
       StaticInner(){}

        public void addition(){
            int sum;
            num1 = 10;
            num2 = 20;
            sum = num1 + num2;
            System.out.println("Addition : "+sum);
        }
    }
}