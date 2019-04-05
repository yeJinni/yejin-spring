package org.yejin.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("skyrocket0240@naver.com");
		req.setPassword("yj102030!^^");
		req.setName("yeJinni");

		// 회원 등록
regService.regist(req);
	}
}