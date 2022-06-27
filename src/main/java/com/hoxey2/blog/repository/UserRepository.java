package com.hoxey2.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoxey2.blog.model.User;

// DAO
// 자동으로 bean등록이 된다.
// @Repository //생략 가능하다.
public interface UserRepository extends JpaRepository<User, Integer> {
	//JPA Naming 쿼리
	User findByUsernameAndPassword(String username, String password);
}

// <두가지 방법>

//JPA Naming 전략
// SELECT * FROM user WHERE username = ?1 AND password = ?2;
// User findByUsernameAndPassword(String username, String password);

//	@Query(value="SELECT * FROM user WHERE username = ?1 AND password = ?2", nativeQuery = true)
//	User login(String username, String password);
