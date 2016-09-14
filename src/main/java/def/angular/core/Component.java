package def.angular.core;

import jsweet.lang.Decorator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Decorator
@Target(ElementType.TYPE)
public @interface Component {
	String selector();

	String template() default "";

	String templateUrl() default "";

	String moduleId() default "";

	String[] styleUrls() default {};

	Class<?>[] directives() default {};

}
