package com.scorpio.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.scorpio.sell.pojo.ProductCategory;
import com.scorpio.sell.repository.ProductCategoryRepository;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellApplicationTests {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Test
	public void test1() {


		ProductCategory one = productCategoryRepository.findOne(1);
		
		System.out.println(one.getCategoryName());
		
		log.info("success");
		
	}

}
