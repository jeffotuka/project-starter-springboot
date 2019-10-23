package br.com.mycompany.myproject.controller;

import br.com.mycompany.myproject.domain.greeting.Greeting;
import br.com.mycompany.myproject.system.SystemClock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * Example controller for "greeting"-related endpoints.
 */
@RestController
public class GreetingController {

	private final SystemClock systemClock;

	@Autowired
	public GreetingController(SystemClock systemClock) {
		this.systemClock = systemClock;
	}

	@GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Greeting greeting(@RequestParam(value="name", defaultValue="Master") String name) {
		Instant now = Instant.now(systemClock.instance());
		return new Greeting(now, String.format("Hi, %s", name));
	}
}
