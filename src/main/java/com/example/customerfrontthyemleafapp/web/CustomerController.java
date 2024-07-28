package com.example.customerfrontthyemleafapp.web;


import com.example.customerfrontthyemleafapp.entities.Customer;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.ui.Model;
import com.example.customerfrontthyemleafapp.reporsitory.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.Authenticator;
import java.util.List;

@Controller
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping("/customers")
    public String customers(Model model){
        List<Customer> customerList = customerRepository.findAll();
        model.addAttribute("customer",customerList);
        return "customers";
    }
    @GetMapping("/products")
    public String products(Model model){
        return "products";
    }
    @GetMapping("/auth")
    @ResponseBody
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }


}
