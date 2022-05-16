package de.oette.course.F04;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.context.annotation.Import;

@Retention(value = RetentionPolicy.RUNTIME)
@Import(value = SimpleConfiguration.class)
public @interface MySimpleConfiguration {
    
}
