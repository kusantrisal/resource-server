package com.zerotoheroquick.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EntryController {

	@GetMapping()
	public Map<String, String> index() {
		return Collections.singletonMap("status", "landingpage");
	}
	
	@GetMapping("/unsecure/test")
	public Map<String, String> unsecure() {
		return Collections.singletonMap("status", "unsecure");
	}
	
	@GetMapping("/secure/test")
	public Map<String, Principal> secure(Principal principal) {
		return Collections.singletonMap("Principal", principal);
	}
}
