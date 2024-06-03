package com.fpoly.Dao;

import com.fpoly.Dao.ProductDao;
import com.fpoly.entitys.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductDao extends JpaRepository<Product, String> {
	@Query("SELECT p FROM Product p ORDER BY p.sold DESC")
	List<Product> findTop10BySold();

	@Query("SELECT p FROM Product p WHERE p.productName LIKE %:productName%")
	List<Product> findByProductNameContaining(@Param("productName") String productName);

	@Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice")
	List<Product> findByPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);
}
