package bookstore.other;

import javax.persistence.EntityManager;

import bookstore.Orders;

public class StoreService {

	// ======================================
	// = Attributes =
	// ======================================

	private EntityManager em;

	// ======================================
	// = Constructors =
	// ======================================

	public StoreService(EntityManager em) {
		this.em = em;
	}

	// ======================================
	// = Public Methods =
	// ======================================

	public Orders createOrder(Orders order) {
		em.persist(order);
		return order;
	}

	public void removeOrder(Long id) {
		Orders order = em.find(Orders.class, id);
		if (order != null)
			em.remove(order);
	}

	public Orders findOrder(Long id) {
		return em.find(Orders.class, id);
	}
	
}
