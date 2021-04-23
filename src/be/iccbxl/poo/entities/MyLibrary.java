/**
 * 
 */
package be.iccbxl.poo.entities;

import java.util.ArrayList;
/**
 * Représente la bibliothèque
 * Definie par son nom,la lsite de membre et la liste des livres.
 * @author El Hasouni Hamza
 * @version 0.1
 * @see Book
 * @see Person
 */
public class MyLibrary {
	
	/**
	 * Le nom de la bibliothèque
	 */
	private String name ;
	
	/**
	 * Liste des livres 
	 */
	private ArrayList<Book> books;
	
	/**
	 * Liste des membres 
	 */
	
	private ArrayList<Person> people;
	
	/**
	 * Liste maximume de livre physique qu'un membre peut emprunté à la fois
	 */
	public static final byte BOOK_LIMIT = 3;
	
	/**
	 * Crée une bibliothèque en spécifiant son nom
	 * 
	 * @param name Nom de la bibliothèque

	 */

	public MyLibrary(String name) {
		
		this.name = name;
		
		this.books= new ArrayList<Book>();
		this.people= new ArrayList<Person>();
		
		
	}
	/**
	 * Renvoie le nom de la bibliothèque 
	 * @return le nom de la bibiothèque
	 */

	public String getName() {
		
		
		return name;
	}
	/**
	 * Modifie le nom de la bibliothèque 
	 * @param name Nouveau nom de la bibliothèque
	 */
	public void setName(String name) {
		
		this.name = name;
	}
	/**
	 * Renvoie la liste des livres 
	 * @return la liste des livres 
	 */
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
