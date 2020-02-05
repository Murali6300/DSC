package com.dsc.security.auth.response;

import java.util.List;

import com.dsc.security.auth.model.CompanyUserDetails;
import com.dsc.security.auth.model.DistributorDetails;
import com.dsc.security.auth.model.Product;
import com.dsc.security.auth.model.RegisterCompany;
import com.dsc.security.auth.model.Role;

public class RegisterCompanyResponse {

	private List<RegisterCompany> regCompanyList;
	private List<Role> rolesList;
	private List<Product> productList;
	private List<CompanyUserDetails> companyUserDetailsList;
	private List<DistributorDetails> distributorDetails;
	private String message;
	private String statusCode;
	private String status;

	
	public List<DistributorDetails> getDistributorDetails() {
		return distributorDetails;
	}

	public void setDistributorDetails(List<DistributorDetails> distributorDetails) {
		this.distributorDetails = distributorDetails;
	}

	public List<CompanyUserDetails> getCompanyUserDetailsList() {
		return companyUserDetailsList;
	}

	public void setCompanyUserDetailsList(List<CompanyUserDetails> companyUserDetailsList) {
		this.companyUserDetailsList = companyUserDetailsList;
	}

	public List<RegisterCompany> getRegCompanyList() {
		return regCompanyList;
	}

	public void setRegCompanyList(List<RegisterCompany> regCompanyList) {
		this.regCompanyList = regCompanyList;
	}

	public List<Role> getRolesList() {
		return rolesList;
	}

	public void setRolesList(List<Role> rolesList) {
		this.rolesList = rolesList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RegisterCompanyResponse [regCompanyList=" + regCompanyList + ", rolesList=" + rolesList
				+ ", productList=" + productList + ", companyUserDetailsList=" + companyUserDetailsList
				+ ", distributorDetails=" + distributorDetails + ", message=" + message + ", statusCode=" + statusCode
				+ ", status=" + status + "]";
	}

}
