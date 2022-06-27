package com.hoxey2.blog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoxey2.blog.model.User;
import com.hoxey2.blog.repository.UserRepository;

// 스프링이 컴포넌트 스캔을 통해서 Bean에 등록을 해줌. IOC를 해줌
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

////	@Autowired
////	private BCryptPasswordEncoder encoder;
//
	@Transactional // 성공하면 실행, 실패하면 롤백
	public void 회원가입(User user) {
		userRepository.save(user);
	}
	
	@Transactional(readOnly = true) // Select할 때 트랜잭션 시작, 서비스 종료시에 트랜잭션 종료(정합성)
	public User 로그인(User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
}
