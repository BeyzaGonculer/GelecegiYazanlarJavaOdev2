package com.turkcell.repository;

import com.turkcell.entity.Customer;
import com.turkcell.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IRepository<Customer> {

    List<Customer> customers = new ArrayList<Customer>();

    public void save(Customer customer){

        customers.add(customer);
    }
}
