import java.util.*;

class Switch
{
    public static void main(String args[])
    {
        int stop;
        do
        {
           
            Scanner ch = new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int choice =ch.nextInt();
            ch.close();
        
            switch(choice)
            {

                case 1:
                    System.out.println("Its One.");
                    break;
                case 2:
                    System.out.println("Its Two");
                    break;
                case 3:
                    System.out.println("Its Three.");
                    break;
                case 4:
                    System.out.println("Its Four");
                    break;
                default:
                    System.out.println("Please Enter the Valid Options");
                    break;

            }
            
        System.out.println("Enter 0 to Stop and 1 to Continue: ");
        stop =ch.nextInt();
        }while(stop!=0);

    
    }
    

}