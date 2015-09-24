package com.webapp.idgenerator;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;



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

import com.webapp.mapper.MemberMapper;
import com.webapp.model.Member;




public class OracleSequenceTest {

		static Log log = LogFactory.getLog(OracleSequenceTest.class);
		public static void main(String[] args) throws SQLException, IOException {
		
			
//			jdbc();
//			jdbcTemplate();
//			SqlSession();
			SqlSessionTemplate();
		
		}
		
		static void SqlSessionTemplate() throws IOException, SQLException{
			
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
			ctx.getEnvironment().setActiveProfiles("oracle");
			ctx.load("spring/beans_oracle.xml", "spring/beans_mysql.xml");
			ctx.refresh();
			
			DataSource ds = (DataSource) ctx.getBean("dataSource");
		
			Connection con = ds.getConnection();
			log.info("DataBase: "+ con.getMetaData().getDatabaseProductName());
			log.info("Version: "+ con.getMetaData().getDatabaseProductVersion());
			log.info("Major: "+ con.getMetaData().getDatabaseMajorVersion());
			log.info("Minor: "+ con.getMetaData().getDatabaseMinorVersion());
			
			MemberMapper mapper = ctx.getBean(MemberMapper.class);
			
			Member member = ctx.getBean(Member.class);
			
			member.setEmail("xxx@oracle.com"+ (int)(Math.random()*100000));
			
			
			log.info(member.getRegdate());

			mapper.insert(member);
			
		}
		
		
		static void SqlSession() throws IOException {
			
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis_config.xml");
			SqlSessionFactory factory = builder.build(inputStream, "oracle");
			
			SqlSession session = factory.openSession(false);

			String statement = null;
			
//			
//			ibatis CRUD ==> 매퍼파일(xml)
//			
			Member member = session.selectOne("com.webapp.mapper.MemberMapper.selectById", 1006);
			if(member != null){
				log.info("id: "+ member.getId());
			}
			
			
			List<Member> list = session.selectList("com.webapp.mapper.MemberMapper.selectAll");
			log.info("member size: "+ list.size());
			
			member = new Member();
			member.setEmail("xxxx@xxxx.com"+ (int)(Math.random()*1000));
			member.setPassword("yyy");
			member.setName("홍길동");
			member.setRegdate(new Date());
			session.insert("com.webapp.mapper.MemberMapper.insert", member);
//			session.delete("com.webapp.mapper.MemberMapper.delete", null);
//			session.update("com.webapp.mapper.MemberMapper.update", null);
//			
////			
////			Mapper CRUD
////			
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			list = mapper.selectAll();
			log.info("member size: "+ list.size());
			member = mapper.selectById(1000);
			if(member != null){
				log.info(member.getId());
			}

			member = new Member();
			member.setEmail("yyy@xxxx.com"+ (int)(Math.random()*1000));
			member.setPassword("yyy");
			member.setName("홍길동");
			member.setRegdate(new Date());
			mapper.insert(member);
//			dao.deleteByIdWithEmail(0, null);
//			dao.update(null);
			
			session.commit();
//			session.rollback();
		}
		
		static void jdbcTemplate() throws SQLException {
			
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
			ctx.getEnvironment().setActiveProfiles("oracle");
			ctx.load("classpath:spring/beans.xml");
			ctx.refresh();
		
			JdbcTemplate template = ctx.getBean(JdbcTemplate.class);

			
			// 1. select member_id_seq.nextval from dual;
			
			String sql = "select member_id_seq.nextval from dual";
			int seq = template.queryForObject(sql, Integer.class);
			log.info("seq: "+ seq);
			
			
			/* 2. insert into member
			(id, email, password, name, regdate)
			values
			(1004 , 'xxx@xxx.com', 'aaa', 'z''zz', '2015/08/11');*/
		
			String insert = "insert into member" +
					 "(id, email, password, name, regdate)" +
					 "values" +
					 "(?, ?, 'xxx', 'yyy', '2015/08/11')";
			
			template.update(insert, seq, "xxx@"+ seq);
					
					
		}
		
		static void jdbc() throws SQLException {
		
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
			ctx.getEnvironment().setActiveProfiles("oracle");
			ctx.load("classpath:spring/beans.xml");
			ctx.refresh();
			
			BasicDataSource ds = ctx.getBean(BasicDataSource.class);
			log.info(ds.getUrl());
			
			Connection conn = ds.getConnection();
			
			
		
			// 1. select member_id_seq.nextval from dual;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select member_id_seq.nextval from dual");
			
			rs.next();
			int seq = rs.getInt(1);
			log.info("seq: "+ seq);
			
			/* 2. insert into member
				(id, email, password, name, regdate)
				values
				(1004 , 'xxx@xxx.com', 'aaa', 'z''zz', '2015/08/11');*/
			
			String sql = "insert into member" +
						 "(id, email, password, name, regdate)" +
						 "values" +
						 "(?, ?, 'xxx', 'yyy', '2015/08/11')";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			pstmt.setString(2, "xxx@xxx.com"+ seq);
			pstmt.executeUpdate();
			
			conn.close();
	}

}
