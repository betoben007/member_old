package com.webapp.dao;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webapp.model.Member;

public class MemberDaoTest {

	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("spring/beans.xml");
		
		MemberDao dao = factory.getBean(MemberDao.class);
		
		List<Member> list = dao.selectAll();
		
		for(Member m:list){
			
			System.out.println(m.getId() + " " + m.getEmail());
		}
	
	
	
	}

}
