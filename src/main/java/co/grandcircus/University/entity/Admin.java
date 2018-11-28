package co.grandcircus.University.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Admin extends User {

	public Admin() {
		super();
	}

	public Admin(Long id, String first, String last, String email, String password) {
		super(id, first, last, email, password);
	}
	
	

}
