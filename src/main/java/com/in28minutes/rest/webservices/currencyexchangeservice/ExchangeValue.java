/**
 * 
 */
package com.in28minutes.rest.webservices.currencyexchangeservice;

import java.math.BigDecimal;

/**
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         Please document me!!
 */
public class ExchangeValue {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param conversionMultiple
	 */
	public ExchangeValue(Long id, String from, String to,
			BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
}
