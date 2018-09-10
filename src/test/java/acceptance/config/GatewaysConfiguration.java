package acceptance.config;

import com.kata.bdd.adapters.InMemoryAuthenticationGateway;
import com.kata.bdd.domain.gateways.AuthenticationGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GatewaysConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public AuthenticationGateway authenticationGateway() {
        return new InMemoryAuthenticationGateway();
    }
}
