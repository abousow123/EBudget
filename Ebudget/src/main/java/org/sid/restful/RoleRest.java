package org.sid.restful;

import java.util.List;
import java.util.Optional;

import org.sid.bo.Role;
import org.sid.bo.Utilisateur;
import org.sid.dao.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleRest {
	
	@Autowired
	public RoleRepository roleRest ;
	
	
	@RequestMapping(value = "/listRoles",method=RequestMethod.GET)
	public List<Role> getRoles(){
		return roleRest.findAll() ;
	}
	
	@RequestMapping(value = "/Role/{ref}",method=RequestMethod.GET)
	public Optional<Role> getRole(@PathVariable("ref") int ref){
		return roleRest.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveRole",method=RequestMethod.POST)
	public Role saveRole(@RequestBody Role c){
		return roleRest.save(c) ;
	}
	
	@RequestMapping(value = "/Role/{ref}",method=RequestMethod.DELETE)
	public boolean deleteRole(@PathVariable int ref){
		roleRest.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateRole",method=RequestMethod.PUT)
	public Role updateRole(@RequestBody Role c){
		return roleRest.saveAndFlush(c) ;
	}
	
	

}
