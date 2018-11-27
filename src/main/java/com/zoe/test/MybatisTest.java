package com.zoe.test;

import java.util.List;

import com.zoe.mapper.MemberMapper;
import com.zoe.pojo.Member;
import com.zoe.util.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private MemberMapper memberMapper;

	//  @Test
	public void testAdd() {
		for (int i = 0; i < 100; i++) {
			Member member = new Member();
			member.setMember_name("new Member");
			memberMapper.add(member);
		}

	}

	@Test
	public void testTotal() {
		int total = memberMapper.total();
		System.out.println(total);
	}

	@Test
	public void testList() {
		Page p = new Page();
		p.setStart(2);
		p.setCount(3);
		List<Member> cs=memberMapper.list(p);
		for (Member c : cs) {
			System.out.println(c.getMember_name());
		}
	}

//	@Test
//	public void testList() {
//		PageHelper.offsetPage(0, 5);
//		List<Member> cs=memberMapper.list();
//		System.out.println(cs.getClass());
//		for (Member c : cs) {
//			System.out.println(c.getMember_name());
//		}
//		System.out.println(new PageInfo(cs).getTotal());
//	}

}
