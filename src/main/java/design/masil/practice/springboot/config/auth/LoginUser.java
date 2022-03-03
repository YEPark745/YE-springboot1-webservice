package design.masil.practice.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) // Only in the object that is declared parameter in method
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser { // Create an annotation as "LoginUser" name
}
