package org.moldacom.online.shop.services;

import org.moldacom.online.shop.entities.Photo;
import org.moldacom.online.shop.entities.Product;
import org.moldacom.online.shop.transport.ProductDTO;
import org.springframework.stereotype.Component;

/**
 * Created by roxi on 20.02.2016.
 */
@Component
public class ProductConverter {

    public Product convert(ProductDTO productDTO){

        Product product = new Product();

        product.setName(productDTO.getProductName());
        product.setDescription(productDTO.getProductDescription());
        product.setCount(productDTO.getProductCount());
        product.setPrice(productDTO.getPrice());

        Photo photo = new Photo();

        photo.setName(productDTO.getPhotoName());
        photo.setData(productDTO.getData());
        photo.setHeight(productDTO.getPhotoHeight());
        photo.setWidth(productDTO.getPhotoWidth());
        product.setPhoto(photo);

        return product;
    }

    public ProductDTO convert(Product product){
        ProductDTO productDTO = new ProductDTO();

        productDTO.setData(product.getPhoto().getData());
        productDTO.setMimeType(product.getPhoto().getMimeType());
        productDTO.setPhotoHeight(product.getPhoto().getHeight());
        productDTO.setPhotoWidth(product.getPhoto().getWidth());
        productDTO.setPhotoName(product.getPhoto().getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setProductCount(product.getCount());
        productDTO.setProductDescription(product.getDescription());
        productDTO.setProductName(product.getName());

        return productDTO;
    }
}
