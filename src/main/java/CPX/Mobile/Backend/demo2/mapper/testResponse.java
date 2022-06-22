package CPX.Mobile.Backend.demo2.mapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CPX.Mobile.Backend.demo2.controller.userController;

@RestController
@RequestMapping("/api")
public class testResponse {
    
    @GetMapping
    @RequestMapping("/v1/GetTest")
    public String GetTesResponse(){

        return("ss");
    }

    @GetMapping
    @RequestMapping("/v1/GetNameUser")
    public String GetNameUser(){

        userController ss = new userController();
        return ss.outputSS();
        
    }



}
