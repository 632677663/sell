package com.scorpio.sell.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name="tb_product_info")
@DynamicUpdate
public class ProductInfo {
	
	@Id
	private String productId;
	
	private String productName;
	
	private Double productPrice;
	
	private Integer productStock;
	
	private String productDescription;
	
	private Integer productStatus;
	
	private String productIcon;
	
	private Integer categoryType;
	
	private Date createTime;
	
	private Date updateTime;

}
