package com.zoe.mapper;
 


import com.zoe.pojo.Member;
import com.zoe.util.Page;

import java.util.List;


public interface MemberMapper {
 
      
    public int add(Member member);
       
      
    public void delete(int member_ID);
       
      
    public Member get(int member_ID);
     
      
    public int update(Member member);
       
      
    public List<Member> list();

    public List<Member> list(Page page);

    public int total();

}