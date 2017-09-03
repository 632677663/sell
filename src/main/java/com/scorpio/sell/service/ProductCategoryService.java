package com.scorpio.sell.service;

import java.util.List;

import com.scorpio.sell.pojo.ProductCategory;
/**
 * 类目操作业务
 * @author Scorpio
 *
 */
public interface ProductCategoryService {
	
   public ProductCategory findOne(Integer id);
   
   public List<ProductCategory> findAll();
   
   public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
   
   public ProductCategory save(ProductCategory productCategory);

}
