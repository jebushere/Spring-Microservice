package com.example.microservice.cart.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@GetMapping(path = { "/cart/ping" })
	public ResponseEntity<Map<String, String>> cartPing() {
		Map<String, String> response = new HashMap<>();
		response.put("Response", "Cart Service Up");
		return ResponseEntity.ok(response);
	}

	@GetMapping(path = { "/health" })
	public ResponseEntity<Map<String, String>> ping() {
		Map<String, String> response = new HashMap<>();
		response.put("Response", "Cart health check is okay");
		return ResponseEntity.ok(response);
	}

}
