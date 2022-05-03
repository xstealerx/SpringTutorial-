package de.oette.course.B05;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoController {


    private String temp = "";

    @GetMapping
    public String get() {
        return temp;
    }
    @PostMapping
    @PutMapping
    public String set(@RequestParam String newText){
        temp += newText;
        return temp;
    }

    @DeleteMapping
    public String delete(){
        this.temp = "";
        return temp ;
    }
}
