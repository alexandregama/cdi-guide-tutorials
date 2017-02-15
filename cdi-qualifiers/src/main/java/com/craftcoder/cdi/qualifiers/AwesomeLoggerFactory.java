package com.craftcoder.cdi.qualifiers;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class AwesomeLoggerFactory {

	@Produces @DebugMode
	public AwesomeLogger createDebugLogger() { //yes, I renamed it
		boolean debugMode = true; //just to be clear that the debug mode is on
		LogConfiguration logInDebugMode = new LogConfiguration(false, debugMode, false);

		return new AwesomeLogger(logInDebugMode);
	}

	@Produces @Default
	public AwesomeLogger createInfoLogger() { //new method here :)
		boolean infoMode = true;
		LogConfiguration logInInfoMode = new LogConfiguration(infoMode, false, false);

		return new AwesomeLogger(logInInfoMode);
	}

}
