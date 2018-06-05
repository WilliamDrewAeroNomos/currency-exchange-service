/**
 * 
 */
package com.in28minutes.rest.webservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         Please document me!!
 */
public interface ExchangeValueRepository
		extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
