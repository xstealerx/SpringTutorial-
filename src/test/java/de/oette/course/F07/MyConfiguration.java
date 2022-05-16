package de.oette.course.F07;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfiguration {

    @Bean
    public CustomStringUtils createUtils() {
        CustomStringUtils utils = new CustomStringUtils();
        utils.setRandomLength(30);
        utils.setUseLetters(true);
        utils.setUseNumbers(false);
        return utils;
    }
}
