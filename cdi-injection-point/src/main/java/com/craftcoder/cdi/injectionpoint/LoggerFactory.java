package com.craftcoder.cdi.injectionpoint;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerFactory {

	@Produces
	public Logger createLogger(InjectionPoint ip) {
		Class<?> clazz = ip.getMember().getDeclaringClass();
		
		return new Logger(clazz);
	}
	
}
