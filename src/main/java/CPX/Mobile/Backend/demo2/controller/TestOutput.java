package CPX.Mobile.Backend.demo2.controller;

import CPX.Mobile.Backend.demo2.model.model_user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOutput {

    @GetMapping("/test_output")
    public String demo() {

        model_user M_Uesr = new model_user();
        M_Uesr.setName("test");
        M_Uesr.setYear(123);

        return Uesr;
    }
}
