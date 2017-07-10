package com.beeva.jpa.implementacion;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.jpa.dao.userDAO;
import com.beeva.jpa.models.User;
@Repository			//Es un componente en especifico
public class userDAOImpl extends userDAO{
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional //Las operaciones son transaccionales, si algo sale mal ya no se realizara la accion
	public User save(User user) {
		em.persist(user); //Que objeto quiero que sea persistente al guardar, en este caso el usuario
		return user;
	}

	@Override
	public User getUser(int id) {
		return em.find(User.class, id);
	}

}
