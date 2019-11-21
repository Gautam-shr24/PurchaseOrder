package com.project.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;



@Entity
@Table(name="Buyer_Detail")
public class Buyer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Buyer_Id")
	private int  buyerId;
	
	@Column(name="Buyer_name")
	private String buyerName;
	
	@Column(name="Buyer_Address")
	private String buyerAddress;
	
	@Column(name="Phone_No")
	private Integer phone_no;
	
	@Column(name="Email_Id")
	private String emailId;
	
	@Column(name="Is_Active")
	private String is_active;
	
	@Column(name="Buyer_Password")
	private String password;
	
	@Column(name="Role_Id")
	private int role_id;
	
	@Column(name="Created_Date")
	private LocalDate created_date;
	
	@Column(name="Updated_Date")
	private LocalDate updated_date;
	
	@Column(name="Created_By")
	private String created_by;
	
	@Column(name="Updated_By")
	private String updated_by;
	
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
	
	public Integer getPhone_no() {
		return phone_no;
	}
	
	public void setPhone_no(Integer phone_no) {
		this.phone_no = phone_no;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole_id() {
		return role_id;
	}
	
	public void setRole_id(int role_id) {
		this.role_id = role_id;
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
	
	
	

}
