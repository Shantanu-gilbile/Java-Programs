public class CartEmptyException extends RuntimeException //Unchecked
{
    CartEmptyException(String message)
    { 
        super(message);
    }

}
