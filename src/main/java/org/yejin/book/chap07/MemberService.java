package org.yejin.book.chap07;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yejin.book.chap03.Member;


@Service
public class MemberService {

	Logger logger = LogManager.getLogger();

	@Autowired
	MemberDao memberDao = null;

	/**
	 * memberDao setter for injection
	 */

	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}

	public void updateMember() {
		Member member = memberDao.selectByEmail("skyrocket0240@naver.com");
		member.setPassword("b");
		memberDao.update(member);
		logger.debug("Update complete.");
	}

	public void insertMember() {
		Member member = new Member();
		member.setEmail("skyrocket0240_@naver.com");
		member.setPassword("yj102030!^^");
		member.setName("¹Ú¿¹Áø");
		memberDao.insert(member);
		logger.debug("Insert complete.");
	}
}