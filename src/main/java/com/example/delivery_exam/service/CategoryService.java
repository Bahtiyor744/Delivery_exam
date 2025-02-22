package com.example.delivery_exam.service;

import com.example.delivery_exam.dto.CategoryDTO;
import com.example.delivery_exam.entity.Category;
import com.example.delivery_exam.mapper.CategoryMapper;
import com.example.delivery_exam.repo.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(categoryMapper::toCategoryDTO)
                .collect(Collectors.toList());
    }

    public CategoryDTO getCategoryById(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.map(categoryMapper::toCategoryDTO).orElse(null);
    }

    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toCategory(categoryDTO);
        Category savedCategory = categoryRepository.save(category);
        return categoryMapper.toCategoryDTO(savedCategory);
    }

    public CategoryDTO updateCategory(Integer id, CategoryDTO categoryDTO) {
        Optional<Category> existingCategory = categoryRepository.findById(id);
        if (existingCategory.isPresent()) {
            Category category = existingCategory.get();
            category.setName(categoryDTO.getName());
            Category updatedCategory = categoryRepository.save(category);
            return categoryMapper.toCategoryDTO(updatedCategory);
        }
        return null;
    }

    public boolean deleteCategory(Integer id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
