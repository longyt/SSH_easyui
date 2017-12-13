package com.shadow.Base;

import java.util.List;

import com.shadow.Entity.StudentEntity;
import com.sun.org.apache.xpath.internal.operations.String;

public interface StudentImplInterface<S> {
	
	List<S> QueryList(java.lang.String sql,Class<S> clazz,int first,int max);
	
	int QUeryMax(java.lang.String sql);
	
	void StudentInsert(S s);
	
	void StudentDelete(S s);
	
	void StudentUpdate(S s);

}
