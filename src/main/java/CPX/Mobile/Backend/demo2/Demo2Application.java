package CPX.Mobile.Backend.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import CPX.Mobile.Backend.demo2.model.User;
import CPX.Mobile.Backend.demo2.repository.userRepository;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Autowired
	private userRepository uRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername("test1 ss");
		user.setLastName("lastName SSS");
		uRepository.save(user);


	}

}
