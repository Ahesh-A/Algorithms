package org.ahesh.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.ahesh.types.When;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnull {
	When when() default When.ALWAYS;
}
