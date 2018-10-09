package com.cl.packapp.backadvisor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
}
