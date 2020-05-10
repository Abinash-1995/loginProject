package com.oehm.um.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.oehm.um.entity.Register;
@Repository
public class RegisterDao {
	
	private SessionFactory sessionFactory;
	
	public void saveRegisterData(Register register) {
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.save(register);
			transaction.commit();
		}catch (HibernateException e) {
			System.out.println(e.getStackTrace());
		}finally {
			session.close();
			sessionFactory.close();
		}
		
	}

}
