package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiResponse;
import com.blog.payloads.CategoryDto;
import com.blog.services.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// CREATE
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
		CategoryDto createCategory = this.categoryService.createCategory(categoryDto);
		return new ResponseEntity<CategoryDto>(createCategory, HttpStatus.CREATED);

	}

	// UPDATE
	@PutMapping("/{catid}")
	public ResponseEntity<CategoryDto> updateCategoryById(@Valid @PathVariable Integer catid,
			@RequestBody CategoryDto categoryId) {
		CategoryDto updatedCategory = this.categoryService.updateCategoryById(categoryId, catid);
		return new ResponseEntity<CategoryDto>(updatedCategory, HttpStatus.OK);

	}

	// DELETE
	@DeleteMapping("/{catid}")
	public ResponseEntity<ApiResponse> deleteCategoryById(@PathVariable Integer catid) {
		this.categoryService.deleteCategoryById(catid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("category is deleted successfully !!", true),
				HttpStatus.OK);

	}

	// GET BY ID
	@GetMapping("/{catid}")
	public ResponseEntity<CategoryDto> getCategoryById(@PathVariable Integer catid) {
		CategoryDto categoryDtos = this.categoryService.getCategoryById(catid);
		return new ResponseEntity<CategoryDto>(categoryDtos, HttpStatus.OK);
	}

	// GET ALL
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAllCategories() {
		List<CategoryDto> categories = this.categoryService.getAllCategories();
		return ResponseEntity.ok(categories);

	}

}
