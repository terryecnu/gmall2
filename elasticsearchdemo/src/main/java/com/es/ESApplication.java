package com.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jiangli
 * @since 2020/1/10 3:46
 */
@SpringBootApplication
@EnableSwagger2
public class ESApplication {

	public static void main(String[] args) {
		SpringApplication.run(ESApplication.class,args);
	}
}
