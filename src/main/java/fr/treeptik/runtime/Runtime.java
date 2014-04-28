package fr.treeptik.runtime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.treeptik.model.Animal;
import fr.treeptik.model.Personne;
import fr.treeptik.service.PersonneService;

public class Runtime {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PersonneService personneService = context.getBean(PersonneService.class);
		
		Personne personne = personneService.findById(7);
		
		List<Animal> animaux = new ArrayList<>();
		animaux.add(new Animal());
		animaux.add(new Animal());
		animaux.add(new Animal());
		personne.setAnimal(animaux);
		
		personneService.update(personne);
		
	}
	
}
