package com.dsc.security.auth.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companyinfo")
public class CompanyUserDetails {

	@Id
	private String id;
	private String userFullName;
	private String email;
	private String password;
	private Integer userMobileNum;
	private String userCountry;
	private String userAddress;
	private String role;
	private String companyRef;
	private boolean flag;
	private Date createdDate;
	private Date updatedDate;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
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

	public Integer getUserMobileNum() {
		return userMobileNum;
	}

	public void setUserMobileNum(Integer userMobileNum) {
		this.userMobileNum = userMobileNum;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
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
		return "CompanyUserDetails [id=" + id + ", userFullName=" + userFullName + ", email=" + email + ", password="
				+ password + ", userMobileNum=" + userMobileNum + ", userCountry=" + userCountry + ", userAddress="
				+ userAddress + ", role=" + role + ", companyRef=" + companyRef + ", flag=" + flag + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
