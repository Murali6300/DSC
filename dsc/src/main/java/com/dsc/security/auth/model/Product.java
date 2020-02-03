package com.dsc.security.auth.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companyinfo")
public class Product {

	@Id
	private String id;
	private String userEmail;
	private String companyRef;
	private String productName;
	private String productBrand;
	private String productDimensions;
	private String productRef;
	private Integer countryCode;
	private String productModel;
	private String weight;
	private Long upcNum;
	private String batchNum;
	private String batchSize;
	private boolean flag;
	private Date createdDate;
	private Date updatedDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getCompanyRef() {
		return companyRef;
	}

	public void setCompanyRef(String companyRef) {
		this.companyRef = companyRef;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductDimensions() {
		return productDimensions;
	}

	public void setProductDimensions(String productDimensions) {
		this.productDimensions = productDimensions;
	}

	public String getProductRef() {
		return productRef;
	}

	public void setProductRef(String productRef) {
		this.productRef = productRef;
	}

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Long getUpcNum() {
		return upcNum;
	}

	public void setUpcNum(Long upcNum) {
		this.upcNum = upcNum;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public String getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(String batchSize) {
		this.batchSize = batchSize;
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
		return "Product [id=" + id + ", userEmail=" + userEmail + ", companyRef=" + companyRef + ", productName="
				+ productName + ", productBrand=" + productBrand + ", productDimensions=" + productDimensions
				+ ", productRef=" + productRef + ", countryCode=" + countryCode + ", productModel=" + productModel
				+ ", weight=" + weight + ", upcNum=" + upcNum + ", batchNum=" + batchNum + ", batchSize=" + batchSize
				+ ", flag=" + flag + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
