package com.crud.spring.SpringbootAngular12.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.SpringbootAngular12.entity.Tutorial;
import com.crud.spring.SpringbootAngular12.service.TutorialService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	TutorialService tutorialService;
	
	//get ALL
	@GetMapping( "/tutorials")
	public  List<Tutorial> getAllPharmacies() {
		return tutorialService.getAllPharmacies();
	}
	
	//get Pharmacie
	@RequestMapping("/tutorials/{id}")
	public Tutorial getPharmacie(@PathVariable int id) {
		return tutorialService.getPharmacie(id);
	}
	
	//ADD 
	@RequestMapping(method = RequestMethod.POST, path="/tutorial")
	public void addPharmacie(@RequestBody Tutorial p) {
		tutorialService.addPharmacie(p);
	}
	
	//update 
	@RequestMapping(method = RequestMethod.PUT,value="/tutorials")
	public void updatePharmacie(@RequestBody Tutorial p) {
		tutorialService.updatePharmacie(p);	
	}
	
	//delete 
	@RequestMapping(method = RequestMethod.DELETE,value="/tutorials/{id}")
	public void deletePharmacie(@PathVariable int id) {
		tutorialService.deletePharmacie(id);
	}

}
