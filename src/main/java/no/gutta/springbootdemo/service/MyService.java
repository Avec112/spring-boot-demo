package no.gutta.springbootdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by avec112 on 17.04.18.
 */
@Service
public class MyService {

    @Value("${my.property}")
    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }
}
