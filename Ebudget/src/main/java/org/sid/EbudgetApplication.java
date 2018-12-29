package org.sid;


import org.sid.dao.ArticleRepository;
import org.sid.dao.CompteBudgetaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbudgetApplication implements CommandLineRunner{
	
	@Autowired
	private ArticleRepository articleRepository ;
	
	@Autowired
	private CompteBudgetaireRepository budgetaireRepository ;

	public static void main(String[] args) {
		SpringApplication.run(EbudgetApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//articleRepository.save(new Article("Art1",budgetaireRepository.getOne("001001"))) ;
		
	}

}

