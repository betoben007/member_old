package com.webapp.mapper;

import java.util.List;

import com.webapp.model.Member;

public interface MemberMapper {

	List<Member> selectAll();
	Member selectById(int id);
	int insert(Member member);
	int insertGenerator(Member member);
	
	
}
