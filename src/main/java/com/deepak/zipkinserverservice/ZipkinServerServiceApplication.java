package com.deepak.zipkinserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerServiceApplication.class, args);
	}

}
