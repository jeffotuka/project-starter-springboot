package br.com.mycompany.myproject.domain.greeting;

import java.time.Instant;

/**
 * Example domain bean.
 */
public class Greeting {

	private final Instant created;
	private final String content;

	public Greeting(Instant created, String content) {
		this.created = created;
		this.content = content;
	}

	public Instant getCreated() {
		return created;
	}

	public String getContent() {
		return content;
	}
}
