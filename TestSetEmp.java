import java.util.HashSet;
import java.util.Set;

class TestSetEmp
{
    public static void main(String[] args) 
    {
        Set<ArrayEmp> set = new HashSet<ArrayEmp>();
        Set<String> set1 = new HashSet<String>();

        ArrayEmp obj1 = new ArrayEmp(1, "Shantanu", 50);
        ArrayEmp obj2 = new ArrayEmp(2, "Pratik", 80);
        ArrayEmp obj3 = new ArrayEmp(3, "Harshal", 55);
        //ArrayEmp obj4 = new ArrayEmp(3, "Harshal", 55); // Duplicate Element
    
        System.out.println(obj3.hashCode());
        //System.out.println(obj4.hashCode());  // different hash code

        System.out.println("RAM".hashCode());
        System.out.println("RAM".hashCode()); // Same has Code


        set.add(obj1);
        set.add(obj2);
        set.add(obj3);
        //set.add(obj4);

        System.out.println(set);

        set1.add("Sf");
        set1.add("Sf");
        System.out.println(set1); // only one Sf will be store

        // for(ArrayEmp name:list)
        // {
        //     System.out.println(name);
        // }        
    }
}