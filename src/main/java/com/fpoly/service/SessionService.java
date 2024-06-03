package com.fpoly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {
	@Autowired
	HttpSession session;
	
	/**
	* Đọc giá trị của attribute trong session
	* @param name tên attribute
	* @return giá trị đọc được hoặc null nếu không tồn tại
	*/
	//
	public <T> T get(String name) {  //Generic (T) : không cần biết trước kiểu dữ liệu,  làm việc với bất kỳ kiểu dữ liệu nào
		T t = (T)session.getAttribute(name);  // trả về đối tượng với phiên làm việc là "name", `(T)` ép kiểu cho giống với `T`
		return t;
	}
	/**
	* Thay đổi hoặc tạo mới attribute trong session
	* @param name tên attribute
	* @param value giá trị attribute
	*/
	// thay đổi, tạo mới attribute trong phiên 
	public void set(String name, Object value) {
		session.setAttribute(name, value);
	}
	/**
	* Xóa attribute trong session
	* @param name tên attribute cần xóa
	*/
	
	public void remove(String name) {
		session.removeAttribute(name);
	}
}
