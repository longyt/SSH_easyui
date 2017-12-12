package com.shadow.Base;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shadow.Entity.StudentEntity;

@Component
public class InitSession {

	@Autowired
	SessionFactory sessionFactory;
	
	Session session;
	Transaction transaction;
	public void OpenSession(){
		session = sessionFactory.openSession();
	}
	
	public void BeginTransaction (){
		transaction = session.beginTransaction();
	}
	
	public void TransactionCommit(){
		transaction.commit();
	}
	public void SessionClose(){
		if(session.isOpen()){
			session.close();
		}
	}

	
	
}
