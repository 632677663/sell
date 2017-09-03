package com.scorpio.sell.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.scorpio.sell.pojo.ProductInfo;

public interface ProductInfoService {

	public ProductInfo findOne(Integer productId);

	public List<ProductInfo> findAll();

	public Page<ProductInfo> findAll(Pageable pageable);

	public ProductInfo save(ProductInfo productInfo);

}
