package com.eazybytes.accounts.repository;


import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // Creates a bean
// needs to extend JpaRespository where <<EntityClass>, <data type of primary key>>
// Allows us to talk to the database without using SQL
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Auto configured since 'MobileNumber' matches entity class
    // This is called a derived name method
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
