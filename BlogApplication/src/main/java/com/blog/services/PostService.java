package com.blog.services;

import java.util.List;

import com.blog.entity.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {

	// CREATE
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// UPDATE
	PostDto updatePost(PostDto postDto, Integer postId);

	// DELEET
	void deletePost(Integer postId);

	// GET SINGLE POST
	PostDto getPostById(Integer postId);

	// GET ALL POST
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

	// GET ALL POSTS BY CATEGORY
	List<PostDto> getPostsByCategory(Integer categoryId);

	// GET ALL POSTS BY USER
	List<PostDto> getPostsByUser(Integer userId);

	// SEARCH POST BY KEYWORD
	List<PostDto> searchPosts(String keywords);

}
