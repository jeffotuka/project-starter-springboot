package br.com.mycompany.myproject.system;

import java.time.Clock;

/**
 * Provides a Clock instance. This exists to make clock-related code more testable.
 */
public interface SystemClock {

	Clock instance();

}

