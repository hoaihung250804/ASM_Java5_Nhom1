package com.fpoly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fpoly.entitys.Product;
import com.fpoly.service.ProductService;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("index")
public class homeController {

	@Autowired
	ServletContext app;

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/layout", method = RequestMethod.GET)
	public String home(Model model) {
		String path = app.getRealPath("image");
		List<Product> products = productService.findAll(); // Lấy danh sách sản phẩm từ dịch vụ
		model.addAttribute("products", products);
		return "index";
	}
}
