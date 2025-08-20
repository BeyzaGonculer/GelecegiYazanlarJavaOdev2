package com.turkcell.service;

import com.turkcell.entity.Customer;
import com.turkcell.entity.Order;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.OrderRepository;

public class OrderService {

    OrderRepository orderRepository;
    CustomerRepository customerRepository;

    public OrderService(OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }


    public void add(Order order, Customer customer) {
        if(order.getOrderItemList().size() < 1){
            System.out.println("Yeterli sayıda ürün girmediniz");
            return;
        }
        if(order.getCustomerId() != customer.getId())
            return;

        orderRepository.save(order);
        System.out.println("Ürünleriniz başarıyla eklendi");
    }
}
