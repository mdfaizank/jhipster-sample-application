package com.mycompany.myapp.repository.search;

import com.mycompany.myapp.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Product} entity.
 */
public interface ProductSearchRepository extends ElasticsearchRepository<Product, Long> {
}
