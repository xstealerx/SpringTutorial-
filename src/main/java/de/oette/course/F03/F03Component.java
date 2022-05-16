package de.oette.course.F03;

import org.springframework.context.annotation.Bean;

public class F03Component {
    
    F03ConfigurableService configurableService;

  
    public F03Component(F03ConfigurableService configurableService) {
        this.configurableService = configurableService;
    }


  
}


