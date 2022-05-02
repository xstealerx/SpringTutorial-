package de.oette.course.A05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorService implements Calculator{
    
    @Autowired 
    private Calculator calculator;

    @EventListener(ApplicationReadyEvent.class)
    public void getValue(){
        System.out.println(calculator.sum(10, 20));
    }

    @Override
    public int sum(int value1, int value2) {
        // TODO Auto-generated method stub
        return value1 + value2;
    }
}
