package com.simplilearn.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController {
	
	@GetMapping("/download")
	public ResponseEntity<Object> downloadFile() throws FileNotFoundException{
		String filename="src\\main\\resources\\static\\file.txt";
		
		File  file=new File(filename);
		InputStreamResource resource= new InputStreamResource(new FileInputStream(file));
		
		HttpHeaders headers= new HttpHeaders();
		headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
		headers.add("Cache-Control", "no-cache,no-store,must-revalidate");
		headers.add("pragma", "no-cache");
		headers.add("Expired", "0");
		
		
		return ResponseEntity.ok().headers(headers).contentLength(file.length())
				.contentType(MediaType.parseMediaType("application/txt")).body(resource);
		
	}

}
