package com.gl.SpringMVCGradedProject3.CustomerMgmt.service;

import com.gl.SpringMVCGradedProject3.CustomerMgmt.model.Customer;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerServiceImpl implements CustomerService {

   	private SessionFactory sessionfactory;
     private Session session;
     
     @Autowired
     public CustomerServiceImpl(SessionFactory sessionfactory) {
	    super();
		this.sessionfactory = sessionfactory;
		try {
			this.session = this.sessionfactory.getCurrentSession();
		}catch(HibernateException exptn) {
			this.session = this.sessionfactory.openSession();
		}
	}
		
	@Override
	public List<Customer> findAll() {
			List<Customer>  customers = this.session.createQuery("From Customer").list();
		    return customers;
	}

	@Override
	public Customer findById(long customerId) {
		Customer customer = this.session.get(Customer.class,customerId);
		return customer;
	}

	@Override
	@Transactional
	public void save(Customer customer) {
		Transaction tx = this.session.beginTransaction();
		this.session.saveOrUpdate(customer);
		tx.commit();
	}

	@Override
	@Transactional
	public void delete(long customerId) {
		Transaction tx = this.session.beginTransaction();
		Customer customer = this.session.get(Customer.class,customerId);
		this.session.delete(customer);
		tx.commit();
	}

}
