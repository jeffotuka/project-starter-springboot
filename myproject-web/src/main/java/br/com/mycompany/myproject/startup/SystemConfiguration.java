package br.com.mycompany.myproject.startup;

import br.com.mycompany.myproject.system.StandardSystemClock;
import br.com.mycompany.myproject.system.SystemClock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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

	@Bean
	@Scope("prototype")
	public Logger logger(InjectionPoint injectionPoint) {
		Class<?> targetClass = injectionPoint.getMember().getDeclaringClass();
		return LoggerFactory.getLogger(targetClass);
	}
}
