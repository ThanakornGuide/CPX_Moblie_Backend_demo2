package CPX.Mobile.Backend.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CPX.Mobile.Backend.demo2.model.userModel;


@SpringBootApplication
@RestController
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World2") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/hello2")
	public String hello2() {
		userModel muser = userModel.builder().name("Thanakorn").subname("boohuadchai").build();

		return String.format("test : " + muser.toString());
	}

}
