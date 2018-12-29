package org.sid.restful;


import java.util.List;
import java.util.Optional;


import org.sid.bo.Historiquedesbudgets;
import org.sid.dao.HistoriqueBudgetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoriqueBudgetRest {
	
	@Autowired
	public HistoriqueBudgetsRepository historiqueBudgetsRepository ;
	
	@RequestMapping(value = "/listhistoriqueBudgets",method=RequestMethod.GET)
	public List<Historiquedesbudgets> gethistoriqueBudgets(){
		return historiqueBudgetsRepository.findAll() ;
	}
	
	@RequestMapping(value = "/historiqueBudget/{ref}",method=RequestMethod.GET)
	public Optional<Historiquedesbudgets> getOnehistoriqueBudget(@PathVariable("ref") int ref){
		return historiqueBudgetsRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/savehistoriqueBudget",method=RequestMethod.POST)
	public Historiquedesbudgets savehistoriqueBudget(@RequestBody Historiquedesbudgets c){
		return historiqueBudgetsRepository.save(c) ;
	}
	
	@RequestMapping(value = "/historiqueBudget/{ref}",method=RequestMethod.DELETE)
	public boolean deletehistoriqueBudget(@PathVariable int ref){
		historiqueBudgetsRepository.deleteById(ref);;
		return true ;
	}
	
	@RequestMapping(value = "/updatehistoriqueBudget",method=RequestMethod.PUT)
	public Historiquedesbudgets updatehistoriqueBudget(@RequestBody Historiquedesbudgets c){
		return historiqueBudgetsRepository.saveAndFlush(c) ;
	}

}
