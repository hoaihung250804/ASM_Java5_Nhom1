package com.fpoly.service;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class ParamService {
	@Autowired
	HttpServletRequest request;

	/**
	 * Đọc chuỗi giá trị của tham số
	 * 
	 * @param name         tên tham số
	 * @param defaultValue giá trị mặc định
	 * @return giá trị tham số hoặc giá trị mặc định nếu không tồn tại
	 */
	public String getString(String name, String defaultValue) {
		String p = request.getParameter(name);
		if (p == null) {
			return defaultValue;
		}
		return p;

	}

	/**
	 * Đọc số nguyên giá trị của tham số
	 * 
	 * @param name         tên tham số
	 * @param defaultValue giá trị mặc định
	 * @return giá trị tham số hoặc giá trị mặc định nếu không tồn tại
	 * 
	 */
	public int getInt(String name, int defaultValue) {
		String p = request.getParameter(name);
		if (p == null) {
			return defaultValue;
		}
		return Integer.parseInt(p);

	}

	/**
	 * Đọc số thực giá trị của tham số
	 * 
	 * @param name         tên tham số
	 * @param defaultValue giá trị mặc định
	 * @return giá trị tham số hoặc giá trị mặc định nếu không tồn tại
	 */
	public double getDouble(String name, double defaultValue) {
		String p = request.getParameter(name);
		if (p == null) {
			return defaultValue;
		}
		return Double.parseDouble(p);
	}

	/**
	 * Đọc giá trị boolean của tham số
	 * 
	 * @param name         tên tham số
	 * @param defaultValue giá trị mặc định
	 * @return giá trị tham số hoặc giá trị mặc định nếu không tồn tại
	 */
	public boolean getBoolean(String name, boolean defaultValue) {
		String p = request.getParameter(name);
		if (p == null) {
			return defaultValue;
		}
		return Boolean.parseBoolean(p);
	}

	/**
	 * Đọc giá trị thời gian của tham số
	 * 
	 * @param name    tên tham số
	 * @param pattern là định dạng thời gian
	 * @return giá trị tham số hoặc null nếu không tồn tại
	 * @throws ParseException
	 * @throws RuntimeException lỗi sai định dạng
	 */
	public Date getDate(String name, String pattern) throws ParseException {
		String p = request.getParameter(name);
		if (p == null) {
			return null;
		}
		// lớp phương thức để định dạng và phân tích chuỗi ngày tháng theo mẫu(pattern)
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		return sf.parse(p); // chuyển chuỗi "p" thành đối tượng date theo mẫu(pattern)
	}
}