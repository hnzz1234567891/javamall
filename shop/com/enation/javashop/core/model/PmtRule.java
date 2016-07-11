package com.enation.javashop.core.model;

/**
 * PmtRule generated by MyEclipse - Hibernate Tools
 */

public class PmtRule implements java.io.Serializable {

	// Fields

	private Integer rule_id;

	private Integer pmt_id;

	private Long begin_time;

	private Long end_time;

	private Double discount;

	private String brief;

	private Integer type;

	private Long update_time;

	private Double order_price;

	public Long getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Long begin_time) {
		this.begin_time = begin_time;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public Long getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Long end_time) {
		this.end_time = end_time;
	}

	public Double getOrder_price() {
		return order_price;
	}

	public void setOrder_price(Double order_price) {
		this.order_price = order_price;
	}

	public Integer getPmt_id() {
		return pmt_id;
	}

	public void setPmt_id(Integer pmt_id) {
		this.pmt_id = pmt_id;
	}

	public Integer getRule_id() {
		return rule_id;
	}

	public void setRule_id(Integer rule_id) {
		this.rule_id = rule_id;
	}


	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Long update_time) {
		this.update_time = update_time;
	}

}