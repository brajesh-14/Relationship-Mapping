package com.jpa.poc.JpaPoc.service;

import com.jpa.poc.JpaPoc.dto.AddressDto;
import com.jpa.poc.JpaPoc.dto.UserDto;
import com.jpa.poc.JpaPoc.entity.Address;
import com.jpa.poc.JpaPoc.entity.Languages;
import com.jpa.poc.JpaPoc.entity.Nationality;
import com.jpa.poc.JpaPoc.entity.User;
import com.jpa.poc.JpaPoc.repository.LanguageRepo;
import com.jpa.poc.JpaPoc.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private LanguageRepo languageRepo;


    public User getUser(Long userId){

        return userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<User> getCustomUser(String city, String gender){
        return userRepo.findAll().stream()
                .filter(user -> gender.equalsIgnoreCase(user.getGender()))
                .filter(user -> user.getAddress().stream()
                        .anyMatch(address -> city.equalsIgnoreCase(address.getCity())))
                .toList();
    }

    public List<User> getAllUsers(){

        return userRepo.findAll();
    }

    public User saveUser(UserDto userdto){
        User user = new User();

        user.setFirstName(userdto.getFirstName());
        user.setLastName(userdto.getLastName());
        user.setGender(userdto.getGender());

        Nationality nation = new Nationality();
        nation.setCountry(userdto.getNationality());
        nation.setUser(user);
        user.setNationality(nation);

        List<Address> addressList = new ArrayList<>();
        for(AddressDto addr : userdto.getAddressDto()){

            Address address = new Address();
            address.setVillage(addr.getVillage());
            address.setCity(addr.getCity());
            address.setState(addr.getState());
            address.setUser(user);
            addressList.add(address);
        }
        user.setAddress(addressList);

        List<Languages> languagesList = new ArrayList<>();
        for(String lang : userdto.getLanguages()){
            Languages langName = languageRepo.findByLanguage(lang);
            if(langName == null){
                langName = new Languages();
                langName.setLanguage(lang);
                languageRepo.save(langName);
            }
            languagesList.add(langName);
        }
        user.setLanguages(languagesList);
        return userRepo.save(user);
    }

}
