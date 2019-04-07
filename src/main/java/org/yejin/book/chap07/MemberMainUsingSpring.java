package org.yejin.book.chap07;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * p.204 [����Ʈ 8.13]�� Main�� Service�� �и��� Main �κ�<br>
 * Spring���� bean�� ������
 * 
 * @author Jacob
 */
public class MemberMainUsingSpring {

	/**
	 * main() �޼���
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap07.xml");
		MemberService memberService = ctx.getBean("memberService",MemberService.class);
		memberService.insertMember();
		memberService.selectAll();
		ctx.close();
	}
}