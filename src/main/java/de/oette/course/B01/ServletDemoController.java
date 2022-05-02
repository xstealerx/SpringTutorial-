package de.oette.course.B01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServletDemoController {

    @GetMapping
    public void demo(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException, InterruptedException{
    String userName = servletRequest.getParameter("user");
    PrintWriter writer = servletResponse.getWriter();
    for(int i = 0; i < 6 ; i++){
        writer.println("wait for it ");
        writer.flush();
        Thread.sleep(700);
    }
        writer.println("the username is " + userName);
    }
}
