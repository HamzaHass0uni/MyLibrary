package be.iccbxl.poo.entities;

import java.time.LocalDate;
import java.util.UUID;

/**
 * représente une personne definie par son nom
 * 
 * @author El Hassouni Hamza
 * @version 0.1
 */


public class Person {
	/**
	 * Identifiant de la personne
	 */

	
	protected UUID id;
	
	/**
	 * Nom de la personne
	 */

	private String name;
	
	/**
	 * Date d’inscription à la bibliothèque
	 */
	private LocalDate registrationDate;

	


	

	public String getName() {
		return name;
	}



	public Person(String name) {
		
		this.name = name;
	}

}
