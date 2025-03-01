package com.spring_address_book_app_development.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressBookController {

    @GetMapping("/get")
    public ResponseEntity<String> getAddressBook() {
        return new ResponseEntity<> ("addressBook", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getAddressBookById(@PathVariable int id) {
        return new ResponseEntity<> ("addressBook", HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<String> postAddressBook(@RequestBody String address) {
        return new ResponseEntity<> ("addressBook", HttpStatus.OK);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> putAddressBook(@PathVariable int id) {
        return new ResponseEntity<> ("addressBook", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAddressBook() {
        return new ResponseEntity<> ("addressBook", HttpStatus.OK);
    }
}
