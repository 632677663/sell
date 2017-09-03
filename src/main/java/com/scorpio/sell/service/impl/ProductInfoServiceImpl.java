package com.scorpio.sell.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.scorpio.sell.enums.ProductStatusEnum;
import com.scorpio.sell.pojo.ProductInfo;
import com.scorpio.sell.repository.ProductInfoRepository;
import com.scorpio.sell.service.ProductInfoService;
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
	
	@Autowired
	private ProductInfoRepository productInfoRepository;
	
	@Override
	public ProductInfo findOne(Integer productId) {
		return productInfoRepository.findOne(productId);
	}

	@Override
	public List<ProductInfo> findAll() {
		return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
	}

	@Override
	public Page<ProductInfo> findAll(Pageable pageable) {
		return productInfoRepository.findAll(pageable);
	}

	@Override
	public ProductInfo save(ProductInfo productInfo) {
		return productInfoRepository.save(productInfo);
	}

}
