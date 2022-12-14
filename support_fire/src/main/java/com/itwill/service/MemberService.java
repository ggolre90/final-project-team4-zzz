package com.itwill.service;


import java.util.List;

import com.itwill.dto.Member;

public interface MemberService {

	Member selectById(String m_id) throws Exception;
	
	List<Member> selectAllmembers() throws Exception;
	
	int insertMember(Member member) throws Exception;
	
	int updateMember(Member member) throws Exception;
	
	int deleteMember(String m_id) throws Exception;
	
}
