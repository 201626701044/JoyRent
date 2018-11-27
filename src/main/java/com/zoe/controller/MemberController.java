package com.zoe.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zoe.pojo.Member;
import com.zoe.service.MemberService;
import com.zoe.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class MemberController {
	@Autowired
	MemberService memberService;

	@RequestMapping("listMember")
	public ModelAndView listMember(Page page){
		ModelAndView mav = new ModelAndView();
		//PageHelper.offsetPage(page.getStart(),5);
		List<Member> cs= memberService.list(page);
		//int total = (int) new PageInfo<>(cs).getTotal();
		int total = memberService.total();

		page.caculateLast(total);
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listMember");
		return mav;
	}

}
