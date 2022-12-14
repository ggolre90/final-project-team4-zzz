package com.itwill.test;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

import com.itwill.dao.ProductDao;
import com.itwill.dao.ProductDetailDao;
import com.itwill.dto.Product;
import com.itwill.dto.ProductDetail;
import com.itwill.dto.ProductSize;
import com.itwill.mapper.ProductDetailMapper;
import com.itwill.mapper.ProductMapper;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itwill"}, includeFilters = {
        @Filter(
                type = FilterType.ASSIGNABLE_TYPE, 
                classes = {ProductDao.class,ProductMapper.class}
            )
        } )
public class ProductDaoSpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication application = 
				new SpringApplication(ProductDaoSpringBootTestApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=application.run(args);
		ProductDao productDao=(ProductDao)context.getBean(ProductDao.class);
		//System.out.println(productDao.insert(new Product(0, "갤럭시제트제트플립플립플립", "30/09/30", 2000000, "img", 3)));
		//System.out.println(productDao.delete(6));
		//System.out.println(productDao.selectAll());
		System.out.println(productDao.selectAllMinPrice());
		//System.out.println(productDao.selectBuyMinPriceByNo(1));
		//System.out.println(productDao.searchAll("nike"));
		//System.out.println(productDao.selectSellMinPriceByNo(1));
		//System.out.println(productDao.selectByNo(1));
		
		List<Map> map = productDao.selectAllMinPrice();
		for (Map map2 : map) {
			System.out.println("P_no = " +map2.get("P_NO") + " : min_price =" + map2.get("min_price"));
		}
		 
		
	}

}
