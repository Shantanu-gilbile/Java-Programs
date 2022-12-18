import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface MyNameAnnotation{
    // int value1() default 10;
    // int value2() default 20;
       
}