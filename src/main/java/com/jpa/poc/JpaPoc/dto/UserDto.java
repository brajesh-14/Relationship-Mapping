package com.jpa.poc.JpaPoc.dto;

import com.jpa.poc.JpaPoc.entity.Address;

import java.util.List;

public class UserDto {

    private String firstName;
    private String lastName;
    private String gender;
    private String about;

    private List<AddressDto> addressDto;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAbout() {
        return about;
    }

    public List<AddressDto> getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(List<AddressDto> addressDto) {
        this.addressDto = addressDto;
    }

    public void setAbout(String about) {
        this.about = about;


    }
}
