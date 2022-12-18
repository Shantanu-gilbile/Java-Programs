public class SumOfDigit  
{  
    public static void main(String args[])  
    {  
        int num = 123;
        int sum = 0;  
    

        while(num > 0)  
        {  
            int digit = num % 10;  // (digit 123 % 10 = 3)   (12 % 10 = 2)       (1 %10 = 1)
            
            sum = sum + digit;     // (sum = 0 + 3)           (sum = 3 + 2 = 5)   (sum = 5 + 1)
        
            num = num / 10;        // (123 / 10 = 12)         (12 / 10 = 1)       (1 / 10)
        }    

        System.out.println("Sum of Digits: "+sum); 
    }  
}  