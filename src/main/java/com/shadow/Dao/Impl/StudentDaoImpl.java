package com.shadow.Dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shadow.Base.StudentBaseImpl;
import com.shadow.Dao.StudentDao;
import com.shadow.Entity.StudentEntity;
import com.sun.org.apache.xpath.internal.operations.String;

@Repository
public class StudentDaoImpl extends StudentBaseImpl<StudentEntity> implements StudentDao{

	@Override
	public List<StudentEntity> QueryList(java.lang.String sql, Class<StudentEntity> clazz, int first, int max) {
		// TODO Auto-generated method stub
		return super.QueryList(sql, clazz, first, max);
	}
	
	@Override
	public int QUeryMax(java.lang.String sql) {
		// TODO Auto-generated method stub
		int max=super.QUeryMax(sql);
		return max;
	}

	@Override
	public void StudentInsert(StudentEntity s) {
		// TODO Auto-generated method stub
		super.StudentInsert(s);
	}

	@Override
	public void StudentDelete(StudentEntity s) {
		// TODO Auto-generated method stub
		super.StudentDelete(s);
	}

	@Override
	public void StudentUpdate(StudentEntity s) {
		// TODO Auto-generated method stub
		super.StudentUpdate(s);
	}



	
	
}
