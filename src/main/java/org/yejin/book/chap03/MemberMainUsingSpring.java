package org.yejin.book.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MemberRegisterService를 테스트한다.<br>
 * Spring ApplicationContext로 빈을 생성한다.
 * 
<<<<<<< HEAD
 * @author Yejin
=======
 * @author Jacob
>>>>>>> 4802ae48931023275e83ef11f864730dec43cdda
 */
public class MemberMainUsingSpring {

	public static void main(String[] args) {
<<<<<<< HEAD
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap03.xml");
=======
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chap03.xml");
>>>>>>> 4802ae48931023275e83ef11f864730dec43cdda
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("skyrocket0240@naver.com");
		req.setPassword("yj102030!^^");
		req.setName("yeJinni");

		// 회원 등록
		regService.regist(req);
	}
}