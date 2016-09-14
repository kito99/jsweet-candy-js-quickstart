package def.angular.core;

import jsweet.lang.Decorator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Decorator
@Target(ElementType.TYPE)
public @interface NgModule {
	Class<?>[] imports() default {};

	Class<?>[] declarations() default {};

	Class<?>[] bootstrap() default {};

	Class<?>[] providers() default {};

}
