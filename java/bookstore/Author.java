package bookstore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="first_name", length=50)
	protected String firstName;
	
	@Column(name="surname", length=50)
	protected String surname;
	
	public Author(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}
	
	public Author(){
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
