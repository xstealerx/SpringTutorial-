package de.oette.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import de.oette.course.F04.MySimpleConfiguration;
import de.oette.course.F04.SimpleConfiguration;


 @SpringBootApplication
 @ComponentScan(basePackages = {"de.oette.course.G04"})
// @EnableAutoConfiguration
@SuppressWarnings("SpellCheckingInspection")
// @MySimpleConfiguration
public class SpringAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndHibernateApplication.class, args);
	}

}
