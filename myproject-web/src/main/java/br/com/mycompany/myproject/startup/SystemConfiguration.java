package br.com.mycompany.myproject.startup;

import br.com.mycompany.myproject.system.StandardSystemClock;
import br.com.mycompany.myproject.system.SystemClock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Main configuration class of this application. Used for @Bean setup.
 *
 * Please split this into different classes as needed.
 */
@Configuration
public class SystemConfiguration {

	@Bean
	public SystemClock systemClock() {
		return StandardSystemClock.systemUTC();
	}
}

