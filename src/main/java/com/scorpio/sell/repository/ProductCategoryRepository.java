package com.scorpio.sell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scorpio.sell.pojo.ProductCategory;
/**
 * 商品类目操作
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{
	
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
	
}