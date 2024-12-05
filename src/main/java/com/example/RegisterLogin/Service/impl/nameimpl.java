package com.example.RegisterLogin.Service.impl;


import com.example.RegisterLogin.DTO.NameDTO;
import com.example.RegisterLogin.Entity.Name;
import com.example.RegisterLogin.Repo.NameRepo;
import com.example.RegisterLogin.Service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class nameimpl  implements NameService {

    @Autowired
    private NameRepo nameRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addName(NameDTO nameDTO) {

        Name name = new Name(

                nameDTO.getId(),
                nameDTO.getName(),
                nameDTO.getEmail(),
                this.passwordEncoder.encode(nameDTO.getPassword())
        );
        nameRepo.save(name);

        return name.getName();
    }
}
