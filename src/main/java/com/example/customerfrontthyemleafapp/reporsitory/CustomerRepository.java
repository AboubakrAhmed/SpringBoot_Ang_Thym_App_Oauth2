package com.example.customerfrontthyemleafapp.reporsitory;

import com.example.customerfrontthyemleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
