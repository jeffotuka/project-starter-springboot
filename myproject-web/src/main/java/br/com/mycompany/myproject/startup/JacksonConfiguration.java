package br.com.mycompany.myproject.startup;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Jackson configuration class.
 *
 * Includes special modules to facilitate serialization and deserialization in a Spring project.
 * Reference: https://github.com/FasterXML/jackson-modules-java8
 */
@Configuration
public class JacksonConfiguration {

	/**
	 * Parameter names - support for detecting constructor and factory method ("creator") parameters without having to use @JsonProperty annotation
	 */
	@Bean
	public ParameterNamesModule parameterNamesModule() {
		return new ParameterNamesModule(JsonCreator.Mode.PROPERTIES);
	}

	/**
	 * Java 8 Date/time - support for Java 8 date/time types (JSR-310)
	 */
	@Bean
	public Jdk8Module jdk8Module() {
		return new Jdk8Module();
	}

	/**
	 * Java 8 Datatypes - support for other new Java 8 datatypes outside of date/time: most notably Optional, OptionalLong, OptionalDouble
	 */
	@Bean
	public JavaTimeModule javaTimeModule() {
		return new JavaTimeModule();
	}

}
