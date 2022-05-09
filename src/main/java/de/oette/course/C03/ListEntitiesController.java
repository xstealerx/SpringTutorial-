package de.oette.course.C03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListEntitiesController {

    private ListEntityService listEntityService;

    public ListEntitiesController(ListEntityService listEntityService) {
        this.listEntityService = listEntityService;
    }

    @GetMapping
    public List<C03Entity> getList() {
        ListEntityService.createEntities();
        return listEntityService.getList();
    }
}
