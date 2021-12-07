package com.evoke.rest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class Rest2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		String url = "http://localhost:9897/id?id=2";
		RestTemplate template = new RestTemplate();
		
		for (int i = 0; i < 20000; i++) {
			ResponseEntity<String> resp = template.getForEntity(url, String.class);
			System.out.println(resp.getBody());
		}
	}

}
