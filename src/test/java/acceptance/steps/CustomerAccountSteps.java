package acceptance.steps;

import com.kata.bdd.domain.CustomerAccount;
import com.kata.bdd.domain.gateways.AuthenticationGateway;
import com.kata.bdd.domain.repositories.CustomerAccountRepository;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

import java.math.BigDecimal;

import static java.lang.Long.*;
import static java.lang.Long.parseLong;

public class CustomerAccountSteps implements En {
    public CustomerAccountSteps(AuthenticationGateway authenticationGateway,
                                CustomerAccountRepository customerAccountRepository) {
        And("^le solde de mon compte est de \"([^\"]*)\" euros TTC avec \"([^\"]*)\" euros TTC d'avoir$",
                (String balance, String creditNote) -> {
                    authenticationGateway.currentCustomer().ifPresent(customer -> {
                        CustomerAccount customerAccount = new CustomerAccount(
                                customer.getId(),
                                BigDecimal.valueOf(parseLong(balance)),
                                BigDecimal.valueOf(parseLong(creditNote))
                        );
                        if (customerAccountRepository.all().isEmpty()){
                            customerAccountRepository.add(customerAccount);
                        }
                    });
                });
    }
}
