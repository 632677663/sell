package com.scorpio.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.scorpio.sell.pojo.ProductInfo;
import com.scorpio.sell.repository.ProductInfoRepository;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoTestCase {

	@Autowired
	private ProductInfoRepository productInfoRepository;

	@Test
	public void test1() {
		ProductInfo p = new ProductInfo();
		p.setProductId("00000000A1");
		p.setProductName("pdsr");
		p.setProductPrice(12.2);
		p.setProductStock(1000);
		p.setProductDescription("Aaaaaaaaaaadddddd");
		p.setProductIcon("http://www.baidu.com");
		p.setProductStatus(0);
		p.setCategoryType(2);
		
		productInfoRepository.save(p);
		log.info("success");
		
		
		log.info("success");
		
	}

}
