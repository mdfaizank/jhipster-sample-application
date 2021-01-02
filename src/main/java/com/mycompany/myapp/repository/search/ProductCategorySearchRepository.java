package com.mycompany.myapp.repository.search;

import com.mycompany.myapp.domain.ProductCategory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link ProductCategory} entity.
 */
public interface ProductCategorySearchRepository extends ElasticsearchRepository<ProductCategory, Long> {
}
