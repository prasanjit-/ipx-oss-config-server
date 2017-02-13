package com.ipx.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class IpxOssConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpxOssConfigServerApplication.class, args);
	}
}
