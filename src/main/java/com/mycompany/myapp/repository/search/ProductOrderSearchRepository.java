package com.mycompany.myapp.repository.search;

import com.mycompany.myapp.domain.ProductOrder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link ProductOrder} entity.
 */
public interface ProductOrderSearchRepository extends ElasticsearchRepository<ProductOrder, Long> {
}
