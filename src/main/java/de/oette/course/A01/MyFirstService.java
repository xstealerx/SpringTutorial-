package de.oette.course.A01;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;


import de.oette.course.A01.helloDto.HelloDto;


@Service
public class MyFirstService {

    @PersistenceContext
    private EntityManager entityManager;

    public MyFirstService(){

            System.out.println("My First Service constructor calle");
    }

@EventListener(classes= ApplicationReadyEvent.class)
    public void init(){

        System.out.println("My First Service is ready . Api been startet");
    }
    static int counter = 0;
    
    @Transactional
    public HelloDto hello(String user){
        counter++;
        String helloMessage = (String.format("Hello %s, This application ist up and runniing  and be called %s times" , user, counter));
        return new HelloDto(helloMessage+ " " + getVisitorList(user));
    }
    private String getVisitorList(String user) {
        AppVisiotList result = entityManager.find(AppVisiotList.class, 1L);
        if(result == null) {
           AppVisiotList newList =  new AppVisiotList();
           result = newList;
           entityManager.persist(newList);
        }
        result.addVisitor(user);
        return result.getListAsString();
    }
}