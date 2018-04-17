package no.gutta.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by avec112 on 17.04.18.
 */
@RestController
public class SimpleRestController {

    @Autowired
    private MyService service;

    @RequestMapping("/myProperty")
    public String myProperty() {
        return service.getMyProperty();
    }
}
