package com.scorpio.sell.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name="tb_product_category")
@DynamicUpdate
public class ProductCategory {
	
	@Id
	@GeneratedValue
	private Integer categoryId;
	
	private String categoryName;
	
	private Integer categoryType;
	
	private Date createTime;
	
	private Date updateTime;
		

}
