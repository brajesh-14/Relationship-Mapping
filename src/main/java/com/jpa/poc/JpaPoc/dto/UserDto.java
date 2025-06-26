package com.jpa.poc.JpaPoc.dto;

import com.jpa.poc.JpaPoc.entity.Nationality;

import java.util.List;

public class UserDto {

    private String firstName;
    private String lastName;
    private String gender;
    private String about;

    private List<AddressDto> addressDto;

    private String nationality;

    public UserDto(String firstName, String lastName, String gender, String about, List<AddressDto> addressDto, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.about = about;
        this.addressDto = addressDto;
        this.nationality = nationality;
    }

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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAbout(String about) {
        this.about = about;





    }
}
