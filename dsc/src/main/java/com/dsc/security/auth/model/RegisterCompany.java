package com.dsc.security.auth.model;

import java.util.Date;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companyinfo")
public class RegisterCompany {

	@Id
	private String id;
//	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String email;
	private String companyFullName;
	private String companyAddress;
	private String ownerFullName;
	private Integer ownerMobileNum;
	private String ownerCountry;
	private String password;
	private boolean flag;
	private Date createdDate;
	private Date updatedDate;

	@DBRef
	private Set<Role> roles;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyFullName() {
		return companyFullName;
	}

	public void setCompanyFullName(String companyFullName) {
		this.companyFullName = companyFullName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getOwnerFullName() {
		return ownerFullName;
	}

	public void setOwnerFullName(String ownerFullName) {
		this.ownerFullName = ownerFullName;
	}

	public Integer getOwnerMobileNum() {
		return ownerMobileNum;
	}

	public void setOwnerMobileNum(Integer ownerMobileNum) {
		this.ownerMobileNum = ownerMobileNum;
	}

	public String getOwnerCountry() {
		return ownerCountry;
	}

	public void setOwnerCountry(String ownerCountry) {
		this.ownerCountry = ownerCountry;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "RegisterCompany [id=" + id + ", email=" + email + ", companyFullName=" + companyFullName
				+ ", companyAddress=" + companyAddress + ", ownerFullName=" + ownerFullName + ", ownerMobileNum="
				+ ownerMobileNum + ", ownerCountry=" + ownerCountry + ", password=" + password + ", flag=" + flag
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", roles=" + roles + "]";
	}

}
