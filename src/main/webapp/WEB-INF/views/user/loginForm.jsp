<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="form-group">
			<label for="username">Username:</label> 
			<input type="text"  name="username"
				class="form-control" placeholder="Enter Username" id="username">
		</div>
		
		<div class="form-group">
			<label for="password">Password:</label> 
			<input type="password"  name="password" class="form-control" placeholder="Enter password" id="password">
		</div>
		
		<div class="form-group form-check">
			<label class="form-check-label"> 
			<input name="remember" class="form-check-input" type="checkbox"> 로그인 정보 기억
			</label>
			
		</div>
		
	</form>
	<button id="btn-login" class="btn btn-primary">로그인</button>
</div>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>

