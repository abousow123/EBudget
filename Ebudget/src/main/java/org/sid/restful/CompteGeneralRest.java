package org.sid.restful;

import java.util.List;

import org.sid.bo.Comptegeneral;
import org.sid.dao.CompteGeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteGeneralRest {
	
	@Autowired
	private CompteGeneralRepository compteGeneralRepository ;
	
	
	@RequestMapping(value = "/listCompteGeneral",method=RequestMethod.GET)
	public List<Comptegeneral> getCompte(){
		return compteGeneralRepository.findAll() ;
	}

}
