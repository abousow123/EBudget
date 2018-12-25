package org.sid.restful;

import java.util.List;
import java.util.Optional;

import org.sid.bo.Budgetcrb;
import org.sid.dao.BudgetCrbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetCrbRest {
	
	@Autowired
	public BudgetCrbRepository budgetCrbRepository ;
	
	
	@RequestMapping(value = "/BudgetCrb",method=RequestMethod.GET)
	public List<Budgetcrb> getBudgetCrbs(){
		return budgetCrbRepository.findAll() ;
	}
	
	@RequestMapping(value = "/BudgetCrb/{ref}",method=RequestMethod.GET)
	public Optional<Budgetcrb> getOneBudgetCrb(@PathVariable("ref") String ref){
		return budgetCrbRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/BudgetCrb/{ref}",method=RequestMethod.DELETE)
	public boolean deleteBudgetCrb(@PathVariable String ref){
		budgetCrbRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateBudgetCrb",method=RequestMethod.PUT)
	public Budgetcrb updateCrb(@RequestBody Budgetcrb c){
		return budgetCrbRepository.saveAndFlush(c) ;
	}

}
