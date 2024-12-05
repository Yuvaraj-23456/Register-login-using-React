package com.example.RegisterLogin.NameController;


import com.example.RegisterLogin.DTO.NameDTO;
import com.example.RegisterLogin.Service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/name")




public class NameController {

    @Autowired
    private NameService NameService;


    @PostMapping(path="/save")
    public String saveName(@RequestBody NameDTO NameDTO)
    {
        String id  = NameService.addName(NameDTO);
        return id;
    }


}
