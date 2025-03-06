package com.spring_address_book_app_development.service;

import com.spring_address_book_app_development.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {
    public ResponseEntity<String> getAddressBook() {
        return new ResponseEntity<>("addressBook", HttpStatus.OK);
    }

    public ResponseEntity<String> getAddressBookById(int id) {
        return new ResponseEntity<>("addressBook", HttpStatus.OK);
    }

    public ResponseEntity<AddressBookDTO> postAddressBook(AddressBookDTO addressBookDTO) {
        return new ResponseEntity<>(addressBookDTO, HttpStatus.OK);
    }

    public ResponseEntity<String> putAddressBook(int id) {
        return new ResponseEntity<>("addressBook", HttpStatus.OK);
    }

    public ResponseEntity<String> deleteAddressBook() {
        return new ResponseEntity<>("addressBook", HttpStatus.OK);
    }
}
