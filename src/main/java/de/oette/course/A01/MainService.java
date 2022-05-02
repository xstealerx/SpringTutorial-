package de.oette.course.A01;

import java.util.concurrent.Flow.Subscriber;

import org.springframework.beans.factory.annotation.Autowired;

public class MainService {
    

    @Autowired
    private SubService subService;

    public void logMessage(){
            subService.logMessage();
    }


}
