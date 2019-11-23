package com.project.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PurchaseOrder_Table")
public class PurchaseOrder {

	@Id
	@GeneratedValue
	@Column(name="po_Id")
	private int poId;
	
	@Column(name="PO_Name")
    private String poName;
	
	@Column(name="Product_Id")
    private int productId;
    
	@Column(name="Buyer_Id")
    private int buyerId;

	@Column(name="Po_Status")
    private String status;
    
	@Column(name="Created_Date")
    private LocalDate createdDate;

	@Column(name="Quantity")
    private int quantity;

	public int getPoId() {
		return poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}

	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [poId=" + poId + ", poName=" + poName + ", productId=" + productId + ", buyerId="
				+ buyerId + ", status=" + status + ", createdDate=" + createdDate + ", quantity=" + quantity + "]";
	}

	
	
}
