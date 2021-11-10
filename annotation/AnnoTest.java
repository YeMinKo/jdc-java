@interface Hello {
	String value() default "Hello";
}


@Hello()
public class AnnoTest {

}