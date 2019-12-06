package com.example.microservice.product.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping(path = { "/product/ping" })
	public ResponseEntity<Map<String, String>> cartPing() {
		Map<String, String> response = new HashMap<>();
		response.put("Response", "Product Service Up");
		return ResponseEntity.ok(response);
	}

	@GetMapping(path = { "/health" })
	public ResponseEntity<Map<String, String>> ping() {
		Map<String, String> response = new HashMap<>();
		response.put("Response", "Product health check is okay");
		return ResponseEntity.ok(response);
	}

}
