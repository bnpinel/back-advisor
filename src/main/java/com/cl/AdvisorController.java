package com.cl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvisorController {
	
	@RequestMapping("/advisor")
	public Advisor getAdvisor(@RequestParam(value="name", defaultValue="toto") String name) {
		return new Advisor("1", "Albert", "Einstein");
	}

}
