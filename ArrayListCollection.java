// import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class ArrayListCollection
{
    public static void main(String[] args) 
    {
        //List<String> list = new LinkedList<String>(); Generic
        List<String> list = new LinkedList<String>(); //NonGeneric
        list.add("Shantanu");
        list.add("Shantanu");
        list.add("Shantanu1");
    
        // Iterator iterator = list.iterator();

        // while(iterator.hasNext())
        // {
        //     String name = (String) iterator.next();
        //     System.out.println(name);
        // }   

        ListIterator listIterator = list.listIterator();
        
        System.out.println("Forward");
        while(listIterator.hasNext()){
            String name = (String) listIterator.next();
            System.out.println(name);
        }

        System.out.println("Reverse");
        while(listIterator.hasPrevious()){
            String name = (String) listIterator.previous();
            System.out.println(name);
        }
    }        
}









//    boolean ans= find();
    //    if(ans==true){
    //     System.out.println("Found");
    //    }else{
    //     System.out.println("Not FOUND");
    //    }

    // public static boolean find()
    // {

        
    //     list.remove(1);
    //     boolean tt = false;
    //     for(int i=0;i<list.size();i++){
            
    //         Boolean t =  list.get(i).equals("Shantanu");
    //         if(t==true)
    //         {
    //             tt=true;
    //         }
        
    //     }
    //    return tt;