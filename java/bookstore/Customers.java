package bookstore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Customers {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="first_name",length=50)
	protected String firstName;
	
	@Column(name="surname", length=50)
	protected String surname;
	
	@Column(name="member", length=10)
	protected Boolean member;
	
	@Column(name="email", length=50)
	protected String email;
	
	@Column(name="password", length = 50)
	protected String password;
	
	public Customers() {
		
	}
	
	public Customers(String firstName, String surname, Boolean member, String email, String password) {
		this.firstName = firstName;
		this.surname = surname;
		this.member = member;
		this.email = email;
		this.password = password;		
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
	
	public String getSurame() {
		return surname;
	}
	
	public void setSurame(String surname) {
		this.surname = surname;
	}
	
	public boolean getMember() {
		return member;
	}
	
	public void setMember(Boolean member) {
		this.member = member;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

}
