package com.dsc.security.auth.request;

import com.dsc.security.auth.model.Product;
import com.dsc.security.auth.model.RegisterCompany;
import com.dsc.security.auth.model.Role;

public class RegisterCompanyRequest {

	private RegisterCompany registerCompany;
	private Role role;
	private Product product;

	private String transactionType;

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
				+ ", transactionType=" + transactionType + "]";
	}

}
