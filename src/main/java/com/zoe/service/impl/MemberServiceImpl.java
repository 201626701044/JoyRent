package com.zoe.service.impl;

import com.zoe.mapper.MemberMapper;
import com.zoe.pojo.Member;
import com.zoe.service.MemberService;
import com.zoe.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberMapper memberMapper;
	
	
	public List<Member> list(){
		return memberMapper.list();
	}

	@Override
	public List<Member> list(Page page) {
		// TODO Auto-generated method stub
		return memberMapper.list(page);
	}

	@Override
	public int total() {
		return memberMapper.total();
	};

}
