package org.sid.restful;

import java.util.List;
import java.util.Optional;

import org.sid.bo.Crb;
import org.sid.dao.CrbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrbRest {
	
	@Autowired
	private CrbRepository crbRepository ;
	
	@RequestMapping(value = "/listCrb",method=RequestMethod.GET)
	public List<Crb> getCrbs(){
		return crbRepository.findAll() ;
	}
	
	@RequestMapping(value = "/Crb/{ref}",method=RequestMethod.GET)
	public Optional<Crb> getOneCreb(@PathVariable("ref") String ref){
		return crbRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveCrb",method=RequestMethod.POST)
	public Crb saveCrb(@RequestBody Crb c){
		return crbRepository.save(c) ;
	}
	
	@RequestMapping(value = "/Crb/{ref}",method=RequestMethod.DELETE)
	public boolean deleteCrb(@PathVariable String ref){
		crbRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateCrb",method=RequestMethod.PUT)
	public Crb updateCrb(@RequestBody Crb c){
		return crbRepository.saveAndFlush(c) ;
	}

}
