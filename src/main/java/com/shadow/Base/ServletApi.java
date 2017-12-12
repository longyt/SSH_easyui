package com.shadow.Base;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

public class ServletApi {
	HttpServletRequest request;
	HttpServletResponse response;
	
	
	public void getReqRes(){
		request = ServletActionContext.getRequest();
		response = ServletActionContext.getResponse();
	}
	public void write(String object) throws Exception{
		getReqRes();
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().println(object);
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	public Object InsertSstuEntity(Class clazz) throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		Enumeration<String> ParameterNames=request.getParameterNames();
		Field [] fields = clazz.getDeclaredFields();
		Object object = clazz.newInstance();
		while(ParameterNames.hasMoreElements()){
			String Parametername = ParameterNames.nextElement();
			String[] Parametervalue = request.getParameterValues(Parametername);
			//
			for (Field field : fields){
				field.setAccessible(true);
				Object tempvalue = null;
				if(field.getName().equals(Parametername)){
					if(field.getType().getSimpleName().equals("Integer")){
						tempvalue = Integer.parseInt(Parametervalue[0]);
						field.set(object, tempvalue);
						break;
					}else{
						tempvalue = Parametervalue[0];
						field.set(object, tempvalue);
						break;
					}
				}
		}
	}
		return object;
}

	
}
