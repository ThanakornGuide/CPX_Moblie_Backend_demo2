package CPX.Mobile.Backend.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestOutput {

    @GetMapping("/test2")
    public String demo2() {

       String t = "test ttss";

        return t;
    }
}
