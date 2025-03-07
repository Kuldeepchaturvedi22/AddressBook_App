package com.spring_address_book_app_development.controller;

import com.spring_address_book_app_development.dto.AddressBookDTO;
import com.spring_address_book_app_development.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping
    public ResponseEntity<List<AddressBookDTO>> getAddressBook() {
        return addressBookService.getAddressBook();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookDTO> getAddressBookById(@PathVariable long id) {
        return addressBookService.getAddressBookById(id);
    }

    @PostMapping
    public ResponseEntity<String> postAddressBook(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.postAddressBook(addressBookDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> putAddressBook(@PathVariable long id, @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.putAddressBook(id, addressBookDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAddressBook(@PathVariable long id) {
        return addressBookService.deleteAddressBook(id);
    }
}