package com.spring_address_book_app_development.dto;

public class AddressBookDTO {
    private long id;
    private String address;

    public void setId(long id) {
        this.id = id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
}
