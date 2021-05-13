package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
