package be.iccbxl.poo.entities;

import java.time.LocalDate;
import java.util.UUID;

/**
 * repr�sente une personne definie par son nom
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
	 * Date d�inscription � la biblioth�que
	 */
	private LocalDate registrationDate;

	


	

	public String getName() {
		return name;
	}



	public Person(String name) {
		
		this.name = name;
	}

}
