package com.webapp.dao;

import java.util.List;

import com.webapp.model.Member;

public interface MemberDao {

	List<Member> selectAll();

	Member selectById(int id);
	Member selectByEamil(String email);
	Member selectByEamilWith(String email, String password);
	
	void insert(Member member);
	void update(Member member);
	void deleteByIdWithEmail(int id, String email);
	
}
