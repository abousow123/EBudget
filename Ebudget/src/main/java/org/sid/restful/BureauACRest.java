package org.sid.restful;

import java.util.List;
import java.util.Optional;

import org.sid.bo.Bureauadministratifcomptable;
import org.sid.dao.BureauACRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BureauACRest {
	
	@Autowired
	public BureauACRepository bureauACRepository ;
	
	
	@RequestMapping(value = "/listBureauAC",method=RequestMethod.GET)
	public List<Bureauadministratifcomptable> getBureauAC(){
		return bureauACRepository.findAll() ;
	}
	
	@RequestMapping(value = "/BureauAC/{ref}",method=RequestMethod.GET)
	public Optional<Bureauadministratifcomptable> getOneBureauAC(@PathVariable("ref") String ref){
		return bureauACRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveBureauAC",method=RequestMethod.POST)
	public Bureauadministratifcomptable saveBureauAC(@RequestBody Bureauadministratifcomptable c){
		return bureauACRepository.save(c) ;
	}
	
	@RequestMapping(value = "/BureauAC/{ref}",method=RequestMethod.DELETE)
	public boolean deleteBureauAC(@PathVariable String ref){
		bureauACRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateBureauAC",method=RequestMethod.PUT)
	public Bureauadministratifcomptable updateBureauAC(@RequestBody Bureauadministratifcomptable c){
		return bureauACRepository.saveAndFlush(c) ;
	}

}
