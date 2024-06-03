package com.fpoly.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Part;

@Service
public class UploadService {
	@Autowired
//	cung cấp thông tin về ứng dụng web.
	ServletContext app;
	
	public File save(MultipartFile file,String folder) {
//		lấy đường dẫn tuyệt đối( đầy đủ)
		File dir = new File(app.getRealPath(folder));
		if (!dir.exists())  dir.mkdir();  // nếu không tồn tại, tạo thư mục
		try {// tạo file, với đường dẫn "dir", tên gốc "file"
			File saveFile = new File(dir,file.getOriginalFilename());
			// chuyển nội dung sang "saveFile"
		file.transferTo(saveFile);
			return saveFile;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
