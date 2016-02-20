package org.moldacom.online.shop.webapp.controllers;

import org.moldacom.online.shop.services.ProductService;
import org.moldacom.online.shop.transport.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by roxi on 20.02.2016.
 */

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void save(@RequestBody ProductDTO productDTO){
        if(productDTO.isEmpty())
            return;
        productService.save(productDTO);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductDTO> get(){
        return productService.getAll();
    }
}
