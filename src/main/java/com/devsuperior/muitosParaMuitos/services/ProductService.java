package com.devsuperior.muitosParaMuitos.services;

import com.devsuperior.muitosParaMuitos.dto.CategoryDTO;
import com.devsuperior.muitosParaMuitos.dto.ProductDTO;
import com.devsuperior.muitosParaMuitos.entities.Category;
import com.devsuperior.muitosParaMuitos.entities.Product;
import com.devsuperior.muitosParaMuitos.repositories.CategoryRepository;
import com.devsuperior.muitosParaMuitos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());

        for (CategoryDTO catDto: dto.getCategories()) {
            //Category cat = new Category();
            //cat.setId(catDto.getId());
            Category cat = categoryRepository.getReferenceById(catDto.getId());
            product.getCategories().add(cat);
        }
        product = productRepository.save(product);
        return new ProductDTO(product);
    }


}
