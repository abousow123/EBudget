package org.sid.restful;

import java.util.List;
import java.util.Optional;


import org.sid.bo.Demandedeconsommation;
import org.sid.dao.DemandeConsommationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemandeConsommationRest {
	
	@Autowired
	public DemandeConsommationRepository consommationRepository ;
	
	
	@RequestMapping(value = "/listDemandeConsommation",method=RequestMethod.GET)
	public List<Demandedeconsommation> getDemandeConsommation(){
		return consommationRepository.findAll() ;
	}
	
	@RequestMapping(value = "/DemandeConsommation/{ref}",method=RequestMethod.GET)
	public Optional<Demandedeconsommation> getOneDemandeConsommation(@PathVariable("ref") String ref){
		return consommationRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveDemandeConsommation",method=RequestMethod.POST)
	public Demandedeconsommation saveDemandeConsommation(@RequestBody Demandedeconsommation c){
		return consommationRepository.save(c) ;
	}
	
	@RequestMapping(value = "/DemandeConsommation/{ref}",method=RequestMethod.DELETE)
	public boolean deleteDemandeConsommation(@PathVariable String ref){
		consommationRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateDemandeConsommation",method=RequestMethod.PUT)
	public Demandedeconsommation updateDemandeConsommation(@RequestBody Demandedeconsommation c){
		return consommationRepository.saveAndFlush(c) ;
	}

}
