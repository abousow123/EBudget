package org.sid.restful;


import java.util.List;

import org.sid.bo.Comptebudgetaire;
import org.sid.dao.CompteBudgetaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteBudgetRest {
	
	@Autowired
	public CompteBudgetaireRepository compteBudgetaireRepository ;
	
	@RequestMapping(value="/listCompteBudgetaires",method=RequestMethod.GET)
	public List<Comptebudgetaire> getCompteBudgetaires(){
		return compteBudgetaireRepository.findAll() ;
	}

}
