package com.dsc.security.auth.request;

import com.dsc.security.auth.model.CompanyUserDetails;
import com.dsc.security.auth.model.DistributorDetails;
import com.dsc.security.auth.model.Product;
import com.dsc.security.auth.model.RegisterCompany;
import com.dsc.security.auth.model.Role;

public class RegisterCompanyRequest {

	private RegisterCompany registerCompany;
	private Role role;
	private Product product;
	private CompanyUserDetails companyUserDetails;
	private DistributorDetails distributorDetails;

	private String transactionType;

	public DistributorDetails getDistributorDetails() {
		return distributorDetails;
	}

	public void setDistributorDetails(DistributorDetails distributorDetails) {
		this.distributorDetails = distributorDetails;
	}

	public CompanyUserDetails getCompanyUserDetails() {
		return companyUserDetails;
	}

	public void setCompanyUserDetails(CompanyUserDetails companyUserDetails) {
		this.companyUserDetails = companyUserDetails;
	}

	public RegisterCompany getRegisterCompany() {
		return registerCompany;
	}

	public void setRegisterCompany(RegisterCompany registerCompany) {
		this.registerCompany = registerCompany;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "RegisterCompanyRequest [registerCompany=" + registerCompany + ", role=" + role + ", product=" + product
				+ ", companyUserDetails=" + companyUserDetails + ", distributorDetails=" + distributorDetails
				+ ", transactionType=" + transactionType + "]";
	}

}
