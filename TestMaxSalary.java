
import java.util.Scanner;

class TestMaxSalary{
    public static void main(String args[])
    {
        System.out.println("Enter the Number of Object you want o create : ");
        Scanner ch = new Scanner(System.in);
        int numObj = ch.nextInt();
        MaxSalary obj[] = new MaxSalary[numObj];

        for(int i=0;i<obj.length;i++){
            System.out.println("Enter the detail for "+i+"th Object.");

            int eRoll;
            String eName;
            int eSalary;

            System.out.println("Enter the Eid : " );
            eRoll = ch.nextInt();
            System.out.println("Enter the Name : " );
            eName = ch.next();
            System.out.println("Enter the Salary : " );
            eSalary = ch.nextInt();

            obj[i] = new MaxSalary(eRoll, eName, eSalary);

        }

        
        
        
        for(int i=0;i<obj.length;i++)
        {
            obj[i].display();
        }

        System.out.println("Maximum Salary Record : ");
        int max = -10000;
        int index = 0;

        for(int i=0;i<obj.length;i++)
        {
            if(obj[i].empSalary > max)
            {
                max = obj[i].empSalary;
                index = i;
            }
        }
        obj[index].display();
        ch.close();
    }
    

    
}