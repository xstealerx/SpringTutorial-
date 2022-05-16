package de.oette.course.F01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * property.demo.inject
 * property.demo.environment-var
 */
@Component
public class PropertyDemoComponent {

    @Value("${property.demo.inject}")
    private String property1;

    // @Value("${property.demo.enviroonment-var}")
    // private String getProperty2;

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        System.out.println(property1);
        // System.out.println(getProperty2);

    }
}
