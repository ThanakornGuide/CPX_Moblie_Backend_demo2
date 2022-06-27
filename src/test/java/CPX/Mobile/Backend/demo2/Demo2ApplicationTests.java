package CPX.Mobile.Backend.demo2;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import CPX.Mobile.Backend.demo2.controller.userController;
import CPX.Mobile.Backend.demo2.dto.userDAO;
import CPX.Mobile.Backend.demo2.model.userModel;

@SpringBootTest
class Demo2ApplicationTests {

	@InjectMocks
	userController uController;

	@Mock
	userDAO uDao;

	@Test
	void contextLoads() {
	}

	@Test
    public void testFindAll() 
    {
		// given
		userModel user1 = new userModel(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
		userModel user2 = new userModel(2, "Alex", "Gussin", "example@gmail.com");
		userModel users = new userModel();

		// users.setEmployeeList(Arrays.asList(user1, user2));

		// when(uDao.getAllUser()).thenReturn(users);

		// // when
		// Employees result = employeeController.getEmployees();

		// // then
		// assertThat(result.getEmployeeList().size()).isEqualTo(2);
		
		// assertThat(result.getEmployeeList().get(0).getFirstName())
		// 				.isEqualTo(employee1.getFirstName());
		
		// assertThat(result.getEmployeeList().get(1).getFirstName())
		// 				.isEqualTo(employee2.getFirstName());
	}
}
