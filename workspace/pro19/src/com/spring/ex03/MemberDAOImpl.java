package com.spring.ex03;

public class MemberDAOImpl implements MemberDAO {
	@Override
	public void listMembers() {
		System.out.println("call listMembers method");
		System.out.println("회원정보 조회");
	}
}
