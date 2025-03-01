package com.spring_address_book_app_development.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressBookController {

    @GetMapping("/get")
    public String getAddressBook() {
        return "addressBook";
    }

    @PostMapping("/post")
    public String postAddressBook() {
        return "addressBook";
    }

    @PutMapping("/put")
    public String putAddressBook() {
        return "addressBook";
    }

    @DeleteMapping("/delete")
    public String deleteAddressBook() {
        return "addressBook";
    }
}
