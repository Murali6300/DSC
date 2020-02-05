package com.dsc.security.auth.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companyinfo")
public class DistributorDetails {
	
	@Id
	private String id;
	private String distFullName;
	private String email;
	private String password;
	private Integer distMobileNum;
	private String distCountry;
	private String distAddress;
	private String role;
	private String companyRef;
	private boolean flag;
	private Date createdDate;
	private Date updatedDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDistFullName() {
		return distFullName;
	}
	public void setDistFullName(String distFullName) {
		this.distFullName = distFullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getDistMobileNum() {
		return distMobileNum;
	}
	public void setDistMobileNum(Integer distMobileNum) {
		this.distMobileNum = distMobileNum;
	}
	public String getDistCountry() {
		return distCountry;
	}
	public void setDistCountry(String distCountry) {
		this.distCountry = distCountry;
	}
	public String getDistAddress() {
		return distAddress;
	}
	public void setDistAddress(String distAddress) {
		this.distAddress = distAddress;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompanyRef() {
		return companyRef;
	}
	public void setCompanyRef(String companyRef) {
		this.companyRef = companyRef;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "DistributorDetails [id=" + id + ", distFullName=" + distFullName + ", email=" + email + ", password="
				+ password + ", distMobileNum=" + distMobileNum + ", distCountry=" + distCountry + ", distAddress="
				+ distAddress + ", role=" + role + ", companyRef=" + companyRef + ", flag=" + flag + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
	

}
