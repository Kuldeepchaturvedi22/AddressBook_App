package com.spring_address_book_app_development.controller;

import com.spring_address_book_app_development.dto.AddressBookDTO;
import com.spring_address_book_app_development.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping("/get")
    public ResponseEntity<String> getAddressBook() {
        return addressBookService.getAddressBook();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getAddressBookById(@PathVariable int id) {
        return addressBookService.getAddressBookById(id);
    }

    @PostMapping("/post")
    public ResponseEntity<AddressBookDTO> postAddressBook(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.postAddressBook(addressBookDTO);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> putAddressBook(@PathVariable int id) {
        return addressBookService.putAddressBook(id);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAddressBook() {
        return addressBookService.deleteAddressBook();
    }
}
