package br.com.mycompany.myproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for application-checking endpoints.
 */
@RestController
public class CheckController {

	@GetMapping("/check")
	@ResponseStatus(HttpStatus.OK)
	public void check() {

	}
}
