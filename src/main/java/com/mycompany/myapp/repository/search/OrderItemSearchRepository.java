package com.mycompany.myapp.repository.search;

import com.mycompany.myapp.domain.OrderItem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link OrderItem} entity.
 */
public interface OrderItemSearchRepository extends ElasticsearchRepository<OrderItem, Long> {
}
