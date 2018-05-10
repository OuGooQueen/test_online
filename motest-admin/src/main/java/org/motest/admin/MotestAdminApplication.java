package org.motest.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@MapperScan("org.motest.admin.mapper")
@SpringBootApplication
public class MotestAdminApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MotestAdminApplication.class);
	}

	public static void main(String[] args) {
		//SpringApplication.run(MotestAdminApplication.class, args);
		SpringApplication app = new SpringApplication(MotestAdminApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
