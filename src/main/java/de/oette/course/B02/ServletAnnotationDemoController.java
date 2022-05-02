package de.oette.course.B02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServletAnnotationDemoController {
    
    @GetMapping
    @ResponseBody
    public String demo(@RequestParam(value = "user") String userName, 
    HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException {

     return "The Username is " + userName;

    }
}
