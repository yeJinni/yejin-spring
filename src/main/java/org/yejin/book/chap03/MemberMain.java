package org.yejin.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
<<<<<<< HEAD
		MemberRegisterService regService = new MemberRegisterService(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jacob@irafe.com");
		req.setPassword("xxxx");
		req.setName("Jacob");
=======
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("skyrocket0240@naver.com");
		req.setPassword("yj102030!^^");
		req.setName("yeJinni");
>>>>>>> 4802ae48931023275e83ef11f864730dec43cdda

		// 회원 등록
		regService.regist(req);
	}
}