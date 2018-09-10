package acceptance.steps;

import com.kata.bdd.domain.Customer;
import com.kata.bdd.domain.repositories.CustomerRepository;
import cucumber.api.DataTable;
import cucumber.api.java8.En;

import java.util.List;
import java.util.Map;

public class ClientsSteps implements En {
    public ClientsSteps(CustomerRepository customerRepository) {
        Given("^des clients existent:$", (DataTable clientTable) -> {
            List<Map<String, String>> clientMaps = clientTable.asMaps(String.class, String.class);
            clientMaps.forEach(clientMap -> {
                Customer customer = new Customer(clientMap.get("id"), clientMap.get("firstName"), clientMap.get("lastName"));
                customerRepository.add(customer);
            });
        });
    }
}
