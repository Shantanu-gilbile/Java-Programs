import java.util.Stack;

public class StackDemo{
    public static void main(String[] args) {
        Stack<String> list =  new Stack<String>();

        list.add("Shantanu");
        list.add("Pratik");
        list.add("Harshal");

        System.out.println(list);

        System.out.println("Removed Element");
        System.out.println(list.pop());

        list.push("Amit");
        System.out.println(list);
        
    }
}