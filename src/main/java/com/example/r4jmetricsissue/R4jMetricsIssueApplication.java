package com.example.r4jmetricsissue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
@RestController
public class R4jMetricsIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(R4jMetricsIssueApplication.class, args);
	}

	@Autowired
	StoreOneClient storeOneClient;

	@Autowired
	StoreTwoClient storeTwoClient;

	@PostConstruct
	public void triggerCalls() {
		try {
			storeOneClient.getStores();
		} catch (Exception ignore) {
			ignore.printStackTrace();
		}

		try {
			storeTwoClient.getStores();
		} catch (Exception ignore) {
			ignore.printStackTrace();
		}
	}
}
