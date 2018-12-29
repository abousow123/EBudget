package org.sid.restful;

import java.util.List;
import java.util.Optional;


import org.sid.bo.Exercicebudgetaire;
import org.sid.dao.ExerciBudgetaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciceBudgetaireRest {
	
	@Autowired
	public ExerciBudgetaireRepository budgetaireRepository ;
	
	@RequestMapping(value = "/listExerceBudgetaire",method=RequestMethod.GET)
	public List<Exercicebudgetaire> getExerceBudgetaires(){
		return budgetaireRepository.findAll() ;
	}
	
	@RequestMapping(value = "/ExerceBudgetaire/{ref}",method=RequestMethod.GET)
	public Optional<Exercicebudgetaire> getOneExerceBudgetaire(@PathVariable("ref") String ref){
		return budgetaireRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveExerceBudgetaire",method=RequestMethod.POST)
	public Exercicebudgetaire saveExerceBudgetaire(@RequestBody Exercicebudgetaire c){
		return budgetaireRepository.save(c) ;
	}
	
	@RequestMapping(value = "/ExerceBudgetaire/{ref}",method=RequestMethod.DELETE)
	public boolean deleteExerceBudgetaire(@PathVariable String ref){
		budgetaireRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateExerceBudgetaire",method=RequestMethod.PUT)
	public Exercicebudgetaire updateExerceBudgetaire(@RequestBody Exercicebudgetaire c){
		return budgetaireRepository.saveAndFlush(c) ;
	}

}
