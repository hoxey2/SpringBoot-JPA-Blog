package com.hoxey2.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoxey2.blog.model.User;

// DAO
// 자동으로 bean등록이 된다.
// @Repository //생략 가능하다.
public interface UserRepository extends JpaRepository<User, Integer> {
}






//JPA Naming 전략
// SELECT * FROM user WHERE username = ? AND password = ?;
// User findByUsernameAndPassword(String username, String password);
//	@Query(value="SELECT * FROM user WHERE username = ? AND password = ?", nativeQuery = true)
//	User login(String username, String password);