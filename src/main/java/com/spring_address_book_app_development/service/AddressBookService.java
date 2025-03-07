package com.spring_address_book_app_development.service;

import com.spring_address_book_app_development.dto.AddressBookDTO;
import com.spring_address_book_app_development.model.AddressBookModel;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    private List<AddressBookModel> addressBookModelList = new ArrayList<>();
    ModelMapper modelMapper = new ModelMapper();

    public ResponseEntity<List<AddressBookDTO>> getAddressBook() {
        List<AddressBookDTO> addressBookDTOList = new ArrayList<>();
        for (AddressBookModel addressBookModel : addressBookModelList) {
            AddressBookDTO addressBookDTO = modelMapper.map(addressBookModel, AddressBookDTO.class);
            addressBookDTOList.add(addressBookDTO);
        }
        return new ResponseEntity<>(addressBookDTOList, HttpStatus.OK);
    }

    public ResponseEntity<AddressBookDTO> getAddressBookById(long id) {
        for (AddressBookModel addressBookModel : addressBookModelList) {
            if (id == addressBookModel.getId()) {
                AddressBookDTO addressBookDTO = modelMapper.map(addressBookModel, AddressBookDTO.class);
                return new ResponseEntity<>(addressBookDTO, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> postAddressBook(AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel = modelMapper.map(addressBookDTO, AddressBookModel.class);
        addressBookModelList.add(addressBookModel);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    public ResponseEntity<String> putAddressBook(long id, AddressBookDTO addressBookDTO) {
        for (int i = 0; i < addressBookModelList.size(); i++) {
            if (id == addressBookModelList.get(i).getId()) {
                AddressBookModel addressBookModel = modelMapper.map(addressBookDTO, AddressBookModel.class);
                addressBookModelList.set(i, addressBookModel);
                return new ResponseEntity<>("Updated", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> deleteAddressBook(long id) {
        for (int i = 0; i < addressBookModelList.size(); i++) {
            if (id == addressBookModelList.get(i).getId()) {
                addressBookModelList.remove(i);
                return new ResponseEntity<>("Deleted", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }
}
