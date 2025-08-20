package com.turkcell;

import com.turkcell.entity.Customer;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.ProductRepository;
import com.turkcell.service.CustomerService;
import com.turkcell.service.ProductService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        Customer customer = new Customer();

        customer.setId(1);
        customer.setName("Beyza");
        customer.setEmail("beyza@gmail.com");
        customer.setPhone("123456789");

        customerService.add(customer);

        Product product = new Product();
        product.setId(1);
        product.setName("Orange");
        product.setPrice(11.10);
        product.setStock(50);

        productService.add(product);


    }
}