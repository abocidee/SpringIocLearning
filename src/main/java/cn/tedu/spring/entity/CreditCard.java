package cn.tedu.spring.entity;

import java.io.Serializable;
import java.sql.Date;

public class CreditCard implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5368254007814257690L;
	private String name;
    private String phonenumber;
    private String mail;
    private String bank;
    private Integer cardtype;
    private String password;
    private Integer billday;
    private Integer paydate;
    private Double maxamount;
    private Date invaliddate;
	public CreditCard() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Integer getCardtype() {
		return cardtype;
	}
	public void setCardtype(Integer cardtype) {
		this.cardtype = cardtype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getBillday() {
		return billday;
	}
	public void setBillday(Integer billday) {
		this.billday = billday;
	}
	public Integer getPaydate() {
		return paydate;
	}
	public void setPaydate(Integer paydate) {
		this.paydate = paydate;
	}
	public Double getMaxamount() {
		return maxamount;
	}
	public void setMaxamount(Double maxamount) {
		this.maxamount = maxamount;
	}
	public Date getInvaliddate() {
		return invaliddate;
	}
	public void setInvaliddate(Date invaliddate) {
		this.invaliddate = invaliddate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", phonenumber=" + phonenumber + ", mail=" + mail + ", bank=" + bank
				+ ", cardtype=" + cardtype + ", password=" + password + ", billday=" + billday + ", paydate=" + paydate
				+ ", maxamount=" + maxamount + ", invaliddate=" + invaliddate + "]";
	}
    
    
}
