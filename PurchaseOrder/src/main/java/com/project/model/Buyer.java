package com.project.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;



@Entity
@Table(name="BuyerDetail")
public class Buyer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_Id")
	private int  buyerId;
	
	@Column(name="User_Name")
	private String buyerName;
	
	@Column(name="Email")
	private String emailId;
	
		
	@Column(name="Address")
	private String buyerAddress;
	
	@Column(name="Mobile_no")
	private long phone_no;

	@Column(name="IsActive")
	private String is_active;
	
	@Column(name="Created_Date")
	private LocalDate created_date;
	
	@Column(name="Updated_Date")
	private LocalDate updated_date;
	
	@Column(name="Created_By")
	private String created_by;
	
	@Column(name="Updated_By")
	private String updated_by;
	
	@Column(name="password")
	@Transient
	private String password;
	
	
	
	public int getBuyerId() {
		return buyerId;
	}
	
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	
	public String getBuyerName() {
		return buyerName;
	}
	
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	public String getBuyerAddress() {
		return buyerAddress;
	}
	
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	
	public long getPhone_no() {
		return phone_no;
	}
	
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	

	public LocalDate getCreated_date() {
		return created_date;
	}
	
	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}
	
	public LocalDate getUpdated_date() {
		return updated_date;
	}
	
	public void setUpdated_date(LocalDate updated_date) {
		this.updated_date = updated_date;
	}
	
	public String getCreated_by() {
		return created_by;
	}
	
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	
	public String getUpdated_by() {
		return updated_by;
	}
	
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	
	public String getIs_active() {
		return is_active;
	}
	
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
