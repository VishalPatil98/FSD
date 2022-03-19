package com.example.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController
{
	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile file)
	{
		String message="";
		try 
		{
			byte[] bytes=file.getBytes();
			Path path=Paths.get("C://Users//Vishal//Desktop//filee//"+file.getOriginalFilename());
			Files.write(path, bytes);
			message="File Uploaded Successfully";
		} 
		catch (Exception e) 
		{
			message="error"+e.getMessage();
		}
		return message;
	}
}
