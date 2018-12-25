package org.sid.restful;

import java.util.List;

import org.sid.bo.Bureauutilisateur;
import org.sid.dao.BureauUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BureauUtilisateurRest {
	
	@Autowired
	public BureauUtilisateurRepository bureauUtilisateurRepository ;
	
	@RequestMapping(value = "/listBureauUsers",method=RequestMethod.GET)
	public List<Bureauutilisateur> getBureauUsers(){
		return bureauUtilisateurRepository.findAll() ;
	}
	
	

}
