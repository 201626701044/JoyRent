package com.zoe.service;



import com.zoe.pojo.Member;
import com.zoe.util.Page;

import java.util.List;


public interface MemberService {

	List<Member> list();
	int total();
	List<Member> list(Page page);
}
