import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TestArrayEmp
{
    
    public static void main(String[] args) 
    {
        List<ArrayEmp> list = new ArrayList<ArrayEmp>();
        

        ArrayEmp obj1 = new ArrayEmp(1, "Shantanu", 50);
        ArrayEmp obj2 = new ArrayEmp(3, "Pratik", 60);
        ArrayEmp obj3 = new ArrayEmp(2, "Harshal", 55);

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        System.out.println(list);

        System.out.println("After Sorting");
        Collections.sort(list);

        System.out.println(list);

        // for(ArrayEmp name:list)
        // {
        //     System.out.println(name);
        // }
    }
}