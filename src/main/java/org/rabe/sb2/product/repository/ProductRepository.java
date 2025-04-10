package org.rabe.sb2.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.rabe.sb2.product.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}