package com.webapp.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.webapp.model.Member;

public  class SpringMemberDao implements MemberDao{

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {

		this.template = template;
	}
	
	
	@Override
	public List<Member> selectAll() {
		
		return template.query("select * from member", new BeanPropertyRowMapper<Member>(Member.class));
	}

	@Override
	public Member selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectByEamil(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectByEamilWith(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByIdWithEmail(int id, String email) {
		// TODO Auto-generated method stub
		
	}

	

}
