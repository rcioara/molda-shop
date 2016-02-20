package org.moldacom.online.shop.services;

import org.moldacom.online.shop.entities.Product;
import org.moldacom.online.shop.repositories.PhotoRepository;
import org.moldacom.online.shop.repositories.ProductRepository;
import org.moldacom.online.shop.transport.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by roxi on 20.02.2016.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PhotoRepository photoRepository;

    @Autowired
    private ProductConverter productConverter;

    public void save(ProductDTO productDTO){
        Product product = productConverter.convert(productDTO);
        productRepository.save(product);
    }

    public List<ProductDTO> getAll() {
        return productRepository.findAll()
                .stream()
                .map(p -> productConverter.convert(p))
                .collect(Collectors.<ProductDTO>toList());
    }
}

