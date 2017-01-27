package bookstore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Store {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="location", length=50)
	protected String location;
	
	public Store() {
		
	}
	
	public Store(String location) {
		this.location = location;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLcoation(String location) {
		this.location = location;
	}
	
}
