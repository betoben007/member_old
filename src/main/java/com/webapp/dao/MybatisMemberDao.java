package com.webapp.dao;

import java.util.List;

import com.webapp.model.Member;

public class MybatisMemberDao implements MemberDao{

	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
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
