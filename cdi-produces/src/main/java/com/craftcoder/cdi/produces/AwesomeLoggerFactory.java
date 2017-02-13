package com.craftcoder.cdi.produces;

import javax.enterprise.inject.Produces;

public class AwesomeLoggerFactory {

	@Produces
	public AwesomeLogger createLogger() {
		LogConfiguration logInDebugMode = new LogConfiguration(true, false);

		return new AwesomeLogger(logInDebugMode);
	}

}
