package no.gutta.springbootdemo.customer;

/**
 * Created by avec112 on 17.04.18.
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
