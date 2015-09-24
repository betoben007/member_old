package com.webapp.idgenerator;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.webapp.mapper.IdGeneratorMapper;
import com.webapp.mapper.MemberMapper;
import com.webapp.model.Member;




public class GeneratorTableTest {

		static Log log = LogFactory.getLog(GeneratorTableTest.class);
		static GenericXmlApplicationContext ctx;
		
		public static void main(String[] args) throws SQLException {
		
			ctx = new GenericXmlApplicationContext();
//			ctx.getEnvironment().setActiveProfiles("mysql");
			ctx.getEnvironment().setActiveProfiles("oracle");
			ctx.load("classpath:spring/beans.xml");
			ctx.refresh();
			
			
			
			for(int i = 0; i<10; i++){
				Runnable r= new Runnable() {
					
					@Override
					public void run() {
						
						
						try {
//							jdbc();
//							jdbcTemplate();
							SqlSession();
//							SqlSessionTemplate();
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						
					}
				};
				Thread t= new Thread(r);
				t.start();
				
				

			}
		
		}
		
		
		
		static void SqlSession() throws IOException, InterruptedException{
			
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis_config.xml");
			SqlSessionFactory factory = builder.build(inputStream, "mysql");
			 			
			SqlSession session = factory.openSession(false);
	
			IdGeneratorMapper idGeneratorMapper = session.getMapper(IdGeneratorMapper.class);
			MemberMapper memberMapper = session.getMapper(MemberMapper.class);
			
			Map<String, Object> idGen = idGeneratorMapper.selectByName("memberId");
			int nextval = ((BigDecimal)idGen.get("nextval")).intValue();
			int incval = ((BigDecimal)idGen.get("incval")).intValue();
			int seqno = nextval + incval;
			
			Thread.sleep((int)(Math.random()*3000));
			
			idGen.put("nextval", seqno);
			idGeneratorMapper.update(idGen);
			
			Member member = new Member();
			member.setId(seqno);
			member.setEmail("xxx@gen.com"+ (int)(Math.random()*1000));
			member.setPassword("1234");
			member.setName("홍길동");
			member.setRegdate(new Date());
			
			memberMapper.insertGenerator(member);
		
			log.info("seqno: "+ seqno);
			
			session.commit();
			session.close();
		}
		
		static void jdbcTemplate() throws SQLException, InterruptedException {
			
			JdbcTemplate template = ctx.getBean(JdbcTemplate.class);

			String sql = "select name, nextval, incval "
						+ "from id_generator "
						+ "where name = 'memberId' "
						+ "for update";
			
			DataSourceTransactionManager tm = new DataSourceTransactionManager();
			tm.setDataSource(ctx.getBean(DataSource.class));
			
			DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
			definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			definition.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
			definition.setReadOnly(false);
//			definition.setTimeout(10);
			
			TransactionStatus status = tm.getTransaction(definition);
			
			// 1. select member_id_seq.nextval from dual;
			
			Map<String, Object> gen = template.queryForMap(sql);
			
			Thread.sleep((int)(Math.random()*3000));
			
			String name = (String) gen.get("name");
			int nextval = ((BigDecimal) gen.get("nextval")).intValue();
			int incval = ((BigDecimal) gen.get("incval")).intValue();
			
			
			String update = "update id_generator "
							+ "set nextval = ? "
							+ "where name = 'memberId'";
			
			template.update(update, nextval + incval);
			
			
			
			String insert = "insert into member2" +
					"(id, email, password, name, regdate)" +
					"values" +
					"(?, ?, 'xxx', 'yyy', '2015/08/11')";
			
			template.update(insert, nextval + incval, "xxx@"+ nextval);
			
			
			
			tm.commit(status);
			
			log.info("name: "+ name +", nextval: "+ (nextval + incval) +", incval: "+ incval);
			
			/* 2. insert into member
			(id, email, password, name, regdate)
			values
			(1004 , 'xxx@xxx.com', 'aaa', 'z''zz', '2015/08/11');*/
		/*
			String insert = "insert into member2" +
					 "(id, email, password, name, regdate)" +
					 "values" +
					 "(?, ?, 'xxx', 'yyy', '2015/08/11')";
			*/
//			template.update(insert, seq, "xxx@"+ seq);
					
					
		}
		
		
		
		
		
		static void jdbc() throws SQLException {
		
			try {
				Thread.sleep((int)(Math.random()*3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			DataSource ds = ctx.getBean(DataSource.class);
			log.info(((BasicDataSource)ds).getUrl());
			
			Connection conn = ds.getConnection();
			conn.setAutoCommit(false);
			
		
			// 1. select member_id_seq.nextval from dual;
			Statement stmt = conn.createStatement();
			
			String sql = "select name, nextval, incval "
						  + "from id_generator "
						  + "where name = 'memberId' "
						  + "for update";
			ResultSet rs = stmt.executeQuery(sql);
			
			rs.next();
			String name = rs.getString("name");
			int nextval = rs.getInt("nextval");
			int incval = rs.getInt("incval");
			int seq = nextval + incval;
			log.info("seq: "+ seq);
			
			
			/* 2. insert into member
				(id, email, password, name, regdate)
				values
				(1004 , 'xxx@xxx.com', 'aaa', 'z''zz', '2015/08/11');*/
			
			String insert = "insert into member2" +
							"(id, email, password, name, regdate)" +
							"values" +
							"(?, ?, 'xxx', 'yyy', '2015/08/11')";
			
			PreparedStatement pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, seq);
			pstmt.setString(2, "xxx@xxx.com"+ seq);
			pstmt.executeUpdate();
			
			String update = "update id_generator "
							+ "set nextval = ? "
							+ "where name = 'memberId'";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, seq);
			pstmt.execute();
			
			conn.commit();
			conn.close();
	}

}
