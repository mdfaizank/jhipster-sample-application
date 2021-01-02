package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.ProductCategory;
import com.mycompany.myapp.repository.ProductCategoryRepository;
import com.mycompany.myapp.repository.search.ProductCategorySearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing {@link ProductCategory}.
 */
@Service
@Transactional
public class ProductCategoryService {

    private final Logger log = LoggerFactory.getLogger(ProductCategoryService.class);

    private final ProductCategoryRepository productCategoryRepository;

    private final ProductCategorySearchRepository productCategorySearchRepository;

    public ProductCategoryService(ProductCategoryRepository productCategoryRepository, ProductCategorySearchRepository productCategorySearchRepository) {
        this.productCategoryRepository = productCategoryRepository;
        this.productCategorySearchRepository = productCategorySearchRepository;
    }

    /**
     * Save a productCategory.
     *
     * @param productCategory the entity to save.
     * @return the persisted entity.
     */
    public ProductCategory save(ProductCategory productCategory) {
        log.debug("Request to save ProductCategory : {}", productCategory);
        ProductCategory result = productCategoryRepository.save(productCategory);
        productCategorySearchRepository.save(result);
        return result;
    }

    /**
     * Get all the productCategories.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<ProductCategory> findAll() {
        log.debug("Request to get all ProductCategories");
        return productCategoryRepository.findAll();
    }


    /**
     * Get one productCategory by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<ProductCategory> findOne(Long id) {
        log.debug("Request to get ProductCategory : {}", id);
        return productCategoryRepository.findById(id);
    }

    /**
     * Delete the productCategory by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete ProductCategory : {}", id);
        productCategoryRepository.deleteById(id);
        productCategorySearchRepository.deleteById(id);
    }

    /**
     * Search for the productCategory corresponding to the query.
     *
     * @param query the query of the search.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<ProductCategory> search(String query) {
        log.debug("Request to search ProductCategories for query {}", query);
        return StreamSupport
            .stream(productCategorySearchRepository.search(queryStringQuery(query)).spliterator(), false)
        .collect(Collectors.toList());
    }
}
