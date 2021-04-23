/**
 * 
 */
package be.iccbxl.poo.entities;

import java.util.ArrayList;
/**
 * Repr�sente la biblioth�que
 * Definie par son nom,la lsite de membre et la liste des livres.
 * @author El Hasouni Hamza
 * @version 0.1
 * @see Book
 * @see Person
 */
public class MyLibrary {
	
	/**
	 * Le nom de la biblioth�que
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
	 * Liste maximume de livre physique qu'un membre peut emprunt� � la fois
	 */
	public static final byte BOOK_LIMIT = 3;
	
	/**
	 * Cr�e une biblioth�que en sp�cifiant son nom
	 * 
	 * @param name Nom de la biblioth�que

	 */

	public MyLibrary(String name) {
		
		this.name = name;
		
		this.books= new ArrayList<Book>();
		this.people= new ArrayList<Person>();
		
		
	}
	/**
	 * Renvoie le nom de la biblioth�que 
	 * @return le nom de la bibioth�que
	 */

	public String getName() {
		
		
		return name;
	}
	/**
	 * Modifie le nom de la biblioth�que 
	 * @param name Nouveau nom de la biblioth�que
	 */
	public void setName(String name) {
		
		this.name = name;
	}
	/**
	 * Renvoie la liste des livres 
	 * @return la liste des livres 
	 */
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
