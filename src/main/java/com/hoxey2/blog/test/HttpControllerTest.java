package com.hoxey2.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML파일)
//@Controller
//
//사용자가 요청 -> 응답(Data)
//@RestController

@RestController
public class HttpControllerTest {
//	
//	private static final String TAG = "HttpControllerTest : ";
//	
//	// localhost:8000/blog/http/lombok
//	@GetMapping("/http/lombok")
//	public  String lombokTest() {
//		Member m = Member.builder().username("hoxey2").password("1234").email("hoxey2@gmail.com").build();
//		System.out.println(TAG+"getter : "+m.getUsername());
//		m.setUsername("hanok");
//		System.out.println(TAG+"setter : "+m.getUsername());
//		return "lombok test 완료";
//
//	}
//	// http://localhost:8080/~
//	// 인터넷 브라우저 요청은 무조건 get요청밖에 할수 없다.
//	@GetMapping("/http/get") //(select)
//	public String getTest(Member m) {
//		return "get 요청:" + m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
//	}
//	
//	@PostMapping("/http/post") //(insert)
//	public String postTest(@RequestBody Member m) { //MessageConverter 스프링부트
//		return "post 요청:" + m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
//	}
//	
//	@PutMapping("/http/put") //(update)
//	public String putTest(@RequestBody Member m) {
//		return "put 요청"+ m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
//	}
//	
//	@DeleteMapping("/http/delete") //(delete)
//	public String deleteTest() {
//		return "delete 요청";
//	}
}
