package com.oraclejava.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.Entity.Member;
import com.oraclejava.Repository.MemberRepository;

@Service
public class MemberSerivice {
	
	@Autowired
	MemberRepository memberRepository;

	public void save(Member member) {
		memberRepository.save(member);
	}
	
	public Optional<Member> findById(String id) {
		return memberRepository.findById(id);
	}
	
}
