package com.blog.services;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {

	// CREATE
	CategoryDto createCategory(CategoryDto categoryDto);

	// UPDATE
	CategoryDto updateCategoryById(CategoryDto categoryDto, Integer categoryId);

	// DELETE
	void deleteCategoryById(Integer categoryId);

	// GET
	CategoryDto getCategoryById(Integer categoryId);

	// GET ALL
	List<CategoryDto> getAllCategories();

}
