package de.oette.course.A01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {


    @Autowired
    private MyFirstService myFirstService;

    @GetMapping(value= "/hello")
    public ModelAndView sayHello(@RequestParam (required= false) String userName){
       ModelAndView modelAndView = new ModelAndView("hello_page");
        modelAndView.addObject("dto", myFirstService.hello(userName));
        return modelAndView;


    }
}
