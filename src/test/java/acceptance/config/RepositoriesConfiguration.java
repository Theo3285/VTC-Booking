package acceptance.config;

import com.kata.bdd.adapters.InMemoryCustomerAccountRepository;
import com.kata.bdd.adapters.InMemoryCustomerRepository;
import com.kata.bdd.adapters.InMemoryVTCRepository;
import com.kata.bdd.domain.repositories.CustomerAccountRepository;
import com.kata.bdd.domain.repositories.CustomerRepository;
import com.kata.bdd.domain.repositories.VTCRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RepositoriesConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public CustomerRepository customerRepository() {
        return new InMemoryCustomerRepository();
    }

    @Bean
    @Scope("cucumber-glue")
    public VTCRepository vtcRepository() {
        return new InMemoryVTCRepository();
    }

    @Bean
    @Scope("cucumber-glue")
    public CustomerAccountRepository customerAccountRepository() {
        return new InMemoryCustomerAccountRepository();
    }
}
