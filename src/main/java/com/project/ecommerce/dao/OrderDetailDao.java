package com.project.ecommerce.dao;

import com.project.ecommerce.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailDao extends CrudRepository<OrderDetail,Integer> {
}
