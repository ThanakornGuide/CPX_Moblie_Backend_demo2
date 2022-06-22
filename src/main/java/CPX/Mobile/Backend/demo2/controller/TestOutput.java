package CPX.Mobile.Backend.demo2.controller;

import CPX.Mobile.Backend.demo2.model.model_user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestControllerusername
public class TestOutput {

    @GetMapping("/test")
    public model_user demo() {

        model_user test_user = new model_user();
        
        return test_user;
    }

    @GetMapping("/test2")
    public String demo2() {

       String t = "test ttss";

        return t;
    }
}
