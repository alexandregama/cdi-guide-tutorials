package com.hackingcode.cdi.produces;

import javax.enterprise.inject.Produces;

public class AwesomeLoggerFactory {

	@Produces
	public SpecialLogger createLogger() {
		LogConfiguration logInDebugMode = new LogConfiguration(true, false);

		return new SpecialLogger(logInDebugMode);
	}

}
