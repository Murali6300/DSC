package com.dsc.security.auth.response;

import java.util.List;

import com.dsc.security.auth.model.Product;
import com.dsc.security.auth.model.RegisterCompany;
import com.dsc.security.auth.model.Role;

public class RegisterCompanyResponse {

	private List<RegisterCompany> regCompanyList;
	private List<Role> rolesList;
	private List<Product> productList;
	private String message;
	private String statusCode;

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

	@Override
	public String toString() {
		return "RegisterCompanyResponse [regCompanyList=" + regCompanyList + ", rolesList=" + rolesList
				+ ", productList=" + productList + ", message=" + message + ", statusCode=" + statusCode + "]";
	}

}
