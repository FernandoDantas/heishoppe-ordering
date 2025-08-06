package br.com.heishoppe.ordering;

import br.com.heishoppe.ordering.domain.entity.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;


public class CustomerTest {

    @Test
    public void testingCustomer(){
        Customer customer = new Customer(
                UUID.randomUUID(),
                "Jhon Doe",
                LocalDate.of(19988, 5, 6),
                "john.doe@email.com",
                "478-256-2504",
                "255-08-0578",
                true,
                OffsetDateTime.now()
        );

        customer.addLoyaltyPoints(10);
    }

}
