package cn.tedu.spring.entity;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3248082900657563730L;
	private Integer orderNumber;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private String status;
	private Integer customerNumber;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}
	public Date getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", status=" + status + ", customerNumber=" + customerNumber + "]";
	}
	
}
