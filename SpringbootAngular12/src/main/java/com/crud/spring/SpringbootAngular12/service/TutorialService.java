package com.crud.spring.SpringbootAngular12.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.SpringbootAngular12.Repository.TutorialRepository;
import com.crud.spring.SpringbootAngular12.entity.Tutorial;




@Service
public class TutorialService {
	@Autowired
	TutorialRepository tutorialRepository;
	
	
	
	public List<Tutorial> getAllPharmacies(){		
		List<Tutorial> pharmacies = new ArrayList<Tutorial>();
		tutorialRepository.findAll().forEach(pharmacies::add);
		return pharmacies;
	}
	
	public void addPharmacie(Tutorial p) {
		tutorialRepository.save(p);
	}
	
	
	public Tutorial getPharmacie(int id){
		return tutorialRepository.findById((long) id).get();
	}
	
	
	public void updatePharmacie(Tutorial p) {
		if(tutorialRepository.existsById(p.getId())) {
			
			tutorialRepository.save(p);
		}
		
	}
	
	public void deletePharmacie(int id) {
		tutorialRepository.deleteById((long) id);
		
	}}
	