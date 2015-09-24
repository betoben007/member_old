package com.webapp.spring;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.webapp.mapper.MemberMapper;
import com.webapp.model.Member;

public class CreateBeanTest {

	static Log log = LogFactory.getLog(CreateBeanTest.class);
	
	public static void main(String[] args) throws Exception {

//		
//		object(객체)를 생성방법
//		
//		1. new 생성
//		2. static method 객체생성 newInstance() 이유 Singleton
//		3. FactoryBean으로 객체생성
//		
		
		String resources = "com/webapp/spring/createbean.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(resources);
		
		SqlSession session = ctx.getBean(SqlSession.class);
		SqlSessionTemplate session1 = ctx.getBean(SqlSessionTemplate.class);
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		List<Member> list = mapper.selectAll();
		
		log.info(list.size());
	
	}

}
