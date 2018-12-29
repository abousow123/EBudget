package org.sid.restful;

import java.util.List;
import java.util.Optional;

import org.sid.bo.Article;
import org.sid.bo.Crb;
import org.sid.dao.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesRest {
	
	@Autowired
	public ArticleRepository articleRepository ;
	
	@RequestMapping(value = "/listArticles",method=RequestMethod.GET)
	public List<Article> getArticles(){
		return articleRepository.findAll() ;
	}
	
	@RequestMapping(value = "/Articles/{ref}",method=RequestMethod.GET)
	public Optional<Article> getOneArticles(@PathVariable("ref") String ref){
		return articleRepository.findById(ref) ;
	}
	
	@RequestMapping(value = "/saveArticles",method=RequestMethod.POST)
	public Article saveArticles(@RequestBody Article c){
		return articleRepository.save(c) ;
	}
	
	@RequestMapping(value = "/Articles/{ref}",method=RequestMethod.DELETE)
	public boolean deleteArticles(@PathVariable String ref){
		articleRepository.deleteById(ref);
		return true ;
	}
	
	@RequestMapping(value = "/updateArticles",method=RequestMethod.PUT)
	public Article updateCrb(@RequestBody Article c){
		return articleRepository.saveAndFlush(c) ;
	}


}
