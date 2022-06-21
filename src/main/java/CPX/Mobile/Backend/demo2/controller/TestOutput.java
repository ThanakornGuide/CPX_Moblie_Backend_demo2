package CPX.Mobile.Backend.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestOutput {
    @GetMapping("/test_output")
    public String demo() {
        return "Hello Backend Team";
    }
}
