package com.cl.packapp.backadvisor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cl.packapp.backadvisor.dao.AdvisorRepository;
import com.cl.packapp.backadvisor.model.Advisor;

@RestController
public class AdvisorController {

	
	@Autowired
	private AdvisorRepository repository;

	@RequestMapping(value = "/advisor", method = RequestMethod.GET)
	public List<Advisor> getAdvisor() {
		final List<Advisor> advisors = repository.findAll();
		return advisors;
	}
	
	@RequestMapping(value="/advisor", method=RequestMethod.POST)
	public ResponseEntity<?> editCard(@RequestBody Advisor advisor, UriComponentsBuilder ucBuilder) {
		
		advisor = repository.save(advisor);
		
		System.out.println("---- Advisor " + advisor.getId() + " added");
		
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/advisor/{id}").buildAndExpand(advisor.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	
}
