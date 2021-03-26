package com.example.fileupload.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class FileUploadController {
	Map<String, Object> result = new HashMap<>();
	/// Receive message
	@RequestMapping("/upload")
	public Map<String, Object> upload(@RequestParam("attach")MultipartFile file) throws IOException {
	   // File info
	   System.out.println("File name = "  + file.getOriginalFilename());
	   System.out.println("File type = " + file.getContentType());

	   // Save to disk
	   String filePath = "C:\\Users\\User\\Desktop\\UdacityProjects\\";
	   file.transferTo(new File(filePath + file.getOriginalFilename()));
	   result.put("Success", true);
	   return result;
	}
}
