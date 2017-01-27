package bookstore;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<OrderLines> orderLines = new HashSet<>();
	
	@Column(name = "address", length = 50)
	private String address;
	
	@Column(name = "customer_id", length = 50)
	private Long customerId;
	
	@Column(name = "store_id", length=50)
	private Long storeId;
	
	public Orders(){
		
	}

	public Orders(String address, Long customerId){
		this.address = address;
		this.customerId = customerId;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public Set<OrderLines> getOrderLines() {
		return orderLines;
	}
	
	public void setOrderLines(Set<OrderLines> orderLines) {
		this.orderLines = orderLines;
	}
	
	public Long getStoreId() {
		return storeId;
	}
	
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	
}
