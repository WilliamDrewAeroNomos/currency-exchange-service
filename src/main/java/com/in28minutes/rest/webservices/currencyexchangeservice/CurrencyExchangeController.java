/**
 * 
 */
package com.in28minutes.rest.webservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         Please document me!!
 */
@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retireveExchangeValue(@PathVariable String from,
			@PathVariable String to) {
		return new ExchangeValue(1000L, "US", "INR", BigDecimal.valueOf(65));
	}
}