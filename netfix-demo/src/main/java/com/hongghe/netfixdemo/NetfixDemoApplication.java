package com.hongghe.netfixdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * 启动
 *
 * @author hongghe 04/08/2018
 */
@EnableAutoConfiguration
@EnableEurekaClient
@ServletComponentScan
@SpringBootApplication
public class NetfixDemoApplication {

	@Bean
	public NetfixDemoWebConfig netfixDemoWebConfig() {
		return new NetfixDemoWebConfig();
	}

	@Bean
	public NetfixDemoIntializer netfixDemoIntializer() {
		return new NetfixDemoIntializer();
	}

	@Bean
	public NetfixProperties netfixProperties() {
		return new NetfixProperties();
	}

	public static void main(String[] args) {
		SpringApplication.run(NetfixDemoApplication.class, args);
	}
}
