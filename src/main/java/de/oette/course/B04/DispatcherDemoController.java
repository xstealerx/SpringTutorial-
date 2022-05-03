package de.oette.course.B04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = {"/", "/v2"})
public class DispatcherDemoController {


    @GetMapping(value = {"/{text}","/hello/{text}"})
    @ResponseBody
    public String root(@PathVariable(required = false) String text ){
        return text;
    }
    
    @RequestMapping(value="/hello-world", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return "/hello-world";
    }
}
