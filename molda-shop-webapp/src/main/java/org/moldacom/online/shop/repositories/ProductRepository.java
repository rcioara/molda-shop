package org.moldacom.online.shop.repositories;

import org.moldacom.online.shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by roxi on 20.02.2016.
 */

public interface ProductRepository extends JpaRepository<Product, Long> {
}
