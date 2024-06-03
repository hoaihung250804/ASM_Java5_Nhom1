package com.fpoly.service;

import com.fpoly.Dao.ProductDao;
import com.fpoly.entitys.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService {


	List<Product> findAll();

	
}
