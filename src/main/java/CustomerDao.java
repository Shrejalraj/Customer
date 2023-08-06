package org.jsp.Customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.customermvcapp.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Customerdao {
    @Autowired
	private EntityManager manager;
public Customer save(Customer c) {
	EntityTransaction transaction= manager.getTransaction();
	manager.persist(c);
	transaction.begin();
	transaction.commit();
	return c;
}
public Customer update(Customer c) {
	EntityTransaction transaction= manager.getTransaction();
	manager.merge(c);
	transaction.begin();
	transaction.commit();
	return c;
}
public boolean delete(boolean id){
	EntityTransaction transaction= manager.getTransaction();
	manager.merge(id);
	transaction.begin();
	transaction.commit();
	return id;
}
}
