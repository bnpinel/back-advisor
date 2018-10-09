package com.cl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cl.models.Advisor;

@RestController
public class AdvisorController {
	
	private List<Advisor> listAdvisor = new ArrayList<Advisor>();
	
 
	
	@RequestMapping("/advisor")
	public List<Advisor> getAdvisor(@RequestParam(value="name", defaultValue="toto") String name) {
		listAdvisor = new ArrayList<Advisor>();
		listAdvisor.add(new Advisor("1", "Albert", "Einstein", null));
		listAdvisor.add(new Advisor("2", "Benjamin", "Franklin", null));
		listAdvisor.add(new Advisor("3", "Marie", "Curie", null));
		
		return listAdvisor;
	}

}
