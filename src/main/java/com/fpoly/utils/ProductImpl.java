package com.fpoly.utils;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fpoly.Dao.ProductDao;
import com.fpoly.entitys.Product;
import com.fpoly.service.ProductService;

@Service
public class ProductImpl implements ProductService {
    @Autowired
    private ProductDao dao;

    @Override
    public List<Product> findAll() {
        return dao.findAll();
    }
}
