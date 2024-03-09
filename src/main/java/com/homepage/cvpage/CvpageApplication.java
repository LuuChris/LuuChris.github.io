package com.homepage.cvpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.baeldung.boot.jsp")

public class CvpageApplication {
//	For Web Container
//	public class CvpageApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CvpageApplication.class, args);
	}
	@RequestMapping("/")
	public String home(){
		return "Hello World!ß";
	}

//	For Web Container
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(SpringBootJspApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootJspApplication.class);
//	}


}
