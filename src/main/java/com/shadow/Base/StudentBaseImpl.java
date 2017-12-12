package com.shadow.Base;

import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.shadow.Entity.StudentEntity;

public class StudentBaseImpl<S> extends InitSession{
	
	public List<S> QueryList(java.lang.String sql,Class<S> clazz){
		OpenSession();
		List<S> list = session.createQuery("from "+sql,clazz).getResultList();
		return list;
	}
	
	public void StudentInsert(S s){
		OpenSession();
		BeginTransaction();
		
		session.persist(s);
		
		TransactionCommit();
		SessionClose();
	}
	
	public void StudentDelete(S s){
		OpenSession();
		BeginTransaction();
		
		session.delete(s);
		
		TransactionCommit();
		SessionClose();
	}
	
	public void StudentUpdate(S s){
		OpenSession();
		BeginTransaction();
		
		session.update(s);
		
		TransactionCommit();
		SessionClose();
	}

	
		
}
