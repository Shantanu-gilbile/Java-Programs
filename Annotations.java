/** 
 * This Class is Inhereted from the ExceptionHandling Class
 * This Class is used to demonstrate Annotaion (@Override)
 * The Method display is overridden method from ExceptionHandling Class
*/
class Annotation extends ExceptionHandling
{
    @Override
    public void display()
    {
        System.out.println("Inside Child class");
    }
}