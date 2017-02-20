package com.craftcoder.cdi.alternatives;

import java.util.Locale;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

public class PaymentService {

	private static final Locale BRAZIL = new Locale("pt", "BR");

	@Inject @Any
	private Instance<Payment> payments;

	@Inject
	private LocaleDiscovery localeDiscovery;

	@SuppressWarnings("serial")
	public void startPayment() {
		Locale currentLocale = localeDiscovery.discovery();
		Instance<Payment> paymentSelected = null;

		if (currentLocale.equals(BRAZIL)) {
			paymentSelected = payments.select(new AnnotationLiteral<Moip>() {});
		} else {
			paymentSelected = payments.select(new AnnotationLiteral<PayPal>() {});
		}

		Payment payment = paymentSelected.get();
		payment.pay();
	}

}
