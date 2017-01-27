package com.qa.persistence.demo01;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qa.persistence.CD;
import com.qa.persistence.Musician;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n\n>>> Executing : " + Main.class.toString() + " <<<\n");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("module04-persistence-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		CDService service = new CDService(em);

		// Creates and persists a CD
		tx.begin();
		Set<Musician> beatles = new HashSet<>();
		beatles.add(new Musician("John", "Lennon")); //Dead	- Assassinated!
		beatles.add(new Musician("Paul", "McCartney")); //Alive
		beatles.add(new Musician("Ringo", "Starr")); //Alive
		beatles.add(new Musician("Georges", "Harrison")); //Dead
		CD sergentPepper = new CD("Sergent Pepper");
		sergentPepper.setMusicians(beatles);
		sergentPepper = service.createCD(sergentPepper);
		tx.commit();

		System.out.println("CD Persisted : " + sergentPepper);

		// Finds the cd
		sergentPepper = service.findCD(sergentPepper.getId());

		System.out.println("CD Found     : " + sergentPepper);
		System.out.println("   Musicians : " + sergentPepper.getMusicians());

		// Removes the cd
		tx.begin();
		service.removeCD(sergentPepper.getId());
		tx.commit();

		System.out.println("CD Removed");

		// Finds the cd
		sergentPepper = service.findCD(sergentPepper.getId());

		System.out.println("CD Not Found : " + sergentPepper);

		em.close();
		emf.close();
	}
}
