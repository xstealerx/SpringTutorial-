package de.oette.course.B03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
public class ViewDemoController {

    @GetMapping
    @ResponseBody
    public ModelAndView demo(@RequestParam(value = "user") String userName,
                       HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException {

                        
            ModelAndView ModelAndView = new ModelAndView(new MyView());
            ModelAndView.addObject("username", userName);
            return ModelAndView;
       
    }
    
    private class MyView implements View {

        @Override
        public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
                throws Exception {
                String result = "<HTML><H1>The username is </H1> <b>" + map.get("userName") +"</b></Html>";
                httpServletResponse.getWriter().println(result);
                
            
        }
        
    }
}
