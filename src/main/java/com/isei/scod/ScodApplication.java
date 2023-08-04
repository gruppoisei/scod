package com.isei.scod;

import com.isei.scod.ConfigSecurity.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class ScodApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScodApplication.class, args);
	}

}
