package br.com.mycompany.myproject.system;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * Provides a clock for general usage in the code. This exists to make clock-related code more testable.
 *
 * Note that the supplied clock is always the same instance.
 */
public class StandardSystemClock implements SystemClock {

	private final Clock clock;

	public StandardSystemClock(Clock clock) {
		this.clock = clock;
	}

	@Override
	public Clock instance() {
		return clock;
	}

	/**
	 * Creates a StandardSystemClock with a typical UTC clock.
	 */
	public static StandardSystemClock systemUTC() {
		return new StandardSystemClock(Clock.systemUTC());
	}

	/**
	 * Creates a StandardSystemClock with a fixed-time clock, converted to UTC. Intended for tests.
	 *
	 * Example usage:
	 * StandardSystemClock.fixedUTC(LocalDateTime.of(2017, 7, 1, 12, 0));
	 */
	public static StandardSystemClock fixedUTC(LocalDateTime localDateTime) {
		return new StandardSystemClock(Clock.fixed(localDateTime.toInstant(ZoneOffset.UTC), ZoneId.of("UTC")));
	}
}
