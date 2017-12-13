package com.shadow.Base;

import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.shadow.Entity.StudentEntity;
import com.sun.org.apache.xpath.internal.operations.String;

public class StudentBaseImpl<S> extends InitSession{
	
	public List<S> QueryList(java.lang.String sql,Class<S> clazz,int first,int max){
		OpenSession();
		List<S> list = session.createQuery("from "+sql,clazz).setFirstResult(first).setMaxResults(max).getResultList();
		return list;
	}
	
	public int QUeryMax(java.lang.String sql){
		OpenSession();
		BeginTransaction();
		int max = (int) session.createQuery(sql).uniqueResult();
		TransactionCommit();
		SessionClose();
		return max;
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
