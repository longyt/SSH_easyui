package com.shadow.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shadow.Base.ServletApi;
import com.shadow.Entity.StudentEntity;
import com.shadow.Service.StudentService;
import com.shadow.Service.Impl.StudentServiceImpl;

@Component
@ParentPackage("shadow")
public class StudentAction extends ServletApi{
	
	@Autowired
	StudentServiceImpl studentService;
	
	@Action(value="QueryStudent")
	public void QueryStudentList() throws Exception{
		List<StudentEntity> list = studentService.QueryList("Student",StudentEntity.class);
		write(JSON.toJSONString(list));
		studentService.SessionClose();
	}
	
	@Action("DelteStudent")
	public void DeleteStudent() throws Exception{
		StudentEntity studentEntity = (StudentEntity) InsertSstuEntity(StudentEntity.class);
		/*String RequestData = getRequest().getParameter("");
		JSONObject jsonObject = JSON.parseObject(RequestData);
		StudentEntity studentEntity = JSON.toJavaObject(jsonObject, StudentEntity.class);*/
		studentService.StudentDelete(studentEntity);
	}
	@Action("UpdateStudent")
	public void UpdateStudent() throws Exception{
		StudentEntity studentEntity = (StudentEntity) InsertSstuEntity(StudentEntity.class);
		System.out.println(studentEntity.getSname());
		studentService.StudentUpdate(studentEntity);
		//String RequestData = getRequest().getParameter("jsondata");
		//StudentEntity studentEntity = JSON.parseObject(RequestData, StudentEntity.class);
		
	}
	@Action(value="InsertStudent")
	public void InsertStudent() throws Exception{
		StudentEntity studentEntity = (StudentEntity) InsertSstuEntity(StudentEntity.class);
		System.out.println(studentEntity.getSname());
		/*String RequestData = getRequest().getParameter("");
		JSONObject jsonObject = JSON.parseObject(RequestData);
		StudentEntity studentEntity = JSON.toJavaObject(jsonObject, StudentEntity.class);*/
		studentService.StudentInsert(studentEntity);
	}

}
