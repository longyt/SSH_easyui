package com.shadow.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shadow.Base.StudentBaseImpl;
import com.shadow.Dao.StudentDao;
import com.shadow.Entity.StudentEntity;
import com.shadow.Service.StudentService;
import com.sun.org.apache.xpath.internal.operations.String;

@Controller

public class StudentServiceImpl extends StudentBaseImpl<StudentEntity>  implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<StudentEntity> QueryList(java.lang.String sql, Class<StudentEntity> clazz, int first, int max) {
		// TODO Auto-generated method stub
		return studentDao.QueryList(sql, clazz, first, max);
	}
	
	@Override
	public int QUeryMax(java.lang.String sql) {
		// TODO Auto-generated method stub
		return studentDao.QUeryMax(sql);
	}
	
	@Override
	public void StudentInsert(StudentEntity s) {
		// TODO Auto-generated method stub
		studentDao.StudentInsert(s);
	}
	
	@Override
	public void StudentDelete(StudentEntity s) {
		// TODO Auto-generated method stub
		studentDao.StudentDelete(s);
	}
	
	@Override
	public void StudentUpdate(StudentEntity s) {
		// TODO Auto-generated method stub
		studentDao.StudentUpdate(s);
	}

	
}
