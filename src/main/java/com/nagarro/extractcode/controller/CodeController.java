package com.nagarro.extractcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.extractcode.dao.AccessTokenDetails;

@RestController
public class CodeController {
	
	private static AccessTokenDetails accessTokenDetails = new AccessTokenDetails();

	@GetMapping()
	public String extractCode(@RequestParam String state,@RequestParam String id_token,@RequestParam String code,@RequestParam String scope ) {
		accessTokenDetails.setState(state);
		accessTokenDetails.setScope(scope);
		accessTokenDetails.setCode(code);
		accessTokenDetails.setId_token(id_token);
		return "Operation completed successfully";
	}
	
	@GetMapping("/getCode")
	public String getCode() {
		return CodeController.accessTokenDetails.getCode();
	}
	
	@GetMapping("/getRequestParams")
	public AccessTokenDetails getRequestParams() {
		return CodeController.accessTokenDetails;
	}
	
}
