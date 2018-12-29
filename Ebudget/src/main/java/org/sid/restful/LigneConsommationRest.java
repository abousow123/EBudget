package org.sid.restful;

import java.util.List;
import java.util.Optional;

import org.sid.bo.Crb;
import org.sid.bo.Lignedeconsommation;
import org.sid.dao.LigneConsommationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LigneConsommationRest {
	
	@Autowired
	private LigneConsommationRepository ligneConsommationRepository ;
	
	
	@RequestMapping(value = "/listligneConsommation",method=RequestMethod.GET)
	public List<Lignedeconsommation> getligneConsommations(){
		return ligneConsommationRepository.findAll() ;
	}
	
	@RequestMapping(value = "/ligneConsommation/{ref}",method=RequestMethod.GET)
	public Optional<Lignedeconsommation> getOneligneConsommation(@PathVariable("ref") int ref){
		return ligneConsommationRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveligneConsommation",method=RequestMethod.POST)
	public Lignedeconsommation saveligneConsommation(@RequestBody Lignedeconsommation c){
		return ligneConsommationRepository.save(c) ;
	}
	
	@RequestMapping(value = "/ligneConsommation/{ref}",method=RequestMethod.DELETE)
	public boolean deleteligneConsommation(@PathVariable int ref){
		ligneConsommationRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateligneConsommation",method=RequestMethod.PUT)
	public Lignedeconsommation updateligneConsommation(@RequestBody Lignedeconsommation c){
		return ligneConsommationRepository.saveAndFlush(c) ;
	}

	

}
