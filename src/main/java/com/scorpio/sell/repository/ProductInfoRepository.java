package com.scorpio.sell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scorpio.sell.pojo.ProductInfo;
/**
 * 商品操作
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer>{
	
	public List<ProductInfo> findByProductStatus(Integer productStatus);
	
}