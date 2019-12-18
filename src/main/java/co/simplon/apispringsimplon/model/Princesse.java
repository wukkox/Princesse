package co.simplon.apispringsimplon.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Modele pour créer les princesses en générant un id autoincrémenter
 * @author Virgile
 *
 */
public class Princesse {

	private  static AtomicInteger compteur =  new AtomicInteger(0) ;
	
	private String name;
	private String univers;
	private String description;
	private int id;
	private String url;
	
	public Princesse(String name, String univers, String description, String url) {
		this.id = compteur.incrementAndGet();
		this.name = name;
		this.univers = univers;
		this.description = description;
		this.url = url;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnivers() {
		return univers;
	}

	public void setUnivers(String univers) {
		this.univers = univers;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
