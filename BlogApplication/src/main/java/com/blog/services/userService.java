package com.blog.services;

import java.util.List;

import com.blog.entity.User;
import com.blog.payloads.UserDto;

public interface userService {

	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);
}
