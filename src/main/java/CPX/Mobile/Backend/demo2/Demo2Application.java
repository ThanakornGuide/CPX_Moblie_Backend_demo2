package CPX.Mobile.Backend.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import CPX.Mobile.Backend.demo2.model.userModel;


@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@GetMapping("/hello2")
	public String hello2() {
		userModel muser = userModel.builder().name("Thanakorn").subname("boohuadchai").build();

		return String.format("test : " + muser.toString());
	}

}
