/**
 * 
 */
package com.governmentcio.rest.webservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author <a href=mailto:support@governmentcio.com>support</a>
 * 
 *         Please document me!!
 */
public interface ExchangeValueRepository
		extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
