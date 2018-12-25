package org.sid.restful;

import java.util.List;
import java.util.Optional;


import org.sid.bo.Utilisateur;
import org.sid.dao.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurRest {
	
	@Autowired
	public UtilisateurRepository utilisateurRepository ;
	
	@RequestMapping(value = "/listUsers",method=RequestMethod.GET)
	public List<Utilisateur> getUsers(){
		return utilisateurRepository.findAll() ;
	}
	
	@RequestMapping(value = "/User/{ref}",method=RequestMethod.GET)
	public Optional<Utilisateur> getUser(@PathVariable("ref") String ref){
		return utilisateurRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveUtilisateur",method=RequestMethod.POST)
	public Utilisateur saveUser(@RequestBody Utilisateur c){
		return utilisateurRepository.save(c) ;
	}
	
	@RequestMapping(value = "/User/{ref}",method=RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable String ref){
		utilisateurRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateUser",method=RequestMethod.PUT)
	public Utilisateur updateUser(@RequestBody Utilisateur c){
		return utilisateurRepository.saveAndFlush(c) ;
	}
	
	

}
