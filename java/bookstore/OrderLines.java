package bookstore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class OrderLines {

		@Id
		@GeneratedValue
		private Long id;
		
		@Column(name = "book_id", length = 50)
		protected Long bookId;
		
		@Column(name = "quantity", length =50)
		protected int quantity;
		
		public OrderLines(){
			
		}

		public OrderLines(Long bookId, int quantity){
			this.bookId = bookId;
			this.quantity = quantity;
		}
		
		public Long getId() {
			return id;
		}
		
		public Long getBookId() {
			return bookId;
		}
		
		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
}
