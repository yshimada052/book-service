package com.skillstorm.bookservice.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ORDERTAB")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORDER_ID")
	private int id;
	@Column(name="FULL_NAME")
	private String fullName;
	@Column(name="STREET_ADDRESS_1")
	private String streetAddress1;
	@Column(name="STREET_ADDRESS_2")
	private String streetAddress2;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="CARD_NUMBER")
	private String cardNumber;
	@Column(name="EXPIRY_MONTH")
	private String month;
	@Column(name="EXPIRY_YEAR")
	private String year;
	@Column(name="CCV")
	private String ccv;
	@Column(name="NAME_ON_CARD")
	private String nameOnCard;
	private Order() {}
	public Order(int id, String fullName, String streetAddress1, String streetAddress2, String city, String state,
			String cardNumber, String month, String year, String ccv, String nameOnCard) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.city = city;
		this.state = state;
		this.cardNumber = cardNumber;
		this.month = month;
		this.year = year;
		this.ccv = ccv;
		this.nameOnCard = nameOnCard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCcv() {
		return ccv;
	}
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", fullName=" + fullName + ", streetAddress1=" + streetAddress1 + ", streetAddress2="
				+ streetAddress2 + ", city=" + city + ", state=" + state + ", cardNumber=" + cardNumber + ", month="
				+ month + ", year=" + year + ", ccv=" + ccv + ", nameOnCard=" + nameOnCard + "]";
	};
}