package com.turkcell;

import com.turkcell.entity.Customer;
import com.turkcell.entity.Order;
import com.turkcell.entity.OrderItem;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.OrderRepository;
import com.turkcell.repository.ProductRepository;
import com.turkcell.service.CustomerService;
import com.turkcell.service.OrderService;
import com.turkcell.service.ProductService;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        OrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(orderRepository, customerRepository, productRepository);


        Customer customer = new Customer();

        customer.setId(1);
        customer.setName("Beyza");
        customer.setEmail("beyza@gmail.com");
        customer.setPhone("123456789");

        Customer customer2 = new Customer();

        customer.setId(2);
        customer.setName("Buse");
        customer.setEmail("buse@gmail.com");
        customer.setPhone("123456789");

        customerService.add(customer);
        customerService.search("Beyza");
        customerService.search("Buse");


        Product product = new Product();
        product.setId(1);
        product.setName("Orange");
        product.setPrice(11.10);
        product.setStock(50);

        Product product2 = new Product();
        product.setId(2);
        product.setName("Apple");
        product.setPrice(10.00);
        product.setStock(40);

        productService.add(product);
        productService.stockControl("orange");
        productService.stockControl("elma");

        List<OrderItem> orderItems = new ArrayList<>();
        List<OrderItem> orderItems2 = new ArrayList<>();

        OrderItem item1 = new OrderItem(1, 2, 22.20);
        OrderItem item2 = new OrderItem(1, 3, 33.30);
        OrderItem item3 = new OrderItem(2, 1, 10.00);
        OrderItem item4 = new OrderItem(1, 4, 44.40);
        OrderItem item5 = new OrderItem(2, 5, 50.30);

        orderItems.add(item1);
        orderItems.add(item2);
        orderItems2.add(item3);
        orderItems.add(item4);
        orderItems2.add(item5);



        Order order = new Order();

        orderService.add(orderItems, customer, product);
        orderService.add(orderItems2, customer2, product2);



    }
}