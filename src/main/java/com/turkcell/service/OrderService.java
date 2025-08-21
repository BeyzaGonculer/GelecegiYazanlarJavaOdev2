package com.turkcell.service;

import com.turkcell.entity.Customer;
import com.turkcell.entity.Order;
import com.turkcell.entity.OrderItem;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.OrderRepository;
import com.turkcell.repository.ProductRepository;

import java.util.List;

public class OrderService {

    OrderRepository orderRepository;
    CustomerRepository customerRepository;
    ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;

    }


    public void add(List<OrderItem> orderItemList, Customer customer, Product product) {

        boolean isMessage = false;
        if(customerRepository.isCustomer(customer.getId())){

            if (productRepository.isProduct(product.getId())){
                for(OrderItem orderItem : orderItemList){
                    if(product.getId() == orderItem.getProductId()){
                        if(productRepository.stockControl(product.getId()) >= orderItem.getQuantity()){

                            product.setStock(product.getStock() - orderItem.getQuantity());
                            isMessage = true;
                        }
                    }
                }
                if(isMessage)
                    System.out.println("Güncel stok: " + product.getStock());


            }
            else {
                return;
            }
        }
        else{
            return;
        }


    }
}
