package acceptance.steps;

import com.kata.bdd.domain.Customer;
import com.kata.bdd.domain.gateways.AuthenticationGateway;
import com.kata.bdd.domain.repositories.CustomerRepository;
import cucumber.api.java8.En;

import java.util.Optional;

public class UserSteps implements En {
    public UserSteps(CustomerRepository customerRepository, AuthenticationGateway authenticationGateway) {
        Given("^je suis authentifié en tant que \"([^\"]*)\"$", (String firstName) -> {
            Optional<Customer> optionalCustomer = customerRepository.all()
                    .stream()
                    .filter(c -> c.getFirstName().equals(firstName))
                    .findFirst();
            optionalCustomer.ifPresent(authenticationGateway::authenticate);
        });
    }
}
