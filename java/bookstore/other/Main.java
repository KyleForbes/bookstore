package bookstore.other;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bookstore.Author;
import bookstore.Book;
import bookstore.Customers;
import bookstore.OrderLines;
import bookstore.Orders;
import bookstore.Store;


/*import com.qa.persistence.CD;
import com.qa.persistence.Musician;
import com.qa.persistence.demo01.CDService;
import com.qa.persistence.demo01.Main;*/


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\n>>> Executing : " + Main.class.toString() + " <<<\n");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("module04-persistence-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		StoreService service = new StoreService(em);
		
		// Creates and persists a CD
		tx.begin();
		Set<OrderLines> orderLines = new HashSet<>();
		Author author1 = new Author("JK", "Rowling");
		Author author2 = new Author("Anthony", "Burgess");
		Book book1 = new Book("Harry Potter","fantasy",author1,"paperback");
		Book book2 = new Book("A Clockwork Orange","science fiction",author2,"paperback");
		orderLines.add(new OrderLines(book1.getId(),1));
		orderLines.add(new OrderLines(book2.getId(),1));
		Orders order1 = new Orders();
		order1.setOrderLines(orderLines);
		Customers customer1 = new Customers("John","Smith",true, "jsmith@gmail.com","password");
		order1.setAddress("test address");
		order1.setCustomerId(customer1.getId());
		order1 = service.createOrder(order1);
		tx.commit();
		
		System.out.println("Order Persisted : " + order1);
		//
		tx.commit();

		// Finds the order
		order1 = service.findOrder(order1.getId());

		System.out.println("Order Found     : " + order1);
		System.out.println("   Books : " + order1.getOrderLines());

		// Removes the order
		tx.begin();
		service.removeOrder(order1.getId());
		tx.commit();

		System.out.println("Order Removed");

		// Finds the order
		order1 = service.findOrder(order1.getId());

		System.out.println("Order Not Found : " + order1);

		em.close();
		emf.close();

	}
}
