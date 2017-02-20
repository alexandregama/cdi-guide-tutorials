package com.craftcoder.cdi.alternatives;

import java.util.Locale;
import java.util.Random;

public class LocaleDiscovery {

	public Locale discovery() {
		int number = new Random().nextInt(10);

		if (number % 2 == 0) {
			return new Locale("pt", "BR");
		}
		return new Locale("en", "US");
	}

}
